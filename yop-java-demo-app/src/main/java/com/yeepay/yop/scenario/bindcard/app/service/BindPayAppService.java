/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.service;


import com.yeepay.yop.scenario.bindcard.client.dto.BindpayConfirmRequestDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.BindpayRequestRequestDTO;

/**
 * title: 绑卡支付应用服务<br>
 * description: 绑卡支付应用服务<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public interface BindPayAppService {

    /**
     * 商户收款并发短信
     *
     * @param
     */
    void bindPayRequest(BindpayRequestRequestDTO bindpayRequestRequestDTO) throws Exception;

    /**
     * 确认支付
     *
     * @param bindpayConfirmRequestDTO
     */
    void bindPayConfirm(BindpayConfirmRequestDTO bindpayConfirmRequestDTO) throws Exception;


}
