/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.gateway;

import com.yeepay.yop.scenario.bindcard.domain.gateway.OrderGateway;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.TradeClient;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.TradeClientBuilder;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.request.OrderQueryRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.request.OrderRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.response.OrderQueryResponse;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.response.OrderResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/22 16:15
 */
@Component
@Slf4j
public class OrderGatewayImpl implements OrderGateway {

    // 该Client线程安全，请使用单例模式，多次请求共用
    private static TradeClient api = TradeClientBuilder.builder().build();

    @Override
    public OrderResponse createOrder(OrderRequest request) {
        OrderResponse response = api.order(request);
        log.info("create order, result:{}", response.getResult());
        return response;
    }

    @Override
    public OrderQueryResponse orderQuery(OrderQueryRequest request) {
        OrderQueryResponse response = api.orderQuery(request);
        log.info("query order, result:{}", response.getResult());
        return response;
    }
}
