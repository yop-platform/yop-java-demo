/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.converter;

import com.yeepay.yop.scenario.bindcard.client.dto.YopQueryOrderResDTO;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.model.YopQueryOrderRes;
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
 * @since 2023/10/10 16:54
 */
@Mapper
public interface YopQueryOrderResDTOConverter {
    YopQueryOrderResDTOConverter INSTANCE = Mappers.getMapper(YopQueryOrderResDTOConverter.class);

    YopQueryOrderResDTO from(YopQueryOrderRes orderResponse);

    YopQueryOrderRes to(YopQueryOrderResDTO orderResponseDTO);

}
