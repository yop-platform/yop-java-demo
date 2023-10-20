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
 * @since 2023/9/25 15:37
 */
@Data
public class OrderRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String parentMerchantNo;

    private String merchantNo;

    private String orderId;

    private String orderAmount;

    private String goodsName;

    private String fundProcessType;

    private String notifyUrl;

    private String memo;

    private String subOrderDetail;

    private String expiredTime;

    private String redirectUrl;

    private String csUrl;

    private String businessInfo;

    private String terminalInfo;

    private String ypPromotionInfo;

    private String payerInfo;

    private String payMerchantNo;

    private String productInfo;

    private String userId;

}
