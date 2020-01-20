package com.yjw.shop.b2c.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yjw.shop.b2c.entity.Store_management;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 杨健文
 * @since 2020-01-10
 */
public interface IStore_managementService extends IService<Store_management> {
    /**
     * 搜索
     * @param keyword
     * @return
     */
    List<Store_management> search(String keyword);

    /**
     * 增加
     * @param store_management
     * @return
     */
    boolean addstore(Store_management store_management);



    boolean modifi(Store_management store_management);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean delete(Long id);

    Store_management getstore(Long id);

}
