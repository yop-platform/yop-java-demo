/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.entry.exception;

/**
 * title: 结果统一返回类 <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/9/8 15:59
 */

import com.yeepay.yop.scenario.bindcard.entry.exception.enums.StatusEnum;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class R<T> implements Serializable {

    private static final long serialVersionUID = 8908073950154134675L;

    /**
     * 状态码
     **/
    private Integer code;

    /**
     * 状态描述信息
     **/
    private String message;

    /**
     * 返回数据
     **/
    private T data;

    public R(T data) {
        this.code = StatusEnum.SUCCESS.getCode();
        this.data = data;
    }

//    public R(String message) {
//        this.code = StatusEnum.FAILURE.getCode();
//        this.message = message;
//    }

    public R(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
