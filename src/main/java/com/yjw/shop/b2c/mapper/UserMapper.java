package com.yjw.shop.b2c.mapper;

import com.yjw.shop.b2c.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

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
@ResponseBody
public interface UserMapper extends BaseMapper<User> {

    User getByUsername(String username);

}
