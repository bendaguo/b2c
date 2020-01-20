package com.yjw.shop.b2c.service.impl;

import com.yjw.shop.b2c.entity.User;
import com.yjw.shop.b2c.mapper.UserMapper;
import com.yjw.shop.b2c.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User login(String username, String password) {
        User user = userMapper.getByUsername(username);
            if (user != null){
                //铭文密码加密
                String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
                if (md5DigestAsHex.equals(user.getPassword())) {
                    return user;
                }
            }
        return null;
    }



}
