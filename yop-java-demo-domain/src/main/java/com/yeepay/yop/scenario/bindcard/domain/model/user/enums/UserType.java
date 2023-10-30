/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.model.user.enums;


/**
 * title: 用户类型<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public enum UserType {

    /**
     * 微信号
     */
    WECHAT("微信号"),

    /**
     * 用户纸质订单协议号
     */
    AGREEMENT_NO("用户纸质订单协议号"),

    /**
     * 用户身份证号
     */
    ID_CARD("用户身份证号"),

    /**
     * 用户注册手机号
     */
    PHONE("用户注册手机号"),

    /**
     * 用户注册email
     */
    EMAIL("用户注册email"),

    /**
     * 用户ID
     */
    USER_ID("用户ID"),

    /**
     * 网卡地址
     */
    MAC("网卡地址"),

    /**
     * imei
     */
    IMEI("imei"),
    ;

    /**
     * 展示名
     */
    private String displayName;

    UserType(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 自己定义一个静态方法,通过displayName返回枚举常量对象
     *
     * @param displayName
     * @return
     */
    public static UserType getEnum(String displayName) {
        for (UserType e : values()) {
            if (e.getDisplayName() == displayName) {
                return e;
            }
        }
        return null;
    }

    public String getDisplayName() {
        return displayName;
    }

}
