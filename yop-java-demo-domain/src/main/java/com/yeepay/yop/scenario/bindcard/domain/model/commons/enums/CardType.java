/*
 * Copyright: Copyright (c)2014
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.domain.model.commons.enums;


/**
 * title: 卡类型<br>
 * description: <br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author yeeworks
 * @version 1.0.0
 * @since 2023/09/19
 */
public enum CardType {

    /**
     * 仅贷记卡支持
     */
    OC("仅贷记卡支持"),

    /**
     * 仅借记卡支持
     */
    OD("仅借记卡支持"),

    /**
     * 借记卡、贷记卡均支持
     */
    DC("借记卡、贷记卡均支持"),
    ;

    /**
     * 展示名
     */
    private String displayName;

    CardType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
