/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.converter;

import com.yeepay.yop.scenario.bindcard.client.dto.OrderDTO;
import com.yeepay.yop.scenario.bindcard.domain.model.order.Order;
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
 * @since 2023/9/21 15:29
 */
@Mapper
public interface OrderDTOConverter {
    OrderDTOConverter INSTANCE = Mappers.getMapper(OrderDTOConverter.class);

    OrderDTO from(Order order);

    List<OrderDTO> from(List<Order> orders);

    Order to(OrderDTO orderDTO);

    List<Order> to(List<OrderDTO> orderDTOS);
}
