/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.controller;

import com.yeepay.yop.scenario.bindcard.app.service.UserAppService;
import com.yeepay.yop.scenario.bindcard.entry.convert.UserVOConverter;
import com.yeepay.yop.scenario.bindcard.entry.exception.R;
import com.yeepay.yop.scenario.bindcard.entry.exception.enums.StatusEnum;
import com.yeepay.yop.scenario.bindcard.entry.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/8 14:29
 */
@RestController
@RequestMapping("/rest/user")
@Slf4j
@Api(tags = "用户管理")
public class UserController {
    @Setter(onMethod_ = @Autowired)
    private UserAppService userAppService;

    @GetMapping("/detail")
    @ApiOperation("用户查询")
    public R<UserVO> detail(@RequestParam String userId) {
        return new R<>(UserVOConverter.INSTANCE.from(userAppService.detail(userId)));
    }

    @PostMapping("/bind-card-list")
    @ApiOperation("查询用户的签约/绑卡列表")
    public R findBindCardList(@RequestParam(value = "userId") @ApiParam("用户标识") String userId,
                              @RequestParam(value = "merchantNo") @ApiParam("商编号") String merchantNo,
                              @RequestParam(value = "userType") @ApiParam("用户类型") String userType) {
        String bindCardList;
        try {
            bindCardList = userAppService.bindCardList(userId, merchantNo, userType);
        } catch (Exception e) {
            return new R(StatusEnum.FAILURE.getCode(), e.getMessage());
        }
        HashMap<String, String> result = new HashMap<>();
        result.put("bindCardList", bindCardList);
        return new R(result);
    }
}
