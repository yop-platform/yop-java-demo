/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.client.dto;

import java.io.Serializable;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/25 11:20
 */
public class OrderResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private YopCreateOrderV2ResDTO result;

    public YopCreateOrderV2ResDTO getResult() {
        return result;
    }

    public void setResult(YopCreateOrderV2ResDTO result) {
        this.result = result;
    }
}
