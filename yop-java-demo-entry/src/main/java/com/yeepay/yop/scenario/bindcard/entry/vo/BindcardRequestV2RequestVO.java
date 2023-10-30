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
 * @since 2023/9/25 15:59
 */
@Data
public class BindcardRequestV2RequestVO {
    @ApiModelProperty(value = "主商户编号", required = true)
    @NotBlank
    private String parentMerchantNo;
    @ApiModelProperty(value = "收单商户编号", required = true)
    @NotBlank
    private String merchantNo;
    @ApiModelProperty(value = "商户绑卡请求号", required = true)
    @NotBlank
    private String merchantFlowId;
    @ApiModelProperty(value = "用户标识", required = true)
    @NotBlank
    private String userNo;
    @ApiModelProperty(value = "用户标识类型", required = true)
    @NotBlank
    private String userType;
    @ApiModelProperty(value = "银行卡号", required = true)
    @NotBlank
    private String bankCardNo;
    @ApiModelProperty(value = "持卡人姓名", required = true)
    @NotBlank
    private String userName;
    @ApiModelProperty(value = "持卡人证件号", required = true)
    @NotBlank
    private String idCardNo;
    @ApiModelProperty(value = "银行预留手机号", required = true)
    @NotBlank
    private String phone;
    @ApiModelProperty("cvv2")
    private String cvv2;
    @ApiModelProperty("信用卡有效期")
    private String validthru;
    @ApiModelProperty("订单有效期")
    private Integer orderValidate;
    @ApiModelProperty(value = "鉴权类型", required = true)
    @NotBlank
    private String authType;
    @ApiModelProperty(value = "卡类型", required = true)
    @NotBlank
    private String cardType;
    @ApiModelProperty("是否发短信")
    private String isSMS;
    @ApiModelProperty("证件类型")
    private String idCardType;
}
