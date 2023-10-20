/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.service.impl;

import com.yeepay.yop.scenario.bindcard.app.converter.BindcardConfirmV2RequestDTOConverter;
import com.yeepay.yop.scenario.bindcard.app.converter.BindcardRequestV2RequestDTOConverter;
import com.yeepay.yop.scenario.bindcard.app.service.BindCardAppService;
import com.yeepay.yop.scenario.bindcard.client.dto.BindcardConfirmV2RequestDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.BindcardRequestV2RequestDTO;
import com.yeepay.yop.scenario.bindcard.domain.gateway.BindCardGateway;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.model.BindcardConfirmV2OpenAuthBindCardConfirmResponseDTOResult;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.model.BindcardRequestV2OpenAuthBindCardResponseDTOResult;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindcardConfirmV2Response;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindcardRequestV2Response;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/25 14:31
 */
@Service
@Slf4j
public class BindCardAppServiceImpl implements BindCardAppService {
    @Setter(onMethod_ = @Autowired)
    private BindCardGateway bindCardGateway;

    @Override
    public void request(BindcardRequestV2RequestDTO bindcardRequestV2RequestDTO) throws Exception {
        BindcardRequestV2Response bindcardRequestV2Response = bindCardGateway.bindCardRequest(BindcardRequestV2RequestDTOConverter.INSTANCE.to(bindcardRequestV2RequestDTO));
        BindcardRequestV2OpenAuthBindCardResponseDTOResult result = bindcardRequestV2Response.getResult();
        if (!"NOP00000".equals(result.getCode())) {
            log.error("bind card request failure, msg: {}", result.getMessage());
            throw new Exception("bind card request failure, msg: " + result.getMessage());
        }
    }

    @Override
    public void confirm(BindcardConfirmV2RequestDTO bindcardConfirmV2RequestDTO) throws Exception {
        BindcardConfirmV2Response bindcardConfirmV2Response = bindCardGateway.bindCardConfirm(BindcardConfirmV2RequestDTOConverter.INSTANCE.to(bindcardConfirmV2RequestDTO));
        BindcardConfirmV2OpenAuthBindCardConfirmResponseDTOResult result = bindcardConfirmV2Response.getResult();
        if (!"NOP00000".equals(result.getCode())) {
            log.error("bind card confirm failure, msg: {}", result.getMessage());
            throw new Exception("bind card confirm failure, msg: " + result.getMessage());
        }
    }
}
