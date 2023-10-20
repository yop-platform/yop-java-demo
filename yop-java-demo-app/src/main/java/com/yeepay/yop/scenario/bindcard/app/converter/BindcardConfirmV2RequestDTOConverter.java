/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.converter;

import com.yeepay.yop.scenario.bindcard.client.dto.BindcardConfirmV2RequestDTO;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindcardConfirmV2Request;
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
 * @since 2023/10/9 14:03
 */
@Mapper
public interface BindcardConfirmV2RequestDTOConverter {
    BindcardConfirmV2RequestDTOConverter INSTANCE = Mappers.getMapper(BindcardConfirmV2RequestDTOConverter.class);

    BindcardConfirmV2RequestDTO from(BindcardConfirmV2Request bindcardConfirmV2Request);

    BindcardConfirmV2Request to(BindcardConfirmV2RequestDTO bindcardConfirmV2RequestDTO);
}
