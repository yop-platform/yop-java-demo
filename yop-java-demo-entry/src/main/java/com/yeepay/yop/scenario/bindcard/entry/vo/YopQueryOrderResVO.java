/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.vo;

import com.yeepay.yop.scenario.bindcard.client.dto.ChannelPromotionInfoDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.PayerInfoDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.YpPromotionInfoDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/10/10 18:27
 */
@Data
public class YopQueryOrderResVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "返回码")
    private String code;

    @ApiModelProperty(value = "返回信息")
    private String message;

    @ApiModelProperty(value = "系统编号")
    private String bizSystemNo;

    @ApiModelProperty(value = "交易发起方商编")
    private String parentMerchantNo;

    @ApiModelProperty(value = "收款商户编号")
    private String merchantNo;

    @ApiModelProperty(value = "商户收款请求号")
    private String orderId;

    @ApiModelProperty(value = "易宝收款订单号")
    private String uniqueOrderNo;

    @ApiModelProperty(value = "订单状态")
    private String status;

    @ApiModelProperty(value = "订单金额.单位:元")
    private BigDecimal orderAmount;

    @ApiModelProperty(value = "用户支付金额,单位:元")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "商户手续费")
    private BigDecimal merchantFee;

    @ApiModelProperty(value = "用户手续费,用户付费场景下返回.单位:元")
    private BigDecimal customerFee;

    @ApiModelProperty(value = "支付成功时间")
    private String paySuccessDate;

    @ApiModelProperty(value = "对账备注")
    private String memo;

    @ApiModelProperty(value = "支付方式")
    private String payWay;

    @ApiModelProperty(value = "支付授权token")
    private String token;

    @ApiModelProperty(value = "分账都订单标识")
    private String fundProcessType;

    @ApiModelProperty(value = "银行订单号")
    private String bankOrderId;

    @ApiModelProperty(value = "渠道订单号")
    private String channelOrderId;

    @ApiModelProperty(value = "渠道类型")
    private String channel;

    @ApiModelProperty(value = "用户实际支付金额")
    private BigDecimal realPayAmount;

    @ApiModelProperty(value = "剩余可分账金额(用于分账的场景)")
    private BigDecimal unSplitAmount;

    @ApiModelProperty(value = "付款信息")
    private PayerInfoDTO payerInfo;

    @ApiModelProperty(value = "渠道侧优惠列表")
    private List<ChannelPromotionInfoDTO> channelPromotionInfo;

    @ApiModelProperty(value = "易宝优惠列表")
    private List<YpPromotionInfoDTO> ypPromotionInfo;

}
