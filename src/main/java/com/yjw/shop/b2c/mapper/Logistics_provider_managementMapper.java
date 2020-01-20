package com.yjw.shop.b2c.mapper;

import com.yjw.shop.b2c.entity.Logistics_provider_management;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 杨健文
 * @since 2020-01-10
 */
@Repository
public interface Logistics_provider_managementMapper extends BaseMapper<Logistics_provider_management> {
    List<Logistics_provider_management> search(Logistics_provider_management logistics_provider_management);

}
