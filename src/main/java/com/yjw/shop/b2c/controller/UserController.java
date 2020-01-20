package com.yjw.shop.b2c.controller;


import com.yjw.shop.b2c.entity.User;
import com.yjw.shop.b2c.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 杨健文
 * @since 2020-01-10
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value ={"","login"},method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@Param("username") String username, @Param("password") String password, Map<String,Object> map,HttpSession httpSession){
        User user = userService.login(username, password);
        if (user == null){

            map.put("msg","用户名或密码错误，请重新输入");
            return "login";

//            httpServletRequest.setAttribute("messages","用户名或密码错误，请重新输入");
//            model.addAttribute("message","用户名或密码错误，请重新输入");
        }
        else {
            //将登陆信息存进session
            httpSession.setAttribute("session",user);
            return "index";
        }
    }

    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public String logout(String username,String password,HttpSession httpSession){
        httpSession.removeAttribute(username);
        httpSession.removeAttribute(password);
        return "login";
    }

}
