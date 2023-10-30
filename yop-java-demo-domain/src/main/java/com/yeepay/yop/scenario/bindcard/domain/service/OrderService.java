/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.service;


import com.yeepay.yop.scenario.bindcard.domain.model.order.Order;

import java.util.List;

/**
 * title: 订单领域服务<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param order 订单
     */
    void create(Order order) throws Exception;

    /**
     * 删除订单
     *
     * @param id 订单id
     */
    void delete(String id);

    /**
     * 更新订单
     *
     * @param order 订单
     */
    void update(Order order);

    /**
     * 订单详情
     *
     * @param id 订单id
     * @return order    订单详情
     */
    Order detail(String id);

    /**
     * 查询商编下用户的所有订单
     *
     * @param userId     用户标识
     * @param merchantNo 商编号
     * @return list&lt;Order&gt;
     */
    List<Order> listByUserIdAndMerchantNo(String userId, String merchantNo);

    /**
     * 根据用户id和订单token，查找订单
     *
     * @param userId
     * @param token
     * @return
     */
    Order findByUserIdAndToken(String userId, String token);

    /**
     * 根据用户id和订单token，更新订单状态
     *
     * @param order
     */
    void updateByUserIdAndToken(Order order);

    /**
     * 列出所有订单
     *
     * @return
     */
    List<Order> listAll();
}
