/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.gateway;

import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindcardConfirmV2Request;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindcardRequestV2Request;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindcardConfirmV2Response;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindcardRequestV2Response;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/10/9 11:36
 */
public interface BindCardGateway {

    /**
     * 绑卡请求
     *
     * @param request
     * @return
     */
    public BindcardRequestV2Response bindCardRequest(BindcardRequestV2Request request);

    /**
     * 绑卡-短验确认
     *
     * @param request
     * @return
     */
    public BindcardConfirmV2Response bindCardConfirm(BindcardConfirmV2Request request);


}
