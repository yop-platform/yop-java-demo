/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.event.handler;

import com.yeepay.yop.scenario.bindcard.domain.model.order.Order;
import com.yeepay.yop.scenario.bindcard.domain.model.order.enums.OrderStatus;
import com.yeepay.yop.scenario.bindcard.domain.service.OrderService;
import com.yeepay.yop.sdk.service.common.callback.YopCallback;
import com.yeepay.yop.sdk.utils.JsonUtils;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/26 15:07
 */
@Component
@Slf4j
public class BindPayCallbackHandler extends YopBaseCallbackHandler {
    private static final String SUCCESS = "SUCCESS";
    private static final String PROCESSING = "PROCESSING";

    @Setter(onMethod_ = @Autowired)
    private OrderService orderService;

    /**
     * 支付结果的通知地址
     *
     * @return
     */
    @Override
    public String getType() {
        return "/rest/bind-pay/call-back/result";
    }

    @Override
    public void handle(YopCallback yopCallback) {
        log.info("bind-pay notify handle:{}", yopCallback);
        String appKey = yopCallback.getAppKey();
        String bizData = yopCallback.getBizData();
        Map<String, Object> map = JsonUtils.fromJsonString(bizData, Map.class);
        String orderId = (String) map.get("orderId");
        String uniqueOrderNo = (String) map.get("uniqueOrderNo");
        String orderAmount = (String) map.get("orderAmount");
        String payAmount = (String) map.get("payAmount");
        if (ObjectUtils.isEmpty(map.get("payerInfo"))) {
            log.error("payer info not found.");
        }
        String parentMerchantNo = (String) map.get("parentMerchantNo");
        String merchantNo = (String) map.get("merchantNo");
        String status = (String) map.get("status");
        //同步订单状态
        Order order = orderService.detail(orderId);
        if (SUCCESS.equals(status)) {
            order.setStatus(OrderStatus.PAYED.name());
            orderService.update(order);
        } else if (!PROCESSING.equals(status)) {
            //如果状态不是SUCCESS和PROCESSING，状态改为“已取消”
            log.info("order status is:{}", status);
            order.setStatus(OrderStatus.CANCEL.name());
            orderService.update(order);
        }
    }
}
