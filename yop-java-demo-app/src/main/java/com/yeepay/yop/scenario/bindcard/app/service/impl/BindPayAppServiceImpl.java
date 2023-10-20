/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.service.impl;

import com.yeepay.yop.scenario.bindcard.app.converter.BindpayConfirmRequestDTOConverter;
import com.yeepay.yop.scenario.bindcard.app.converter.BindpayRequestRequestDTOConverter;
import com.yeepay.yop.scenario.bindcard.app.service.BindPayAppService;
import com.yeepay.yop.scenario.bindcard.client.dto.BindpayConfirmRequestDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.BindpayRequestRequestDTO;
import com.yeepay.yop.scenario.bindcard.domain.gateway.BindPayGateway;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.model.BindpayConfirmApiBindPayConfirmResponseDTOResult;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.model.BindpayRequestApiBindPayPaymentResponseDTOResult;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.model.BindpaySendsmsApiBindPaySendSmsResponseDTOResult;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.request.BindpaySendsmsRequest;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindpayConfirmResponse;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindpayRequestResponse;
import com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.response.BindpaySendsmsResponse;
import com.yeepay.yop.scenario.bindcard.domain.model.order.Order;
import com.yeepay.yop.scenario.bindcard.domain.model.order.enums.OrderStatus;
import com.yeepay.yop.scenario.bindcard.domain.service.OrderService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * title: 统一支付平台支付号实现<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Service
@Slf4j
public class BindPayAppServiceImpl implements BindPayAppService {
    private static final String SMS = "SMS";
    private static final String VOICE = "VOICE";
    private static final String NONE = "NONE";
    @Setter(onMethod_ = @Autowired)
    private BindPayGateway bindPayGateway;
    @Setter(onMethod_ = @Autowired)
    private OrderService orderService;

    @Override
    public void bindPayRequest(BindpayRequestRequestDTO bindpayRequestRequestDTO) throws Exception {
        //绑卡支付
        BindpayRequestResponse bindpayRequestResponse = bindPayGateway.bindPayRequest(BindpayRequestRequestDTOConverter.INSTANCE.to(bindpayRequestRequestDTO));
        BindpayRequestApiBindPayPaymentResponseDTOResult result = bindpayRequestResponse.getResult();
        Order order = orderService.findByUserIdAndToken(bindpayRequestRequestDTO.getUserNo(), bindpayRequestRequestDTO.getToken());
        if (!"CAS00000".equals(result.getCode()) && ObjectUtils.isNotEmpty(order) && OrderStatus.INIT.name().equals(order.getStatus())) {
            //支付失败，更新订单状态：已取消
            order.setStatus(OrderStatus.CANCEL.name());
            orderService.updateByUserIdAndToken(order);
            log.error("bind pay request failure, msg: {}", result.getMessage());
            throw new Exception("bind pay request failure");
        }
        if (StringUtils.isNotEmpty(result.getVerifyCodeType()) && !NONE.equals(result.getVerifyCodeType())) {
            //发送短信
            BindpaySendsmsRequest bindpaySendsmsRequest = new BindpaySendsmsRequest();
            bindpaySendsmsRequest.setToken(result.getToken());
            bindpaySendsmsRequest.setVersion("1.0");
            BindpaySendsmsResponse bindpaySendsmsResponse = bindPayGateway.bindpaySendsms(bindpaySendsmsRequest);
            BindpaySendsmsApiBindPaySendSmsResponseDTOResult responseResult = bindpaySendsmsResponse.getResult();
            if (!"CAS00000".equals(responseResult.getCode())) {
                log.error("bind pay send sms failure, msg: {}", result.getMessage());
                throw new Exception("bind pay send sms failure");
            }
        }
    }

    @Override
    public void bindPayConfirm(BindpayConfirmRequestDTO bindpayConfirmRequestDTO) throws Exception {
        BindpayConfirmResponse response = bindPayGateway.bindPayConfirm(BindpayConfirmRequestDTOConverter.INSTANCE.to(bindpayConfirmRequestDTO));
        BindpayConfirmApiBindPayConfirmResponseDTOResult result = response.getResult();
        Order order = orderService.findByUserIdAndToken(bindpayConfirmRequestDTO.getUserNo(), bindpayConfirmRequestDTO.getToken());
        if (!"CAS00000".equals(result.getCode()) && ObjectUtils.isNotEmpty(order) && OrderStatus.INIT.name().equals(order.getStatus())) {
            //支付确认失败，更新订单状态：已取消
            order.setStatus(OrderStatus.CANCEL.name());
            orderService.updateByUserIdAndToken(order);
            log.error("bind pay confirm failure, msg: {}", result.getMessage());
            throw new Exception("bind pay confirm failure, msg: " + result.getMessage());
        }
        //支付确认结果成功，更新订单状态：支付中
        order.setStatus(OrderStatus.PROCESSING.name());
        orderService.updateByUserIdAndToken(order);
    }


}
