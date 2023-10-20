/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.model.order;

import com.yeepay.yop.scenario.bindcard.domain.model.goods.Goods;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * title: 订单<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Order implements Serializable {

    private static final long serialVersionUID = -1L;

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
     * 商品
     */
    @Singular("good")
    private List<Goods> goods;

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
