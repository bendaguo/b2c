package com.yjw.shop.b2c.entity;
//-------------------------hello

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yjw
 * @since 2020-06-28
 */
public class LogisticsFreightTable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物流运单号
     */
    private String lynumber;

    /**
     * 订单重量
     */
    private Double orderweight;

    /**
     * 物流费用
     */
    private Double lcosts;

    /**
     * 支付金额
     */
    private Double paymentmoney;

    /**
     * 支付方式
     */
    private String paymentmethod;

    /**
     * 币种
     */
    private String currency;

    /**
     * 支付状态
     */
    private String status;

    /**
     * 费用项
     */
    private String expenseitem;

    /**
     * 物流服务
     */
    private String lservice;

    /**
     * 支付时间
     */
    private LocalDateTime paytime;

    /**
     * 物流单创建时间
     */
    private LocalDateTime ordercreatetime;

    /**
     * 导入时间
     */
    private LocalDateTime importtime;

    /**
     * 备注
     */
    private String remarks;

    public String getLynumber() {
        return lynumber;
    }

    public void setLynumber(String lynumber) {
        this.lynumber = lynumber;
    }
    public Double getOrderweight() {
        return orderweight;
    }

    public void setOrderweight(Double orderweight) {
        this.orderweight = orderweight;
    }
    public Double getLcosts() {
        return lcosts;
    }

    public void setLcosts(Double lcosts) {
        this.lcosts = lcosts;
    }
    public Double getPaymentmoney() {
        return paymentmoney;
    }

    public void setPaymentmoney(Double paymentmoney) {
        this.paymentmoney = paymentmoney;
    }
    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getExpenseitem() {
        return expenseitem;
    }

    public void setExpenseitem(String expenseitem) {
        this.expenseitem = expenseitem;
    }
    public String getLservice() {
        return lservice;
    }

    public void setLservice(String lservice) {
        this.lservice = lservice;
    }
    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }
    public LocalDateTime getOrdercreatetime() {
        return ordercreatetime;
    }

    public void setOrdercreatetime(LocalDateTime ordercreatetime) {
        this.ordercreatetime = ordercreatetime;
    }
    public LocalDateTime getImporttime() {
        return importtime;
    }

    public void setImporttime(LocalDateTime importtime) {
        this.importtime = importtime;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "LogisticsFreightTable{" +
            "lynumber=" + lynumber +
            ", orderweight=" + orderweight +
            ", lcosts=" + lcosts +
            ", paymentmoney=" + paymentmoney +
            ", paymentmethod=" + paymentmethod +
            ", currency=" + currency +
            ", status=" + status +
            ", expenseitem=" + expenseitem +
            ", lservice=" + lservice +
            ", paytime=" + paytime +
            ", ordercreatetime=" + ordercreatetime +
            ", importtime=" + importtime +
            ", remarks=" + remarks +
        "}";
    }
}
