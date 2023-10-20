/*
 * Copyright: Copyright (c)2011
 * Company: 易宝支付(YeePay)
 */
package com.yeepay.yop.scenario.bindcard.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * title: <br>
 * description: 描述<br>
 * Copyright: Copyright (c)2014<br>
 * Company: 易宝支付(YeePay)<br>
 *
 * @author wenbo.fan-1
 * @version 1.0.0
 * @since 2023/10/10 16:39
 */
@Data
public class PayerInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 银行编号&lt;br&gt;&lt;span style&#x3D;\&quot;caret-color: #333333; color: #333333; font-family: Arial, sans-serif;\&quot;&gt;银行编号，&lt;/span&gt;&lt;span style&#x3D;\&quot;caret-color: #333333; color: #333333; font-family: Arial, sans-serif;\&quot;&gt;如：ABC、CBC等&lt;/span&gt;
     */
    @JsonProperty("bankId")
    private String bankId = null;

    /**
     * 账户名称.网银B2B支付会返回付款企业账户名称
     */
    @JsonProperty("accountName")
    private String accountName = null;

    /**
     * 银行卡号（前6后4）
     */
    @JsonProperty("bankCardNo")
    private String bankCardNo = null;

    /**
     * 手机号（前3后4)
     */
    @JsonProperty("mobilePhoneNo")
    private String mobilePhoneNo = null;

    /**
     * 卡类型&lt;br&gt;DEBIT：借记卡CREDIT：贷记卡CFT：微信零钱QUASI_CREDIT：准贷记卡PUBLIC_ACCOUNT：对公账户（网银B2B支付返回）
     */
    @JsonProperty("cardType")
    private String cardType = null;

    /**
     * 用户ID&lt;br&gt;微信支付返回openID&lt;br&gt;支付宝支付返回userID&lt;br&gt;银联支付返回userID&lt;br&gt;账户支付返回付款方商编
     */
    @JsonProperty("userID")
    private String userID = null;

    /**
     * unionID&lt;br&gt;&lt;span style&#x3D;\&quot;caret-color: #333333; color: #333333; font-family: Arial, sans-serif;\&quot;&gt;微信返回的unionID&lt;/span&gt;
     */
    @JsonProperty("unionID")
    private String unionID = null;

    /**
     * 支付宝买家登录账号&lt;br&gt;支付宝支付返回buyerLogonId
     */
    @JsonProperty("buyerLogonId")
    private String buyerLogonId = null;

    /**
     * 记帐簿编号
     */
    @JsonProperty("ypAccountBookNo")
    private String ypAccountBookNo = null;

}
