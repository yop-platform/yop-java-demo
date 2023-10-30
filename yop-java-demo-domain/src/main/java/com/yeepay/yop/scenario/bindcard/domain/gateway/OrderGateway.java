/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.gateway;

import com.yeepay.yop.scenario.bindcard.domain.model.trade.request.OrderQueryRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.request.OrderRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.response.OrderQueryResponse;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.response.OrderResponse;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/22 16:13
 */
public interface OrderGateway {
    /**
     * 下单
     *
     * @param request
     * @return
     */
    OrderResponse createOrder(OrderRequest request);

    /**
     * 查询订单
     *
     * @param request
     * @return
     */
    OrderQueryResponse orderQuery(OrderQueryRequest request);
}
