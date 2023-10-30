/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.convert;

import com.yeepay.yop.scenario.bindcard.client.dto.BindcardRequestV2RequestDTO;
import com.yeepay.yop.scenario.bindcard.entry.vo.BindcardRequestV2RequestVO;
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
 * @since 2023/9/25 16:21
 */
@Mapper
public interface BindcardRequestV2RequestVOConverter {
    BindcardRequestV2RequestVOConverter INSTANCE = Mappers.getMapper(BindcardRequestV2RequestVOConverter.class);

    BindcardRequestV2RequestVO from(BindcardRequestV2RequestDTO bindcardRequestV2RequestDTO);

    BindcardRequestV2RequestDTO to(BindcardRequestV2RequestVO bindcardRequestV2RequestVO);
}
