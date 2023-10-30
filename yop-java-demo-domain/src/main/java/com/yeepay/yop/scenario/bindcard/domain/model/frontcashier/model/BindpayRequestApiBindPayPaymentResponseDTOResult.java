/*
 * 前置收银台
 * 前置收银台
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.yeepay.yop.scenario.bindcard.domain.model.frontcashier.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.ObjectUtils;

import java.io.Serializable;

/**
 * BindpayRequestApiBindPayPaymentResponseDTOResult
 */
public class BindpayRequestApiBindPayPaymentResponseDTOResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * token
     */
    @JsonProperty("token")
    private String token = null;

    /**
     * 绑卡ID
     */
    @JsonProperty("bindId")
    private String bindId = null;

    /**
     * 商编
     */
    @JsonProperty("merchantNo")
    private String merchantNo = null;

    /**
     * 返回码
     */
    @JsonProperty("code")
    private String code = null;

    /**
     * 返回消息
     */
    @JsonProperty("message")
    private String message = null;

    /**
     * 补充项
     */
    @JsonProperty("needItems")
    private String needItems = null;

    /**
     * 短验类型
     */
    @JsonProperty("verifyCodeType")
    private String verifyCodeType = null;

    /**
     * 补充项场景
     */
    @JsonProperty("supplyNeedItemScene")
    private String supplyNeedItemScene = null;

    /**
     * 支付记录ID
     */
    @JsonProperty("recordId")
    private String recordId = null;

    public BindpayRequestApiBindPayPaymentResponseDTOResult token(String token) {
        this.token = token;
        return this;
    }

    /**
     * token
     *
     * @return token
     **/

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public BindpayRequestApiBindPayPaymentResponseDTOResult bindId(String bindId) {
        this.bindId = bindId;
        return this;
    }

    /**
     * 绑卡ID
     *
     * @return bindId
     **/

    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public BindpayRequestApiBindPayPaymentResponseDTOResult merchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
        return this;
    }

    /**
     * 商编
     *
     * @return merchantNo
     **/

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public BindpayRequestApiBindPayPaymentResponseDTOResult code(String code) {
        this.code = code;
        return this;
    }

    /**
     * 返回码
     *
     * @return code
     **/

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BindpayRequestApiBindPayPaymentResponseDTOResult message(String message) {
        this.message = message;
        return this;
    }

    /**
     * 返回消息
     *
     * @return message
     **/

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BindpayRequestApiBindPayPaymentResponseDTOResult needItems(String needItems) {
        this.needItems = needItems;
        return this;
    }

    /**
     * 补充项
     *
     * @return needItems
     **/

    public String getNeedItems() {
        return needItems;
    }

    public void setNeedItems(String needItems) {
        this.needItems = needItems;
    }

    public BindpayRequestApiBindPayPaymentResponseDTOResult verifyCodeType(String verifyCodeType) {
        this.verifyCodeType = verifyCodeType;
        return this;
    }

    /**
     * 短验类型
     *
     * @return verifyCodeType
     **/

    public String getVerifyCodeType() {
        return verifyCodeType;
    }

    public void setVerifyCodeType(String verifyCodeType) {
        this.verifyCodeType = verifyCodeType;
    }

    public BindpayRequestApiBindPayPaymentResponseDTOResult supplyNeedItemScene(String supplyNeedItemScene) {
        this.supplyNeedItemScene = supplyNeedItemScene;
        return this;
    }

    /**
     * 补充项场景
     *
     * @return supplyNeedItemScene
     **/

    public String getSupplyNeedItemScene() {
        return supplyNeedItemScene;
    }

    public void setSupplyNeedItemScene(String supplyNeedItemScene) {
        this.supplyNeedItemScene = supplyNeedItemScene;
    }

    public BindpayRequestApiBindPayPaymentResponseDTOResult recordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 支付记录ID
     *
     * @return recordId
     **/

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BindpayRequestApiBindPayPaymentResponseDTOResult bindpayRequestApiBindPayPaymentResponseDTOResult = (BindpayRequestApiBindPayPaymentResponseDTOResult) o;
        return ObjectUtils.equals(this.token, bindpayRequestApiBindPayPaymentResponseDTOResult.token) &&
                ObjectUtils.equals(this.bindId, bindpayRequestApiBindPayPaymentResponseDTOResult.bindId) &&
                ObjectUtils.equals(this.merchantNo, bindpayRequestApiBindPayPaymentResponseDTOResult.merchantNo) &&
                ObjectUtils.equals(this.code, bindpayRequestApiBindPayPaymentResponseDTOResult.code) &&
                ObjectUtils.equals(this.message, bindpayRequestApiBindPayPaymentResponseDTOResult.message) &&
                ObjectUtils.equals(this.needItems, bindpayRequestApiBindPayPaymentResponseDTOResult.needItems) &&
                ObjectUtils.equals(this.verifyCodeType, bindpayRequestApiBindPayPaymentResponseDTOResult.verifyCodeType) &&
                ObjectUtils.equals(this.supplyNeedItemScene, bindpayRequestApiBindPayPaymentResponseDTOResult.supplyNeedItemScene) &&
                ObjectUtils.equals(this.recordId, bindpayRequestApiBindPayPaymentResponseDTOResult.recordId);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(token, bindId, merchantNo, code, message, needItems, verifyCodeType, supplyNeedItemScene, recordId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindpayRequestApiBindPayPaymentResponseDTOResult {\n");

        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    bindId: ").append(toIndentedString(bindId)).append("\n");
        sb.append("    merchantNo: ").append(toIndentedString(merchantNo)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    needItems: ").append(toIndentedString(needItems)).append("\n");
        sb.append("    verifyCodeType: ").append(toIndentedString(verifyCodeType)).append("\n");
        sb.append("    supplyNeedItemScene: ").append(toIndentedString(supplyNeedItemScene)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

