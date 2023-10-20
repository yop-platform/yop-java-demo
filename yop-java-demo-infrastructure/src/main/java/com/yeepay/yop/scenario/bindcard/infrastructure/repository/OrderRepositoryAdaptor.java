/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yeepay.yop.scenario.bindcard.domain.model.order.Order;
import com.yeepay.yop.scenario.bindcard.domain.repository.OrderRepository;
import com.yeepay.yop.scenario.bindcard.infrastructure.converter.OrderDOConverter;
import com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.dataobject.OrderDO;
import com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.mapper.OrderMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * title: 订单仓储适配器<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Component
public class OrderRepositoryAdaptor implements OrderRepository {

    @Setter(onMethod_ = @Autowired)
    private OrderMapper orderMapper;

    @Override
    public Boolean create(Order order) {
        OrderDO orderDO = OrderDOConverter.INSTANCE.from(order);
        return orderMapper.insert(orderDO) > 0;
    }

    @Override
    public Boolean delete(String id) {
        return orderMapper.deleteById(id) > 0;
    }

    @Override
    public Order find(String id) {
        OrderDO orderDO = orderMapper.selectById(id);
        if (ObjectUtils.isNotEmpty(orderDO)) {
            return OrderDOConverter.INSTANCE.to(orderDO);
        }
        return null;
    }

    @Override
    public List<Order> findAll() {
        QueryWrapper<OrderDO> queryWrapper = Wrappers.query();
        return OrderDOConverter.INSTANCE.to(orderMapper.selectList(queryWrapper));
    }

    @Override
    public Boolean update(Order order) {
        OrderDO orderDO = OrderDOConverter.INSTANCE.from(order);
        return orderMapper.updateById(orderDO) > 0;
    }

    @Override
    public List<Order> listByUserIdAndMerchantNo(String userId, String merchantNo) {
        LambdaQueryWrapper<OrderDO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(OrderDO::getUserId, userId)
                .eq(OrderDO::getMerchantNo, merchantNo);
        List<OrderDO> orderDOS = orderMapper.selectList(lambdaQueryWrapper);
        return OrderDOConverter.INSTANCE.to(orderDOS);
    }

    @Override
    public Order findByUserIdAndToken(String userId, String token) {
        LambdaQueryWrapper<OrderDO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(OrderDO::getUserId, userId)
                .eq(OrderDO::getToken, token);
        OrderDO orderDO = orderMapper.selectOne(lambdaQueryWrapper);
        return OrderDOConverter.INSTANCE.to(orderDO);
    }

    @Override
    public void updateByUserIdAndToken(Order order) {
        OrderDO orderDO = OrderDOConverter.INSTANCE.from(order);
        LambdaUpdateWrapper<OrderDO> wrapper = new LambdaUpdateWrapper<>();
        wrapper.eq(OrderDO::getUserId, orderDO.getUserId());
        wrapper.eq(OrderDO::getToken, orderDO.getToken());
        wrapper.set(OrderDO::getStatus, orderDO.getStatus());
        orderMapper.update(null, wrapper);
    }


}
