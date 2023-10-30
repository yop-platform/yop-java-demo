/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.gateway;

import com.yeepay.yop.scenario.bindcard.domain.gateway.BindCardGateway;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.FrontcashierClient;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.FrontcashierClientBuilder;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindcardConfirmV2Request;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindcardRequestV2Request;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindcardConfirmV2Response;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindcardRequestV2Response;
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
 * @since 2023/10/9 11:42
 */
@Component
@Slf4j
public class BindCardGatewayImpl implements BindCardGateway {
    // 该Client线程安全，请使用单例模式，多次请求共用
    private static FrontcashierClient api = FrontcashierClientBuilder.builder().build();

    @Override
    public BindcardRequestV2Response bindCardRequest(BindcardRequestV2Request request) {
        BindcardRequestV2Response response = api.bindcardRequestV2(request);
        log.info("send bind-card request, result:{}", response.getResult());
        return response;
    }

    @Override
    public BindcardConfirmV2Response bindCardConfirm(BindcardConfirmV2Request request) {
        BindcardConfirmV2Response response = api.bindcardConfirmV2(request);
        log.info("bind-card confirm, result:{}", response.getResult());
        return response;
    }
}
