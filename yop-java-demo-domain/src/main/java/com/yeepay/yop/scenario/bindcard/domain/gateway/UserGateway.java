/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.gateway;

import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindcardBindcardlistRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindcardBindcardlistResponse;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/25 16:45
 */
public interface UserGateway {
    /**
     * 查询签约/绑卡列表
     *
     * @param request
     * @return
     */
    BindcardBindcardlistResponse bindCardList(BindcardBindcardlistRequest request);
}
