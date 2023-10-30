/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.repository;


import com.yeepay.yop.scenario.bindcard.domain.model.order.Order;

import java.util.List;

/**
 * title: 订单仓储<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface OrderRepository {
    /**
     * 创建订单
     *
     * @param order 订单
     * @return true:成功，false:失败
     */
    Boolean create(Order order);

    /**
     * 根据ID删除订单
     *
     * @param id 实体标识
     * @return true:成功，false:失败
     */
    Boolean delete(String id);

    /**
     * 根据ID查询订单
     *
     * @param id 实体标识
     * @return 订单详情
     */
    Order find(String id);

    /**
     * 查询所有订单
     *
     * @return 订单列表
     */
    List<Order> findAll();

    /**
     * 根据ID修改订单
     *
     * @param order 实体标识
     * @return true:成功，false:失败
     */
    Boolean update(Order order);

    /**
     * 查询商编下用户的所有订单
     *
     * @param userId
     * @param merchantNo
     * @return
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
}
