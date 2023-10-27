/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.scheduler;

import com.yeepay.yop.scenario.bindcard.domain.gateway.OrderGateway;
import com.yeepay.yop.scenario.bindcard.domain.model.order.Order;
import com.yeepay.yop.scenario.bindcard.domain.model.order.enums.OrderStatus;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.request.OrderQueryRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.response.OrderQueryResponse;
import com.yeepay.yop.scenario.bindcard.domain.service.OrderService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/26 10:54
 */
@EnableAsync
@Component
@Slf4j
public class OrderSchedule {
    private static final String SUCCESS = "SUCCESS";
    private static final String PROCESSING = "PROCESSING";

    @Setter(onMethod_ = @Autowired)
    private OrderGateway orderGateway;
    @Setter(onMethod_ = @Autowired)
    private OrderService orderService;

    /**
     * 每5秒调用易宝查询订单接口。商户可以自行实现分布式定时任务
     */
    @Async
    @Scheduled(cron = "0/5 * * * * ?")
    public void taskOrderQuery() {
        try {
            //查询所有的订单，将”支付中“的订单，同步为“已支付”的订单状态
            List<Order> orderList = orderService.listAll();
            for (Order order : orderList) {
                String prevStatus = order.getStatus();
                if (OrderStatus.PROCESSING.name().equals(prevStatus)) {
                    OrderQueryRequest request = new OrderQueryRequest();
                    request.setOrderId(order.getId());
                    request.setParentMerchantNo(order.getParentMerchantNo());
                    request.setMerchantNo(order.getMerchantNo());
                    OrderQueryResponse response = orderGateway.orderQuery(request);
                    if (ObjectUtils.isNotEmpty(response) && "OPR00000".equals(response.getResult().getCode())) {
                        log.info("update order status by schedule, orderId:{}, status:{}", order.getId(), response.getResult().getStatus());
                        if (SUCCESS.equals(response.getResult().getStatus())) {
                            order.setStatus(OrderStatus.PAYED.name());
                            orderService.updateByUserIdAndToken(order);
                        } else if (!PROCESSING.equals(response.getResult().getStatus())) {
                            //如果状态不是SUCCESS和PROCESSING，状态改为“已取消”
                            order.setStatus(OrderStatus.CANCEL.name());
                            orderService.update(order);
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error("Unexpected exception occurred. exception:{}", e);

        }
    }
}
