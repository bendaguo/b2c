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
public class GoodOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号id
     */
    private String orderid;

    /**
     * 物流单号
     */
    private String shipmentid;

    /**
     * 产品总金额
     */
    private Double productmoney;

    /**
     * 订单总金额
     */
    private Double totalmoney;

    /**
     * 店铺优惠
     */
    private Double shoppromotions;

    /**
     * 币种
     */
    private String currency;

    /**
     * 汇率
     */
    private Double erate;

    /**
     * 0:未结算，1：已结算
     */
    private Integer status;

    /**
     * 目的国家
     */
    private String dcountry;

    /**
     * 买家名称
     */
    private String buyname;

    /**
     * 订单状态
     */
    private String orderstate;

    /**
     * 下单时间
     */
    private LocalDateTime ordertime;

    /**
     * 付款时间
     */
    private LocalDateTime paytime;

    /**
     * 物流方式
     */
    private String shipmethod;

    /**
     * 实际发货单号
     */
    private String shipnumber;

    /**
     * 发货时间
     */
    private String shiptime;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
    public String getShipmentid() {
        return shipmentid;
    }

    public void setShipmentid(String shipmentid) {
        this.shipmentid = shipmentid;
    }
    public Double getProductmoney() {
        return productmoney;
    }

    public void setProductmoney(Double productmoney) {
        this.productmoney = productmoney;
    }
    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }
    public Double getShoppromotions() {
        return shoppromotions;
    }

    public void setShoppromotions(Double shoppromotions) {
        this.shoppromotions = shoppromotions;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Double getErate() {
        return erate;
    }

    public void setErate(Double erate) {
        this.erate = erate;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getDcountry() {
        return dcountry;
    }

    public void setDcountry(String dcountry) {
        this.dcountry = dcountry;
    }
    public String getBuyname() {
        return buyname;
    }

    public void setBuyname(String buyname) {
        this.buyname = buyname;
    }
    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }
    public LocalDateTime getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(LocalDateTime ordertime) {
        this.ordertime = ordertime;
    }
    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }
    public String getShipmethod() {
        return shipmethod;
    }

    public void setShipmethod(String shipmethod) {
        this.shipmethod = shipmethod;
    }
    public String getShipnumber() {
        return shipnumber;
    }

    public void setShipnumber(String shipnumber) {
        this.shipnumber = shipnumber;
    }
    public String getShiptime() {
        return shiptime;
    }

    public void setShiptime(String shiptime) {
        this.shiptime = shiptime;
    }

    @Override
    public String toString() {
        return "GoodOrder{" +
            "orderid=" + orderid +
            ", shipmentid=" + shipmentid +
            ", productmoney=" + productmoney +
            ", totalmoney=" + totalmoney +
            ", shoppromotions=" + shoppromotions +
            ", currency=" + currency +
            ", erate=" + erate +
            ", status=" + status +
            ", dcountry=" + dcountry +
            ", buyname=" + buyname +
            ", orderstate=" + orderstate +
            ", ordertime=" + ordertime +
            ", paytime=" + paytime +
            ", shipmethod=" + shipmethod +
            ", shipnumber=" + shipnumber +
            ", shiptime=" + shiptime +
        "}";
    }
}
