/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/8 14:32
 */
@Data
public class OrderVO {

    @ApiModelProperty(value = "订单id")
    private String id;

    @ApiModelProperty(value = "用户标识")
    private String userId;

    @ApiModelProperty(value = "父商编")
    private String parentMerchantNo;

    @ApiModelProperty(value = "子商编")
    private String merchantNo;

    @ApiModelProperty(value = "订单状态")
    private String status;

    @ApiModelProperty(value = "商品")
    private List<GoodsVO> goods;

    @ApiModelProperty(value = "订单价格")
    private BigDecimal price;

    @ApiModelProperty(value = "订单token")
    private String token;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gmtCreate;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gmtModified;
}
