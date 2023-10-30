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
 * @since 2023/9/25 20:21
 */
@Data
public class BindpayConfirmRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String token;

    private String version;

    private String verifyCode;

    private String cardno;

    private String owner;

    private String idno;

    private String phoneNo;

    private String ypMobile;

    private String avlidDate;

    private String cvv2;

    private String idCardType;

    private String bankPWD;

    private String userNo;

}
