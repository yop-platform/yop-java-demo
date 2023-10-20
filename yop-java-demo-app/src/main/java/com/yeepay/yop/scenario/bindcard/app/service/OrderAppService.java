/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.service;


import com.yeepay.yop.scenario.bindcard.client.dto.OrderDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.OrderRequestDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.YopCreateOrderV2ResDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.YopQueryOrderResDTO;

import java.util.List;

/**
 * title: 订单应用服务<br>
 * description: 订单应用服务<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface OrderAppService {

    /**
     * 创建订单
     *
     * @param orderRequestDTO
     */
    YopCreateOrderV2ResDTO create(OrderRequestDTO orderRequestDTO) throws Exception;

    /**
     * 删除订单
     *
     * @param id 订单id
     */
    void delete(String id);

    /**
     * 更新订单
     *
     * @param orderDTO 订单
     * @return boolean    是否更新成功
     */
    Boolean update(OrderDTO orderDTO);

    /**
     * 订单详情
     *
     * @param id 订单id
     * @return orderDTO    订单详情
     */
    OrderDTO detail(String id);

    /**
     * 根据用户标识和商编，查询用户的所有订单
     *
     * @param userId     用户id
     * @param merchantNo 商编
     * @return list&lt;OrderDTO&gt;
     */
    List<OrderDTO> list(String userId, String merchantNo);

    /**
     * 查询易宝订单
     *
     * @param parentMerchantNo
     * @param merchantNo
     * @param orderId
     * @return
     */
    YopQueryOrderResDTO query(String parentMerchantNo, String merchantNo, String orderId) throws Exception;
}
