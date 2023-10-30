/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.converter;

import com.yeepay.yop.scenario.bindcard.client.dto.YopCreateOrderV2ResDTO;
import com.yeepay.yop.scenario.bindcard.domain.model.trade.model.YopCreateOrderV2Res;
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
 * @since 2023/10/10 16:29
 */
@Mapper
public interface YopCreateOrderV2ResDTOConverter {
    YopCreateOrderV2ResDTOConverter INSTANCE = Mappers.getMapper(YopCreateOrderV2ResDTOConverter.class);

    YopCreateOrderV2ResDTO from(YopCreateOrderV2Res yopCreateOrderV2Res);

    YopCreateOrderV2Res to(YopCreateOrderV2ResDTO yopCreateOrderV2ResDTO);
}
