/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.model.user;

import com.yeepay.yop.scenario.bindcard.domain.model.user.enums.IdCardType;
import com.yeepay.yop.scenario.bindcard.domain.model.user.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class User implements Serializable {

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
    private UserType type;

    /**
     * 证件类型
     */
    private IdCardType idCardType;

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
