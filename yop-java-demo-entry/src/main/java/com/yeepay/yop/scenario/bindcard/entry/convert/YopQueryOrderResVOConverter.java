/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.convert;

import com.yeepay.yop.scenario.bindcard.client.dto.YopQueryOrderResDTO;
import com.yeepay.yop.scenario.bindcard.entry.vo.YopQueryOrderResVO;
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
 * @since 2023/10/10 18:26
 */
@Mapper
public interface YopQueryOrderResVOConverter {
    YopQueryOrderResVOConverter INSTANCE = Mappers.getMapper(YopQueryOrderResVOConverter.class);

    YopQueryOrderResVO from(YopQueryOrderResDTO yopQueryOrderResDTO);

    YopQueryOrderResDTO to(YopQueryOrderResVO yopQueryOrderResVO);
}
