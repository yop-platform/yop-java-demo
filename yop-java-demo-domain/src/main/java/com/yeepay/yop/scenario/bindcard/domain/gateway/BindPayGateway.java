/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.gateway;

import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindpayConfirmRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindpayRequestRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindpaySendsmsRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindpayConfirmResponse;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindpayRequestResponse;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindpaySendsmsResponse;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/25 18:09
 */
public interface BindPayGateway {
    /**
     * 支付下单
     *
     * @param request
     * @return
     */
    public BindpayRequestResponse bindPayRequest(BindpayRequestRequest request);

    /**
     * 请求发短验
     *
     * @param bindpaySendsmsRequest
     * @return
     */
    BindpaySendsmsResponse bindpaySendsms(BindpaySendsmsRequest bindpaySendsmsRequest);

    /**
     * 确认支付
     *
     * @param bindpayConfirmRequest
     * @return
     */
    BindpayConfirmResponse bindPayConfirm(BindpayConfirmRequest bindpayConfirmRequest);
}
