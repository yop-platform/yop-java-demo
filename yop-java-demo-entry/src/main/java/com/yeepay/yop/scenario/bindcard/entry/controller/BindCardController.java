/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.controller;

import com.yeepay.yop.scenario.bindcard.app.service.BindCardAppService;
import com.yeepay.yop.scenario.bindcard.entry.convert.BindcardConfirmV2RequestVOConverter;
import com.yeepay.yop.scenario.bindcard.entry.convert.BindcardRequestV2RequestVOConverter;
import com.yeepay.yop.scenario.bindcard.entry.exception.R;
import com.yeepay.yop.scenario.bindcard.entry.exception.enums.StatusEnum;
import com.yeepay.yop.scenario.bindcard.entry.vo.BindcardConfirmV2RequestVO;
import com.yeepay.yop.scenario.bindcard.entry.vo.BindcardRequestV2RequestVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @since 2023/9/25 14:28
 */
@RestController
@RequestMapping("/rest/bind-card")
@Slf4j
@Api(tags = "绑卡操作")
public class BindCardController {
    @Setter(onMethod_ = @Autowired)
    private BindCardAppService bindCardAppService;

    @PostMapping("/request")
    @ApiOperation("绑卡请求")
    public R request(@RequestBody BindcardRequestV2RequestVO bindcardRequestV2RequestVO) {
        try {
            bindCardAppService.request(BindcardRequestV2RequestVOConverter.INSTANCE.to(bindcardRequestV2RequestVO));
        } catch (Exception e) {
            return new R<>(StatusEnum.FAILURE.getCode(), e.getMessage());
        }
        return new R<>(StatusEnum.SUCCESS);
    }

    @PostMapping("/confirm")
    @ApiOperation("绑卡短验确认")
    public R confirm(@RequestBody BindcardConfirmV2RequestVO bindcardConfirmV2RequestVO) {
        try {
            bindCardAppService.confirm(BindcardConfirmV2RequestVOConverter.INSTANCE.to(bindcardConfirmV2RequestVO));
        } catch (Exception e) {
            return new R<>(StatusEnum.FAILURE.getCode(), e.getMessage());
        }
        return new R<>(StatusEnum.SUCCESS);
    }

}
