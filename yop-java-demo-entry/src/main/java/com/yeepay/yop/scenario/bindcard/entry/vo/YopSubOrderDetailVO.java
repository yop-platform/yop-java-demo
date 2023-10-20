/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/10/10 16:01
 */
@Data
public class YopSubOrderDetailVO {

    @ApiModelProperty(value = "商户编号")
    private String merchantNo;

    @ApiModelProperty(value = "商户收款请求号")
    private String orderId;

    @ApiModelProperty(value = "易宝收款订单号")
    private String uniqueOrderNo;

    @ApiModelProperty(value = "订单金额")
    private BigDecimal orderAmount;

}
