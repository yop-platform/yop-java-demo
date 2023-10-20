/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.converter;

import com.yeepay.yop.scenario.bindcard.client.dto.BindpayConfirmRequestDTO;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindpayConfirmRequest;
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
 * @since 2023/9/25 20:26
 */
@Mapper
public interface BindpayConfirmRequestDTOConverter {
    BindpayConfirmRequestDTOConverter INSTANCE = Mappers.getMapper(BindpayConfirmRequestDTOConverter.class);

    BindpayConfirmRequestDTO from(BindpayConfirmRequest bindpayConfirmRequest);

    BindpayConfirmRequest to(BindpayConfirmRequestDTO bindpayConfirmRequestDTO);
}
