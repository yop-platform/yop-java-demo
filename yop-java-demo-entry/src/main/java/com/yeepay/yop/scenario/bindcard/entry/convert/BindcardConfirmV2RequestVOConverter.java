/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.convert;

import com.yeepay.yop.scenario.bindcard.client.dto.BindcardConfirmV2RequestDTO;
import com.yeepay.yop.scenario.bindcard.entry.vo.BindcardConfirmV2RequestVO;
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
 * @since 2023/10/9 11:51
 */
@Mapper
public interface BindcardConfirmV2RequestVOConverter {
    BindcardConfirmV2RequestVOConverter INSTANCE = Mappers.getMapper(BindcardConfirmV2RequestVOConverter.class);

    BindcardConfirmV2RequestVO from(BindcardConfirmV2RequestDTO bindcardConfirmV2RequestDTO);

    BindcardConfirmV2RequestDTO to(BindcardConfirmV2RequestVO bindcardConfirmV2RequestVO);
}
