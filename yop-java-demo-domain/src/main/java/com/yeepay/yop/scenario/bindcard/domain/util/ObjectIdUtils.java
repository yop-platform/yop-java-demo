/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.util;

import java.util.UUID;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/21 18:00
 */
public class ObjectIdUtils {
    private static final String UNDERLINE = "_";

    public static String buildId(String className) {
        return className + UNDERLINE + UUID.randomUUID();
    }

}
