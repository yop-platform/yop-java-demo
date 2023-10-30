/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/21 15:55
 */
@Data
@TableName("tbl_order")
public class OrderDO {

    /**
     * 订单id
     */
    private String id;

    /**
     * 用户标识
     */
    private String userId;

    /**
     * 父商编
     */
    private String parentMerchantNo;

    /**
     * 子商编
     */
    private String merchantNo;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 订单价格
     */
    private BigDecimal price;

    /**
     * 订单token
     */
    private String token;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     */
    private LocalDateTime gmtModified;

}
