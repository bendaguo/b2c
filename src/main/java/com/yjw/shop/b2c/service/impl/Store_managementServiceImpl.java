package com.yjw.shop.b2c.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yjw.shop.b2c.entity.Store_management;
import com.yjw.shop.b2c.mapper.Store_managementMapper;
import com.yjw.shop.b2c.service.IStore_managementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 杨健文
 * @since 2020-01-10
 */
@Service
public class Store_managementServiceImpl extends ServiceImpl<Store_managementMapper, Store_management> implements IStore_managementService {

    @Autowired
    Store_managementMapper store_mapper;


    @Override
    public List<Store_management> search(String keyword) {
        Store_management store = new Store_management();
        store.setShopname(keyword);
        store.setAddshop(keyword);
        return store_mapper.search(store);
    }

    @Override
    public boolean addstore(Store_management store_management) {
        int result = store_mapper.insert(store_management);
        boolean flag=false;
        if (result>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean modifi(Store_management store_management) {
        int result = store_mapper.updateById(store_management);
        boolean flag=false;
        if (result>0){
            flag=true;
        }
        return true;
    }

    @Override
    public boolean delete(Long id) {
        int result = store_mapper.deleteById(id);
        boolean flag= false;
        if (result>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public Store_management getstore(Long id) {
        return store_mapper.selectById(id);
    }


}
