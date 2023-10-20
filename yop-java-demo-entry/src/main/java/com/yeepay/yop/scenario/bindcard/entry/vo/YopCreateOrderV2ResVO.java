/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
 * @since 2023/10/10 15:58
 */
@Data
public class YopCreateOrderV2ResVO {

    @ApiModelProperty(value = "返回码")
    private String code;

    @ApiModelProperty(value = "返回信息")
    private String message;

    @ApiModelProperty(value = "发起方商编")
    private String parentMerchantNo;

    @ApiModelProperty(value = "商户编号")
    private String merchantNo;

    @ApiModelProperty(value = "商户收款请求号")
    private String orderId;

    @ApiModelProperty(value = "易宝收款订单号")
    private String uniqueOrderNo;

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value = "订单金额")
    private BigDecimal orderAmount;

    @ApiModelProperty(value = "子单域信息")
    private List<YopSubOrderDetailVO> subOrderInfoList;

}
