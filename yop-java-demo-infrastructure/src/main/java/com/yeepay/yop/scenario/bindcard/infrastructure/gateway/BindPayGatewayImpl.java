/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.gateway;

import com.yeepay.yop.scenario.bindcard.domain.gateway.BindPayGateway;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.FrontcashierClient;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.FrontcashierClientBuilder;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindpayConfirmRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindpayRequestRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindpaySendsmsRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindpayConfirmResponse;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindpayRequestResponse;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindpaySendsmsResponse;
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
 * @since 2023/9/25 18:11
 */
@Component
@Slf4j
public class BindPayGatewayImpl implements BindPayGateway {
    // 该Client线程安全，请使用单例模式，多次请求共用
    private static FrontcashierClient api = FrontcashierClientBuilder.builder().build();

    @Override
    public BindpayRequestResponse bindPayRequest(BindpayRequestRequest request) {
        BindpayRequestResponse response = api.bindpayRequest(request);
        log.info("send bind-pay request, result:{}", response.getResult());
        return response;
    }

    @Override
    public BindpaySendsmsResponse bindpaySendsms(BindpaySendsmsRequest request) {
        BindpaySendsmsResponse response = api.bindpaySendsms(request);
        log.info("bind-pay send sms, result:{}", response.getResult());
        return response;
    }

    @Override
    public BindpayConfirmResponse bindPayConfirm(BindpayConfirmRequest request) {
        BindpayConfirmResponse response = api.bindpayConfirm(request);
        log.info("bind-pay confirm, result:{}", response.getResult());
        return response;
    }
}
