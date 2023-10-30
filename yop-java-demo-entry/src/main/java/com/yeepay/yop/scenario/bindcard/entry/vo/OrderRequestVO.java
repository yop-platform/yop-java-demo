/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/25 15:24
 */
@Data
public class OrderRequestVO {
    @ApiModelProperty(value = "发起方商编", required = true)
    @NotBlank
    private String parentMerchantNo;
    @ApiModelProperty(value = "商户编号", required = true)
    @NotBlank
    private String merchantNo;
    @ApiModelProperty(value = "商户收款请求号", required = true)
    @NotBlank
    private String orderId;
    @ApiModelProperty(value = "订单金额", required = true)
    @NotBlank
    private String orderAmount;
    @ApiModelProperty(value = "商品名称", required = true)
    @NotBlank
    private String goodsName;
    @ApiModelProperty(value = "分账标识")
    private String fundProcessType;
    @ApiModelProperty(value = "接收支付结果的通知地址", required = true)
    @NotBlank
    private String notifyUrl;
    @ApiModelProperty(value = "对账备注")
    private String memo;
    @ApiModelProperty(value = "子单域信息")
    private String subOrderDetail;
    @ApiModelProperty(value = "订单过期时间")
    private String expiredTime;
    @ApiModelProperty(value = "支付成功后跳转的URL")
    private String redirectUrl;
    @ApiModelProperty(value = "清算回调地址")
    private String csUrl;
    @ApiModelProperty(value = "自定义参数信息")
    private String businessInfo;
    @ApiModelProperty(value = "终端信息 json格式")
    private String terminalInfo;
    @ApiModelProperty(value = "易宝营销信息")
    private String ypPromotionInfo;
    @ApiModelProperty(value = "付款信息")
    private String payerInfo;
    @ApiModelProperty(value = "支付商编")
    private String payMerchantNo;
    @ApiModelProperty(value = "产品信息")
    private String productInfo;
    @ApiModelProperty(value = "用户id", required = true)
    @NotBlank
    private String userId;

}
