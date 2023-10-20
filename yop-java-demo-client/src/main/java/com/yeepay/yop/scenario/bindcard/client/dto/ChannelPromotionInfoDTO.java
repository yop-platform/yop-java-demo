/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/10/10 16:40
 */
@Data
public class ChannelPromotionInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 优惠券编码
     */
    @JsonProperty("promotionId")
    private String promotionId = null;

    /**
     * 优惠券名称
     */
    @JsonProperty("promotionName")
    private String promotionName = null;

    /**
     * 优惠券范围(全场、单品)
     */
    @JsonProperty("promotionScope")
    private String promotionScope = null;

    /**
     * 优惠券金额
     */
    @JsonProperty("amount")
    private BigDecimal amount = null;

    /**
     * 优惠券活动id
     */
    @JsonProperty("activityId")
    private String activityId = null;

    /**
     * 渠道出资
     */
    @JsonProperty("channelContribute")
    private String channelContribute = null;

    /**
     * 商户出资
     */
    @JsonProperty("merchantContribute")
    private String merchantContribute = null;

    /**
     * 其他出资
     */
    @JsonProperty("otherContribute")
    private String otherContribute = null;

    /**
     * 备注信息
     */
    @JsonProperty("memo")
    private String memo = null;

}
