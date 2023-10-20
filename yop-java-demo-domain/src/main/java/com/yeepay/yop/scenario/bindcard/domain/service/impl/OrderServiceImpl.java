/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.service.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeepay.yop.scenario.bindcard.domain.model.order.Order;
import com.yeepay.yop.scenario.bindcard.domain.repository.OrderRepository;
import com.yeepay.yop.scenario.bindcard.domain.service.OrderService;
import com.yeepay.yop.sdk.utils.JsonUtils;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * title: 订单领域服务实现<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Slf4j
@Component
public class OrderServiceImpl implements OrderService {

    protected ObjectMapper mapper;

    @Setter(onMethod_ = @Autowired)
    private OrderRepository orderRepository;

    @Override
    public void create(Order order) throws Exception {
        log.info("receive order: {}", JsonUtils.toJsonString(order));// bigdecimal不转换
        Order existed = orderRepository.find(order.getId());
        if (ObjectUtils.isNotEmpty(existed)) {
            log.error("orderId is existed. orderId: {}", order.getId());
            throw new Exception("orderId is existed");
        }
        orderRepository.create(order);
    }

    @Override
    public void delete(String id) {
        // TODO 待实现
    }

    @Override
    public void update(Order order) {
        orderRepository.update(order);
    }

    @Override
    public Order detail(String id) {
        return orderRepository.find(id);
    }

    @Override
    public List<Order> listByUserIdAndMerchantNo(String userId, String merchantNo) {
        return orderRepository.listByUserIdAndMerchantNo(userId, merchantNo);
    }

    @Override
    public Order findByUserIdAndToken(String userId, String token) {
        return orderRepository.findByUserIdAndToken(userId, token);
    }

    @Override
    public void updateByUserIdAndToken(Order order) {
        orderRepository.updateByUserIdAndToken(order);
    }

    @Override
    public List<Order> listAll() {
        List<Order> all = orderRepository.findAll();
        return all;
    }


}
