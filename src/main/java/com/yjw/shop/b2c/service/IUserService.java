package com.yjw.shop.b2c.service;

import com.yjw.shop.b2c.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 杨健文
 * @since 2020-01-10
 */
public interface IUserService extends IService<User> {
    /**
     *
     * @param username
     * @param password
     * @return
     */
    User login(String username,String password);

}
