/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.service;

import com.yeepay.yop.scenario.bindcard.client.dto.BindcardConfirmV2RequestDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.BindcardRequestV2RequestDTO;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/25 14:31
 */
public interface BindCardAppService {
    /**
     * 绑卡请求
     *
     * @param bindcardRequestV2RequestDTO
     */
    void request(BindcardRequestV2RequestDTO bindcardRequestV2RequestDTO) throws Exception;

    /**
     * 绑卡-短验确认
     *
     * @param bindcardConfirmV2RequestDTO
     */
    void confirm(BindcardConfirmV2RequestDTO bindcardConfirmV2RequestDTO) throws Exception;
}
