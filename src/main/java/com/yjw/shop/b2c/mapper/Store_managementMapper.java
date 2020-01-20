package com.yjw.shop.b2c.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yjw.shop.b2c.entity.Store_management;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
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
public interface Store_managementMapper extends BaseMapper<Store_management> {


    List<Store_management> search(Store_management store_management);


}
