/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.controller;

import com.yeepay.yop.scenario.bindcard.app.service.BindPayAppService;
import com.yeepay.yop.scenario.bindcard.entry.convert.BindpayConfirmRequestVOConverter;
import com.yeepay.yop.scenario.bindcard.entry.convert.BindpayRequestRequestVOConverter;
import com.yeepay.yop.scenario.bindcard.entry.exception.R;
import com.yeepay.yop.scenario.bindcard.entry.exception.enums.StatusEnum;
import com.yeepay.yop.scenario.bindcard.entry.vo.BindpayConfirmRequestVO;
import com.yeepay.yop.scenario.bindcard.entry.vo.BindpayRequestRequestVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/8 18:17
 */
@RestController
@RequestMapping("/rest/bind-pay")
@Slf4j
@Api(tags = "绑卡支付操作")
public class BindPayController {
    @Setter(onMethod_ = @Autowired)
    private BindPayAppService bindPayAppService;

    @PostMapping("/request")
    @ApiOperation("支付下单")
    public R request(@RequestBody @Validated BindpayRequestRequestVO bindpayRequestRequestVO) {
        try {
            bindPayAppService.bindPayRequest(BindpayRequestRequestVOConverter.INSTANCE.to(bindpayRequestRequestVO));
        } catch (Exception e) {
            return new R<>(StatusEnum.FAILURE.getCode(), e.getMessage());
        }
        return new R<>(StatusEnum.SUCCESS);
    }

    @PostMapping("/confirm")
    @ApiOperation("确认支付")
    public R confirm(@RequestBody @Validated BindpayConfirmRequestVO bindpayConfirmRequestVO) {
        try {
            bindPayAppService.bindPayConfirm(BindpayConfirmRequestVOConverter.INSTANCE.to(bindpayConfirmRequestVO));
        } catch (Exception e) {
            return new R<>(StatusEnum.FAILURE.getCode(), e.getMessage());
        }
        return new R<>(StatusEnum.SUCCESS);
    }


}
