package com.yjw.shop.b2c.entity;
//-------------------------hello

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yjw
 * @since 2020-06-28
 */
public class ProductCost implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    private String ordernumber;

    /**
     * 物流运单号
     */
    private String shipmentid;

    /**
     * 订单总收入
     */
    private Double ordertotalmoney;

    /**
     * 产品总收入
     */
    private Double costtotalmoney;

    /**
     * 物流费用
     */
    private Double logisticscosts;

    /**
     * 退款费用
     */
    private Double refundmoney;

    /**
     * 订单利润
     */
    private Double orderprofit;

    /**
     * 目的国家
     */
    private String dcountry;

    /**
     * 订单重量
     */
    private Double orderweight;

    /**
     * 物流成本
     */
    private Double lcosts;

    /**
     * 结算时间
     */
    @TableField("Settlementtime")
    private LocalDateTime Settlementtime;

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }
    public String getShipmentid() {
        return shipmentid;
    }

    public void setShipmentid(String shipmentid) {
        this.shipmentid = shipmentid;
    }
    public Double getOrdertotalmoney() {
        return ordertotalmoney;
    }

    public void setOrdertotalmoney(Double ordertotalmoney) {
        this.ordertotalmoney = ordertotalmoney;
    }
    public Double getCosttotalmoney() {
        return costtotalmoney;
    }

    public void setCosttotalmoney(Double costtotalmoney) {
        this.costtotalmoney = costtotalmoney;
    }
    public Double getLogisticscosts() {
        return logisticscosts;
    }

    public void setLogisticscosts(Double logisticscosts) {
        this.logisticscosts = logisticscosts;
    }
    public Double getRefundmoney() {
        return refundmoney;
    }

    public void setRefundmoney(Double refundmoney) {
        this.refundmoney = refundmoney;
    }
    public Double getOrderprofit() {
        return orderprofit;
    }

    public void setOrderprofit(Double orderprofit) {
        this.orderprofit = orderprofit;
    }
    public String getDcountry() {
        return dcountry;
    }

    public void setDcountry(String dcountry) {
        this.dcountry = dcountry;
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
    public LocalDateTime getSettlementtime() {
        return Settlementtime;
    }

    public void setSettlementtime(LocalDateTime Settlementtime) {
        this.Settlementtime = Settlementtime;
    }

    @Override
    public String toString() {
        return "ProductCost{" +
            "ordernumber=" + ordernumber +
            ", shipmentid=" + shipmentid +
            ", ordertotalmoney=" + ordertotalmoney +
            ", costtotalmoney=" + costtotalmoney +
            ", logisticscosts=" + logisticscosts +
            ", refundmoney=" + refundmoney +
            ", orderprofit=" + orderprofit +
            ", dcountry=" + dcountry +
            ", orderweight=" + orderweight +
            ", lcosts=" + lcosts +
            ", Settlementtime=" + Settlementtime +
        "}";
    }
}
