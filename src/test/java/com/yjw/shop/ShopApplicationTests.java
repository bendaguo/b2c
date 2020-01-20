package com.yjw.shop;

import com.yjw.shop.b2c.entity.Logistics_provider_management;
import com.yjw.shop.b2c.entity.Store_management;
import com.yjw.shop.b2c.entity.User;
import com.yjw.shop.b2c.service.ILogistics_provider_managementService;
import com.yjw.shop.b2c.service.IStore_managementService;
import com.yjw.shop.b2c.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@SpringBootTest
class ShopApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    IUserService userService;
    @Test
    public void testInsert(){
        User user = new User();
        user.setUsername("ddd");
        user.setPassword(DigestUtils.md5DigestAsHex("9999".getBytes()));
        user.setCreatetime(new Date());
//        userService.insert(user);
        System.out.println(user);
    }

    @Test
    public void testMD5(){
        System.out.println(DigestUtils.md5DigestAsHex("123456".getBytes()));
    }

    @Test
    public void testgetByUsername(){
        User user = userService.login("yjw", "456");
        System.out.println(user);
    }

    @Test
    public void testgetByUsername1(){
        User user = userService.login("yjw", "123456");
        System.out.println(user);
    }

    @Autowired
    IStore_managementService store_managementService;

    @Test
    public void testselectAll(){
        List<Store_management> list = store_managementService.list();
        for (Store_management s:list){
            System.out.println(s);
        }
    }

    @Autowired
    ILogistics_provider_managementService logistics;

    @Test
    public void testselectAll11() {
        List<Logistics_provider_management> list = logistics.list();
        for (Logistics_provider_management L:list
             ) {
            System.out.println(L);
        }
    }

    @Test
    public void testsave(){
        Store_management store = new Store_management();
        store.setAddshop("淘宝");
        store.setShopname("杨大大养殖场");
        store.setCreatetime(new Date());
        store_managementService.save(store);
    }

    @Test
    public void testdelete(){
        store_managementService.delete(30L);
    }
}
