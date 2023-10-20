/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.client.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/10/9 11:54
 */
@Data
public class BindcardConfirmV2RequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String parentMerchantNo;

    private String merchantNo;

    private String merchantFlowId;

    private String smsCode;

}
