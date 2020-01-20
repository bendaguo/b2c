package com.yjw.shop.b2c.service.impl;

import com.yjw.shop.b2c.entity.Logistics_provider_management;
import com.yjw.shop.b2c.mapper.Logistics_provider_managementMapper;
import com.yjw.shop.b2c.service.ILogistics_provider_managementService;
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
public class Logistics_provider_managementServiceImpl extends ServiceImpl<Logistics_provider_managementMapper, Logistics_provider_management> implements ILogistics_provider_managementService {

    @Autowired
    Logistics_provider_managementMapper logistics;
    @Override
    public List<Logistics_provider_management> search(String keyword) {
        Logistics_provider_management log = new Logistics_provider_management();
        log.setCname(keyword);
        log.setEname(keyword);
        return logistics.search(log);
    }
}
