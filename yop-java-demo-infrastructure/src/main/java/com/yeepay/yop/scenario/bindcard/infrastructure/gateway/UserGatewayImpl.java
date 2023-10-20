/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.gateway;

import com.yeepay.yop.scenario.bindcard.domain.gateway.UserGateway;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.FrontcashierClient;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.FrontcashierClientBuilder;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindcardBindcardlistRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindcardBindcardlistResponse;
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
 * @since 2023/9/25 16:46
 */
@Component
@Slf4j
public class UserGatewayImpl implements UserGateway {
    // 该Client线程安全，请使用单例模式，多次请求共用
    private static FrontcashierClient api = FrontcashierClientBuilder.builder().build();

    @Override
    public BindcardBindcardlistResponse bindCardList(BindcardBindcardlistRequest request) {
        BindcardBindcardlistResponse response = api.bindcardBindcardlist(request);
        log.info("query bind-card-list, result:{}", response.getResult());
        return response;
    }
}
