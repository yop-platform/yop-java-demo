/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.model.user.enums;


/**
 * title: 证件类型<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public enum IdCardType {

    /**
     * 身份证
     */
    ID("身份证"),

    /**
     * 军官证
     */
    OFFICERS("军官证"),

    /**
     * 护照
     */
    PASSPORT("护照"),

    /**
     * 回乡证
     */
    REENTRY("回乡证"),

    /**
     * 台胞证
     */
    TAIWAN("台胞证"),

    /**
     * 警官证
     */
    POLICE("警官证"),

    /**
     * 士兵证
     */
    SOLDIER("士兵证"),

    /**
     * 港澳居民往来内地通行证
     */
    HM_VISITORPASS("港澳居民往来内地通行证"),

    /**
     * 户口薄
     */
    RESIDENCEBOOKLET("户口薄"),

    /**
     * 临时身份证
     */
    TEMPIDCARD("临时身份证"),

    /**
     * 外国人居留证
     */
    FR_CARD("外国人居留证"),
    ;

    /**
     * 展示名
     */
    private String displayName;

    IdCardType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
