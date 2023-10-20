/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.controller;

import com.yeepay.yop.scenario.bindcard.app.service.OrderAppService;
import com.yeepay.yop.scenario.bindcard.client.dto.YopCreateOrderV2ResDTO;
import com.yeepay.yop.scenario.bindcard.client.dto.YopQueryOrderResDTO;
import com.yeepay.yop.scenario.bindcard.entry.convert.OrderRequestVOConverter;
import com.yeepay.yop.scenario.bindcard.entry.convert.OrderVOConverter;
import com.yeepay.yop.scenario.bindcard.entry.convert.YopCreateOrderV2ResVOConverter;
import com.yeepay.yop.scenario.bindcard.entry.convert.YopQueryOrderResVOConverter;
import com.yeepay.yop.scenario.bindcard.entry.exception.R;
import com.yeepay.yop.scenario.bindcard.entry.exception.enums.StatusEnum;
import com.yeepay.yop.scenario.bindcard.entry.vo.OrderRequestVO;
import com.yeepay.yop.scenario.bindcard.entry.vo.OrderVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/rest/order")
@Slf4j
@Api(tags = "订单管理")
public class OrderController {
    @Setter(onMethod_ = @Autowired)
    private OrderAppService orderAppService;

    @GetMapping("/detail")
    @ApiOperation("订单详情")
    public R<OrderVO> detail(@RequestParam String orderId) {
        return new R(OrderVOConverter.INSTANCE.from(orderAppService.detail(orderId)));
    }

    @GetMapping("/list")
    @ApiOperation("查询商编下用户的所有订单")
    public R<List<OrderVO>> list(@RequestParam(value = "userId") @ApiParam("用户标识") String userId,
                                 @RequestParam(value = "merchantNo") @ApiParam("商编号") String merchantNo) {
        return new R<>(OrderVOConverter.INSTANCE.from(orderAppService.list(userId, merchantNo)));
    }

    @PostMapping("/create")
    @ApiOperation("下单")
    public R create(@RequestBody @Validated OrderRequestVO orderRequestVO) {
        YopCreateOrderV2ResDTO yopCreateOrderV2ResDTO;
        try {
            yopCreateOrderV2ResDTO = orderAppService.create(OrderRequestVOConverter.INSTANCE.to(orderRequestVO));
        } catch (Exception e) {
            return new R<>(StatusEnum.FAILURE.getCode(), e.getMessage());
        }
        return new R<>(YopCreateOrderV2ResVOConverter.INSTANCE.from(yopCreateOrderV2ResDTO));
    }

    @GetMapping("/query")
    @ApiOperation("查询易宝订单")
    public R query(@RequestParam(value = "parentMerchantNo") @ApiParam("发起方商编") String parentMerchantNo,
                   @RequestParam(value = "merchantNo") @ApiParam("收款商户编号") String merchantNo,
                   @RequestParam(value = "orderId") @ApiParam("交易下单传入的商户收款请求号") String orderId) {
        YopQueryOrderResDTO yopQueryOrderResDTO;
        try {
            yopQueryOrderResDTO = orderAppService.query(parentMerchantNo, merchantNo, orderId);
        } catch (Exception e) {
            return new R<>(StatusEnum.FAILURE.getCode(), e.getMessage());
        }
        return new R(YopQueryOrderResVOConverter.INSTANCE.from(yopQueryOrderResDTO));
    }


}
