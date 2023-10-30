/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
 * @since 2023/10/10 16:36
 */
@Data
public class YopQueryOrderResDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回码&lt;br&gt;OPR00000 成功
     */
    @JsonProperty("code")
    private String code = null;

    /**
     * 返回信息
     */
    @JsonProperty("message")
    private String message = null;

    /**
     * 未命名
     */
    @JsonProperty("bizSystemNo")
    private String bizSystemNo = null;

    /**
     * 交易发起方商编
     */
    @JsonProperty("parentMerchantNo")
    private String parentMerchantNo = null;

    /**
     * 收款商户编号
     */
    @JsonProperty("merchantNo")
    private String merchantNo = null;

    /**
     * 商户收款请求号
     */
    @JsonProperty("orderId")
    private String orderId = null;

    /**
     * 易宝收款订单号&lt;br&gt;&lt;span style&#x3D;\&quot;font-family: Arial, sans-serif;\&quot;&gt;易宝收款订单号&lt;/span&gt;
     */
    @JsonProperty("uniqueOrderNo")
    private String uniqueOrderNo = null;

    /**
     * 订单状态&lt;br&gt;PROCESSING：订单待支付&lt;br&gt;SUCCESS：订单支付成功&lt;br&gt;TIME_OUT：订单已过期&lt;br&gt;FAIL:订单支付失败&lt;br&gt;CLOSE:订单关闭
     */
    @JsonProperty("status")
    private String status = null;

    /**
     * 订单金额.单位:元
     */
    @JsonProperty("orderAmount")
    private BigDecimal orderAmount = null;

    /**
     * 用户支付金额,单位:元
     */
    @JsonProperty("payAmount")
    private BigDecimal payAmount = null;

    /**
     * 商户手续费&lt;br&gt;商户承担的手续费金额.单位:元
     */
    @JsonProperty("merchantFee")
    private BigDecimal merchantFee = null;

    /**
     * 用户手续费,用户付费场景下返回.单位:元
     */
    @JsonProperty("customerFee")
    private BigDecimal customerFee = null;

    /**
     * 支付成功时间
     */
    @JsonProperty("paySuccessDate")
    private String paySuccessDate = null;

    /**
     * 对账备注&lt;br&gt;商户自定义参数，会展示在交易对账单中
     */
    @JsonProperty("memo")
    private String memo = null;

    /**
     * 支付方式&lt;br&gt;USER_SCAN：用户扫码MERCHANT_SCAN：商家扫码JS_PAY：JS支付MINI_PROGRAM：小程序支付WECHAT_OFFIACCOUNT：微信公众号支付ALIPAY_LIFE：生活号支付FACE_SCAN_PAY：刷脸支付SDK_PAY：SDK支付H5_PAY：H5支付ONEKEYPAY：一键支付BINDCARDPAY：绑卡支付E_BANK：网银支付ENTERPRISE_ACCOUNT_PAY：企业账户支付&lt;br&gt;ACCOUNT_BOOK_PAY: 记帐簿支付
     */
    @JsonProperty("payWay")
    private String payWay = null;

    /**
     * 支付授权token，用于调用支付
     */
    @JsonProperty("token")
    private String token = null;

    /**
     * 分账都订单标识&lt;br&gt;分账订单标识:&lt;br&gt;DELAY_SETTLE:分账&lt;br&gt;REAL_TIME:不分账
     */
    @JsonProperty("fundProcessType")
    private String fundProcessType = null;

    /**
     * 银行订单号&lt;br&gt;支付机构在银网联侧的单号,该单号也是支付机构在微信侧的外部商户订单号.&lt;br&gt;使用场景:&lt;br&gt;(1) 跨境报关&lt;br&gt;(2) 服务商用于点金计划商户小票功能
     */
    @JsonProperty("bankOrderId")
    private String bankOrderId = null;

    /**
     * 渠道订单号&lt;br&gt;该笔订单在微信、支付宝或银行侧系统生成的单号
     */
    @JsonProperty("channelOrderId")
    private String channelOrderId = null;

    /**
     * 渠道类型:&lt;br&gt;WECHAT：微信&lt;br&gt;ALIPAY：支付宝&lt;br&gt;UNIONPAY：银联&lt;br&gt;APPLEPAY：苹果支付&lt;br&gt;DCEP:数字人民币&lt;br&gt;仅聚合支付会返回该参数
     */
    @JsonProperty("channel")
    private String channel = null;

    /**
     * 用户实际支付金额
     */
    @JsonProperty("realPayAmount")
    private BigDecimal realPayAmount = null;

    /**
     * 剩余可分账金额;(用于分账的场景)
     */
    @JsonProperty("unSplitAmount")
    private BigDecimal unSplitAmount = null;

    /**
     *
     */
    @JsonProperty("payerInfo")
    private PayerInfoDTO payerInfo = null;

    /**
     *
     */
    @JsonProperty("channelPromotionInfo")
    private List<ChannelPromotionInfoDTO> channelPromotionInfo = null;

    /**
     *
     */
    @JsonProperty("ypPromotionInfo")
    private List<YpPromotionInfoDTO> ypPromotionInfo = null;

}
