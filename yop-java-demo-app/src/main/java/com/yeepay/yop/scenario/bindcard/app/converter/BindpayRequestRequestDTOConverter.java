/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.converter;

import com.yeepay.yop.scenario.bindcard.client.dto.BindpayRequestRequestDTO;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindpayRequestRequest;
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
 * @since 2023/9/25 18:15
 */
@Mapper
public interface BindpayRequestRequestDTOConverter {
    BindpayRequestRequestDTOConverter INSTANCE = Mappers.getMapper(BindpayRequestRequestDTOConverter.class);

    BindpayRequestRequestDTO from(BindpayRequestRequest bindpayRequestRequest);

    BindpayRequestRequest to(BindpayRequestRequestDTO bindpayRequestRequestDTO);
}
