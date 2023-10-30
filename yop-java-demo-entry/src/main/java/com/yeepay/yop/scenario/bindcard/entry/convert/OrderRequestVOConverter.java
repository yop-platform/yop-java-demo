/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.convert;

import com.yeepay.yop.scenario.bindcard.client.dto.OrderRequestDTO;
import com.yeepay.yop.scenario.bindcard.entry.vo.OrderRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/25 15:34
 */
@Mapper
public interface OrderRequestVOConverter {
    OrderRequestVOConverter INSTANCE = Mappers.getMapper(OrderRequestVOConverter.class);

    OrderRequestVO from(OrderRequestDTO orderRequestDTO);

    OrderRequestDTO to(OrderRequestVO orderRequestVO);

}
