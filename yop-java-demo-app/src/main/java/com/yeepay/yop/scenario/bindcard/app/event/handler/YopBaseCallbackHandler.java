/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.app.event.handler;

import com.yeepay.yop.sdk.service.common.callback.handler.YopCallbackHandler;
import com.yeepay.yop.sdk.service.common.callback.handler.YopCallbackHandlerFactory;

import javax.annotation.PostConstruct;

/**
 * title: Yop回调处理器基类<br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wdc
 * @version 1.0.0
 * @since 2022/5/17
 */
public abstract class YopBaseCallbackHandler implements YopCallbackHandler {

    @PostConstruct
    public void init() {
        YopCallbackHandlerFactory.register(getType(), this);
    }

}
