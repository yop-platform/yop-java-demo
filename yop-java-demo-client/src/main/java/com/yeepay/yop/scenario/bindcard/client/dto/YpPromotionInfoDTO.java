/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
 * @since 2023/10/10 16:41
 */
@Data
public class YpPromotionInfoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 营销活动编号
     */
    @JsonProperty("marketNo")
    private String marketNo = null;

    /**
     * 营销订单号
     */
    @JsonProperty("subsidyOrderNo")
    private String subsidyOrderNo = null;

    /**
     * 营销类型&lt;br&gt;CUSTOM_REDUCTION:自定义金额立减CUSTOM_ALLOWANCE:自定义金额补贴
     */
    @JsonProperty("type")
    private String type = null;

    /**
     * 营销金额
     */
    @JsonProperty("amount")
    private String amount = null;

    /**
     * 出资方商编
     */
    @JsonProperty("contributeMerchant")
    private String contributeMerchant = null;

    /**
     * 营销状态
     */
    @JsonProperty("status")
    private String status = null;
}
