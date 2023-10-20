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
 * @since 2023/9/25 17:54
 */
@Data
public class BindpayRequestRequestVO {
    @ApiModelProperty(value = "订单token", required = true)
    @NotBlank
    private String token;
    @ApiModelProperty(value = "绑卡id", required = true)
    @NotBlank
    private String bindId;
    @ApiModelProperty(value = "用户身份标识", required = true)
    @NotBlank
    private String userNo;
    @ApiModelProperty(value = "用户标识类型", required = true)
    @NotBlank
    private String userType;
    @ApiModelProperty(value = "用户IP", required = true)
    @NotBlank
    private String userIp;
    @ApiModelProperty(value = "接口版本", required = true)
    @NotBlank
    private String version;
    @ApiModelProperty("钱包属商编")
    private String payMerchantNo;
    @ApiModelProperty("支付扩展参数")
    private String extParamMap;
}
