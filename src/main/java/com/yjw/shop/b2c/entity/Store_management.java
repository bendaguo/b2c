package com.yjw.shop.b2c.entity;
//-------------------------hello

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 杨健文
 * @since 2020-01-10
 */
public class Store_management implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号id
     */
    @TableId(value = "id", type = IdType.AUTO)
//    @Excel(name="id",orderNum = "0")
    private Long id;

    /**
     * 店铺名称
     */
    @Excel(name = "店铺名称",orderNum = "1")
    private String shopname;

    /**
     * 上架平台
     */
    @Excel(name = "上架平台",orderNum = "2")
    private String addshop;

    /**
     * 添加时间
     */
    @Excel(name = "添加时间",orderNum = "3",format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getAddshop() {
        return addshop;
    }

    public void setAddshop(String addshop) {
        this.addshop = addshop;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Store_management{" +
                "id=" + id +
                ", shopname='" + shopname + '\'' +
                ", addshop='" + addshop + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
