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
public class PurchaseRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品SKU
     */
    @TableField("commoditySKU")
    private String commoditySKU;

    /**
     * 进货单价
     */
    private Double puprice;

    /**
     * 运费
     */
    private Double flyprice;

    /**
     * 进货数量
     */
    private Integer puquantity;

    /**
     * 进货总额
     */
    private Double totalpurchase;

    /**
     * 成本价
     */
    private Double costprice;

    /**
     * 进货时间
     */
    private LocalDateTime putime;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 中文搜索名
     */
    private String cname;

    /**
     * 供应商链接
     */
    private String supplierlink;

    public String getCommoditySKU() {
        return commoditySKU;
    }

    public void setCommoditySKU(String commoditySKU) {
        this.commoditySKU = commoditySKU;
    }
    public Double getPuprice() {
        return puprice;
    }

    public void setPuprice(Double puprice) {
        this.puprice = puprice;
    }
    public Double getFlyprice() {
        return flyprice;
    }

    public void setFlyprice(Double flyprice) {
        this.flyprice = flyprice;
    }
    public Integer getPuquantity() {
        return puquantity;
    }

    public void setPuquantity(Integer puquantity) {
        this.puquantity = puquantity;
    }
    public Double getTotalpurchase() {
        return totalpurchase;
    }

    public void setTotalpurchase(Double totalpurchase) {
        this.totalpurchase = totalpurchase;
    }
    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
    }
    public LocalDateTime getPutime() {
        return putime;
    }

    public void setPutime(LocalDateTime putime) {
        this.putime = putime;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getSupplierlink() {
        return supplierlink;
    }

    public void setSupplierlink(String supplierlink) {
        this.supplierlink = supplierlink;
    }

    @Override
    public String toString() {
        return "PurchaseRecord{" +
            "commoditySKU=" + commoditySKU +
            ", puprice=" + puprice +
            ", flyprice=" + flyprice +
            ", puquantity=" + puquantity +
            ", totalpurchase=" + totalpurchase +
            ", costprice=" + costprice +
            ", putime=" + putime +
            ", remarks=" + remarks +
            ", cname=" + cname +
            ", supplierlink=" + supplierlink +
        "}";
    }
}
