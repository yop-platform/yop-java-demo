/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.controller;

import com.yeepay.yop.scenario.bindcard.app.service.GoodsAppService;
import com.yeepay.yop.scenario.bindcard.entry.convert.GoodsVOConverter;
import com.yeepay.yop.scenario.bindcard.entry.exception.R;
import com.yeepay.yop.scenario.bindcard.entry.vo.GoodsVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
@RequestMapping("/rest/goods")
@Slf4j
@Api(tags = "商品管理")
public class GoodsController {
    @Setter(onMethod_ = @Autowired)
    private GoodsAppService goodsAppService;

    @GetMapping("/detail")
    @ApiOperation("商品详情")
    public R<GoodsVO> detail(@RequestParam String goodsId) {
        return new R(GoodsVOConverter.INSTANCE.from(goodsAppService.detail(goodsId)));
    }

    @GetMapping(value = "/list")
    @ApiOperation("商品列表")
    public R<List<GoodsVO>> list() {
        return new R<>(GoodsVOConverter.INSTANCE.from(goodsAppService.list()));
    }
}
