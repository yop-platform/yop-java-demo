/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.converter;

import com.yeepay.yop.scenario.bindcard.client.dto.BindcardRequestV2RequestDTO;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindcardRequestV2Request;
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
 * @since 2023/9/25 16:23
 */
@Mapper
public interface BindcardRequestV2RequestDTOConverter {
    BindcardRequestV2RequestDTOConverter INSTANCE = Mappers.getMapper(BindcardRequestV2RequestDTOConverter.class);

    BindcardRequestV2RequestDTO from(BindcardRequestV2Request bindcardRequestV2Request);

    BindcardRequestV2Request to(BindcardRequestV2RequestDTO bindcardRequestV2RequestDTO);
}
