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
 * @since 2023/9/25 20:17
 */
@Data
public class BindpayConfirmRequestVO {
    @ApiModelProperty(value = "token", required = true)
    @NotBlank
    private String token;
    @ApiModelProperty(value = "接口版本", required = true)
    @NotBlank
    private String version;
    @ApiModelProperty("验证码")
    private String verifyCode;
    @ApiModelProperty("卡号")
    private String cardno;
    @ApiModelProperty("持卡人姓名")
    private String owner;
    @ApiModelProperty("证件号")
    private String idno;
    @ApiModelProperty("银行预留手机号")
    private String phoneNo;
    @ApiModelProperty("易宝预留手机号")
    private String ypMobile;
    @ApiModelProperty("有效期")
    private String avlidDate;
    @ApiModelProperty("cvv2")
    private String cvv2;
    @ApiModelProperty("证件类型")
    private String idCardType;
    @ApiModelProperty("取款密码")
    private String bankPWD;
    @ApiModelProperty(value = "用户id", required = true)
    @NotBlank
    private String userNo;
}
