/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.service.impl;


import com.yeepay.yop.scenario.bindcard.app.converter.OrderDTOConverter;
import com.yeepay.yop.scenario.bindcard.app.converter.OrderRequestDTOConverter;
import com.yeepay.yop.scenario.bindcard.app.converter.YopCreateOrderV2ResDTOConverter;
import com.yeepay.yop.scenario.bindcard.app.converter.YopQueryOrderResDTOConverter;
import com.yeepay.yop.scenario.bindcard.app.service.OrderAppService;
import com.yeepay.yop.scenario.bindcard.client.dto.OrderDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.OrderRequestDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.YopCreateOrderV2ResDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.YopQueryOrderResDTO;
import com.yeepay.yop.scenario.bindcard.domain.gateway.OrderGateway;
import com.yeepay.yop.scenario.bindcard.domain.model.order.Order;
import com.yeepay.yop.scenario.bindcard.domain.model.order.enums.OrderStatus;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.model.YopCreateOrderV2Res;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.model.YopQueryOrderRes;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.request.OrderQueryRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.request.OrderRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.response.OrderQueryResponse;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.response.OrderResponse;
import com.yeepay.yop.scenario.bindcard.domain.service.OrderService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * title: 订单应用服务实现<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Service
@Slf4j
public class OrderAppServiceImpl implements OrderAppService {

    @Setter(onMethod_ = @Autowired)
    private OrderService orderService;

    @Setter(onMethod_ = @Autowired)
    private OrderGateway orderGateway;

    @Override
    public YopCreateOrderV2ResDTO create(OrderRequestDTO orderRequestDTO) throws Exception {
        //调API，下单
        OrderRequest orderRequest = OrderRequestDTOConverter.INSTANCE.to(orderRequestDTO);
        OrderResponse response = orderGateway.createOrder(orderRequest);
        YopCreateOrderV2Res result = response.getResult();
        if (!"OPR00000".equals(result.getCode())) {
            log.error("create order failure, msg: {}", result.getMessage());
            throw new Exception("create order failure, msg: " + result.getMessage());
        }
        //保存订单
        Order order = new Order();
        order.setId(orderRequestDTO.getOrderId());
        order.setUserId(orderRequestDTO.getUserId());
        order.setParentMerchantNo(orderRequestDTO.getParentMerchantNo());
        order.setMerchantNo(orderRequestDTO.getMerchantNo());
        order.setStatus(OrderStatus.INIT.name());
        order.setToken(result.getToken());
        order.setPrice(new BigDecimal(orderRequestDTO.getOrderAmount()));
        orderService.create(order);
        return YopCreateOrderV2ResDTOConverter.INSTANCE.from(result);
    }

    @Override
    public void delete(String id) {
        // TODO 待实现
    }

    @Override
    public Boolean update(OrderDTO orderDTO) {
        return null;// TODO 待实现
    }

    @Override
    public OrderDTO detail(String id) {
        return OrderDTOConverter.INSTANCE.from(orderService.detail(id));
    }

    @Override
    public List<OrderDTO> list(String userId, String merchantNo) {
        return OrderDTOConverter.INSTANCE.from(orderService.listByUserIdAndMerchantNo(userId, merchantNo));
    }

    @Override
    public YopQueryOrderResDTO query(String parentMerchantNo, String merchantNo, String orderId) throws Exception {
        OrderQueryRequest orderQueryRequest = new OrderQueryRequest();
        orderQueryRequest.setMerchantNo(merchantNo);
        orderQueryRequest.setParentMerchantNo(parentMerchantNo);
        orderQueryRequest.setOrderId(orderId);
        OrderQueryResponse response = orderGateway.orderQuery(orderQueryRequest);
        if (ObjectUtils.isEmpty(response)) {
            log.error("invoke orderQuery api failure.");
            throw new Exception("invoke orderQuery api failure.");
        }
        YopQueryOrderRes result = response.getResult();
        YopQueryOrderResDTO yopQueryOrderResDTO = YopQueryOrderResDTOConverter.INSTANCE.from(result);
        return yopQueryOrderResDTO;
    }


}
