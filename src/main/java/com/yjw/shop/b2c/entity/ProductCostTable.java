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
public class ProductCostTable implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品SKU
     */
    @TableField("commoditySKU")
    private String commoditySKU;

    /**
     * 成本价
     */
    private Double costprice;

    /**
     * 生效起始时间
     */
    private LocalDateTime starttime;

    /**
     * 生效结束时间
     */
    private LocalDateTime endtime;

    public String getCommoditySKU() {
        return commoditySKU;
    }

    public void setCommoditySKU(String commoditySKU) {
        this.commoditySKU = commoditySKU;
    }
    public Double getCostprice() {
        return costprice;
    }

    public void setCostprice(Double costprice) {
        this.costprice = costprice;
    }
    public LocalDateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }
    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        return "ProductCostTable{" +
            "commoditySKU=" + commoditySKU +
            ", costprice=" + costprice +
            ", starttime=" + starttime +
            ", endtime=" + endtime +
        "}";
    }
}
