/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.convert;

import com.yeepay.yop.scenario.bindcard.client.dto.OrderDTO;
import com.yeepay.yop.scenario.bindcard.entry.vo.OrderVO;
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
 * @since 2023/9/8 18:44
 */
@Mapper
public interface OrderVOConverter {
    OrderVOConverter INSTANCE = Mappers.getMapper(OrderVOConverter.class);

    OrderVO from(OrderDTO orderDTO);

    List<OrderVO> from(List<OrderDTO> OrderDTOS);

    OrderDTO to(OrderVO orderVO);

    List<OrderDTO> to(List<OrderVO> orderVOS);
}
