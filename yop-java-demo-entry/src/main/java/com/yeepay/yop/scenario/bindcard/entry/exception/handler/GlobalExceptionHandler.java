/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.exception.handler;

import com.yeepay.yop.scenario.bindcard.entry.exception.BusinessException;
import com.yeepay.yop.scenario.bindcard.entry.exception.R;
import com.yeepay.yop.scenario.bindcard.entry.exception.enums.StatusEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/8 15:58
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    //处理自定义的异常
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Object customHandler(BusinessException e) {
        e.printStackTrace();
        return R.builder()
                .code(e.getCode())
                .message(e.getMessage())
                .build();
    }

    //其他未处理的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object exceptionHandler(Exception e) {
        e.printStackTrace();
        return R.builder()
                .code(StatusEnum.FAILURE.getCode())
                .message(e.getMessage())
                .build();
    }
}
