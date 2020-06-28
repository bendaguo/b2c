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
public class SellingGood implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品SKU
     */
    @TableField("commoditySKU")
    private String commoditySKU;

    /**
     * 入货价
     */
    private Double pprice;

    /**
     * 重量KG
     */
    @TableField("weightKG")
    private Double weightKG;

    /**
     * 重量G
     */
    @TableField("weightG")
    private Double weightG;

    /**
     * 运费
     */
    private Double flyprice;

    /**
     * 打包费
     */
    private Integer packingprice;

    /**
     * 汇率
     */
    private Double exchangerate;

    /**
     * 佣金汇率
     */
    private Double commissionrate;

    /**
     * 毛利润
     */
    private Double gprofit;

    /**
     * 销售价
     */
    private Double sellingprice;

    /**
     * 折扣率
     */
    private Double drate;

    /**
     * 折前价
     */
    private Double pdrate;

    /**
     * 折扣1
     */
    private Double discount1;

    /**
     * 折扣1售价
     */
    private Double discount1saleprice;

    /**
     * 折扣2
     */
    private Double discount2;

    /**
     * 折扣2售价
     */
    private Double discount2saleprice;

    /**
     * 折扣3
     */
    private Double discount3;

    /**
     * 折扣3售价
     */
    private Double discount3saleprice;

    /**
     * 店铺名称
     */
    private String shopname;

    /**
     * 备注
     */
    @TableField("Remarks")
    private String Remarks;

    /**
     * 导入时间
     */
    private LocalDateTime importtime;

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
    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }
    public Double getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(Double weightKG) {
        this.weightKG = weightKG;
    }
    public Double getWeightG() {
        return weightG;
    }

    public void setWeightG(Double weightG) {
        this.weightG = weightG;
    }
    public Double getFlyprice() {
        return flyprice;
    }

    public void setFlyprice(Double flyprice) {
        this.flyprice = flyprice;
    }
    public Integer getPackingprice() {
        return packingprice;
    }

    public void setPackingprice(Integer packingprice) {
        this.packingprice = packingprice;
    }
    public Double getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
    }
    public Double getCommissionrate() {
        return commissionrate;
    }

    public void setCommissionrate(Double commissionrate) {
        this.commissionrate = commissionrate;
    }
    public Double getGprofit() {
        return gprofit;
    }

    public void setGprofit(Double gprofit) {
        this.gprofit = gprofit;
    }
    public Double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Double sellingprice) {
        this.sellingprice = sellingprice;
    }
    public Double getDrate() {
        return drate;
    }

    public void setDrate(Double drate) {
        this.drate = drate;
    }
    public Double getPdrate() {
        return pdrate;
    }

    public void setPdrate(Double pdrate) {
        this.pdrate = pdrate;
    }
    public Double getDiscount1() {
        return discount1;
    }

    public void setDiscount1(Double discount1) {
        this.discount1 = discount1;
    }
    public Double getDiscount1saleprice() {
        return discount1saleprice;
    }

    public void setDiscount1saleprice(Double discount1saleprice) {
        this.discount1saleprice = discount1saleprice;
    }
    public Double getDiscount2() {
        return discount2;
    }

    public void setDiscount2(Double discount2) {
        this.discount2 = discount2;
    }
    public Double getDiscount2saleprice() {
        return discount2saleprice;
    }

    public void setDiscount2saleprice(Double discount2saleprice) {
        this.discount2saleprice = discount2saleprice;
    }
    public Double getDiscount3() {
        return discount3;
    }

    public void setDiscount3(Double discount3) {
        this.discount3 = discount3;
    }
    public Double getDiscount3saleprice() {
        return discount3saleprice;
    }

    public void setDiscount3saleprice(Double discount3saleprice) {
        this.discount3saleprice = discount3saleprice;
    }
    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }
    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }
    public LocalDateTime getImporttime() {
        return importtime;
    }

    public void setImporttime(LocalDateTime importtime) {
        this.importtime = importtime;
    }
    public String getSupplierlink() {
        return supplierlink;
    }

    public void setSupplierlink(String supplierlink) {
        this.supplierlink = supplierlink;
    }

    @Override
    public String toString() {
        return "SellingGood{" +
            "commoditySKU=" + commoditySKU +
            ", pprice=" + pprice +
            ", weightKG=" + weightKG +
            ", weightG=" + weightG +
            ", flyprice=" + flyprice +
            ", packingprice=" + packingprice +
            ", exchangerate=" + exchangerate +
            ", commissionrate=" + commissionrate +
            ", gprofit=" + gprofit +
            ", sellingprice=" + sellingprice +
            ", drate=" + drate +
            ", pdrate=" + pdrate +
            ", discount1=" + discount1 +
            ", discount1saleprice=" + discount1saleprice +
            ", discount2=" + discount2 +
            ", discount2saleprice=" + discount2saleprice +
            ", discount3=" + discount3 +
            ", discount3saleprice=" + discount3saleprice +
            ", shopname=" + shopname +
            ", Remarks=" + Remarks +
            ", importtime=" + importtime +
            ", supplierlink=" + supplierlink +
        "}";
    }
}
