/*
 * 标准交易
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.yeepay.yop.scenario.bindcard.domain.model.trade.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.ObjectUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 响应结果
 */
public class YopCreateOrderV2Res implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回码,OPR00000 成功
     */
    @JsonProperty("code")
    private String code = null;

    /**
     * 返回信息
     */
    @JsonProperty("message")
    private String message = null;

    /**
     * 发起方商编
     */
    @JsonProperty("parentMerchantNo")
    private String parentMerchantNo = null;

    /**
     * 商户编号
     */
    @JsonProperty("merchantNo")
    private String merchantNo = null;

    /**
     * 商户收款请求号
     */
    @JsonProperty("orderId")
    private String orderId = null;

    /**
     * 易宝收款订单号
     */
    @JsonProperty("uniqueOrderNo")
    private String uniqueOrderNo = null;

    /**
     * token
     */
    @JsonProperty("token")
    private String token = null;

    /**
     * 订单金额
     */
    @JsonProperty("orderAmount")
    private BigDecimal orderAmount = null;

    /**
     *
     */
    @JsonProperty("subOrderInfoList")
    private List<YopSubOrderDetail> subOrderInfoList = null;

    public YopCreateOrderV2Res code(String code) {
        this.code = code;
        return this;
    }

    /**
     * 返回码,OPR00000 成功
     *
     * @return code
     **/

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public YopCreateOrderV2Res message(String message) {
        this.message = message;
        return this;
    }

    /**
     * 返回信息
     *
     * @return message
     **/

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public YopCreateOrderV2Res parentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
        return this;
    }

    /**
     * 发起方商编
     *
     * @return parentMerchantNo
     **/

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public YopCreateOrderV2Res merchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
        return this;
    }

    /**
     * 商户编号
     *
     * @return merchantNo
     **/

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public YopCreateOrderV2Res orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 商户收款请求号
     *
     * @return orderId
     **/

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public YopCreateOrderV2Res uniqueOrderNo(String uniqueOrderNo) {
        this.uniqueOrderNo = uniqueOrderNo;
        return this;
    }

    /**
     * 易宝收款订单号
     *
     * @return uniqueOrderNo
     **/

    public String getUniqueOrderNo() {
        return uniqueOrderNo;
    }

    public void setUniqueOrderNo(String uniqueOrderNo) {
        this.uniqueOrderNo = uniqueOrderNo;
    }

    public YopCreateOrderV2Res token(String token) {
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

    public YopCreateOrderV2Res orderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }

    /**
     * 订单金额
     *
     * @return orderAmount
     **/

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public YopCreateOrderV2Res subOrderInfoList(List<YopSubOrderDetail> subOrderInfoList) {
        this.subOrderInfoList = subOrderInfoList;
        return this;
    }

    public YopCreateOrderV2Res addSubOrderInfoListItem(YopSubOrderDetail subOrderInfoListItem) {
        if (this.subOrderInfoList == null) {
            this.subOrderInfoList = new ArrayList<>();
        }
        this.subOrderInfoList.add(subOrderInfoListItem);
        return this;
    }

    /**
     * Get subOrderInfoList
     *
     * @return subOrderInfoList
     **/

    public List<YopSubOrderDetail> getSubOrderInfoList() {
        return subOrderInfoList;
    }

    public void setSubOrderInfoList(List<YopSubOrderDetail> subOrderInfoList) {
        this.subOrderInfoList = subOrderInfoList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        YopCreateOrderV2Res yopCreateOrderV2Res = (YopCreateOrderV2Res) o;
        return ObjectUtils.equals(this.code, yopCreateOrderV2Res.code) &&
                ObjectUtils.equals(this.message, yopCreateOrderV2Res.message) &&
                ObjectUtils.equals(this.parentMerchantNo, yopCreateOrderV2Res.parentMerchantNo) &&
                ObjectUtils.equals(this.merchantNo, yopCreateOrderV2Res.merchantNo) &&
                ObjectUtils.equals(this.orderId, yopCreateOrderV2Res.orderId) &&
                ObjectUtils.equals(this.uniqueOrderNo, yopCreateOrderV2Res.uniqueOrderNo) &&
                ObjectUtils.equals(this.token, yopCreateOrderV2Res.token) &&
                ObjectUtils.equals(this.orderAmount, yopCreateOrderV2Res.orderAmount) &&
                ObjectUtils.equals(this.subOrderInfoList, yopCreateOrderV2Res.subOrderInfoList);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(code, message, parentMerchantNo, merchantNo, orderId, uniqueOrderNo, token, orderAmount, subOrderInfoList);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class YopCreateOrderV2ResDTO {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    parentMerchantNo: ").append(toIndentedString(parentMerchantNo)).append("\n");
        sb.append("    merchantNo: ").append(toIndentedString(merchantNo)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    uniqueOrderNo: ").append(toIndentedString(uniqueOrderNo)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
        sb.append("    subOrderInfoList: ").append(toIndentedString(subOrderInfoList)).append("\n");
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

