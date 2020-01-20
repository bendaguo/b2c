package com.yjw.shop.b2c.service;

import com.yjw.shop.b2c.entity.Logistics_provider_management;
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
public interface ILogistics_provider_managementService extends IService<Logistics_provider_management> {

    List<Logistics_provider_management> search(String keyword);

}
