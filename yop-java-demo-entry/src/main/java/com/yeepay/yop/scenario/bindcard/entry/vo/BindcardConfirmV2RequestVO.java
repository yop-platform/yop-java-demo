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
 * @since 2023/10/9 11:48
 */
@Data
public class BindcardConfirmV2RequestVO {
    @ApiModelProperty(value = "主商户编号", required = true)
    @NotBlank
    private String parentMerchantNo;

    @ApiModelProperty(value = "商户编号", required = true)
    @NotBlank
    private String merchantNo;

    @ApiModelProperty(value = "绑卡请求号", required = true)
    @NotBlank
    private String merchantFlowId;

    @ApiModelProperty(value = "短信验证码", required = true)
    @NotBlank
    private String smsCode;

}
