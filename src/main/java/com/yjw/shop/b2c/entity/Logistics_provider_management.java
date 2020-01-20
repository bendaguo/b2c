package com.yjw.shop.b2c.entity;
//-------------------------hello

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 杨健文
 * @since 2020-01-10
 */
public class Logistics_provider_management implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 中文名称
     */
    private String cname;

    /**
     * 英文名称
     */
    private String ename;

    /**
     * 添加时间
     */
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

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Logistics_provider_management{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", ename='" + ename + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
