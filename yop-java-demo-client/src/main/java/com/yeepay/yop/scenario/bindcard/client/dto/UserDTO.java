/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.client.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * title: 用户<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 用户id
     */
    private String id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户类型
     */
    private String type;

    /**
     * 证件类型
     */
    private String idCardType;

    /**
     * 证件号
     */
    private String cardNo;

    /**
     * 银行预留手机号
     */
    private String phone;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     */
    private LocalDateTime gmtModified;

}