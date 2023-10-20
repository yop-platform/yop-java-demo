/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.infrastructure.converter;

import com.yeepay.yop.scenario.bindcard.domain.model.order.Order;
import com.yeepay.yop.scenario.bindcard.infrastructure.tunnel.dataobject.OrderDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/21 16:16
 */
@Mapper
public interface OrderDOConverter {
    OrderDOConverter INSTANCE = Mappers.getMapper(OrderDOConverter.class);

    OrderDO from(Order order);

    List<OrderDO> from(List<Order> orders);

    Order to(OrderDO orderDO);

    List<Order> to(List<OrderDO> orderDOS);
}
