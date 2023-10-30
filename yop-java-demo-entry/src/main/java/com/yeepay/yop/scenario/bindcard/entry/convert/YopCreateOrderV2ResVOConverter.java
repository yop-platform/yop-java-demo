/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.convert;

import com.yeepay.yop.scenario.bindcard.client.dto.YopCreateOrderV2ResDTO;
import com.yeepay.yop.scenario.bindcard.entry.vo.YopCreateOrderV2ResVO;
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
 * @since 2023/10/10 16:03
 */
@Mapper
public interface YopCreateOrderV2ResVOConverter {
    YopCreateOrderV2ResVOConverter INSTANCE = Mappers.getMapper(YopCreateOrderV2ResVOConverter.class);

    YopCreateOrderV2ResVO from(YopCreateOrderV2ResDTO yopCreateOrderV2ResDTO);

    YopCreateOrderV2ResDTO to(YopCreateOrderV2ResVO yopCreateOrderV2ResVO);
}
