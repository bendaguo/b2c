package com.yjw.shop.b2c.controller;


import com.yjw.shop.b2c.entity.Logistics_provider_management;
import com.yjw.shop.b2c.entity.Store_management;
import com.yjw.shop.b2c.service.ILogistics_provider_managementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 杨健文
 * @since 2020-01-10
 */
@Controller
@RequestMapping("/b2c")
public class Logistics_provider_managementController {

    @Autowired
    ILogistics_provider_managementService logistics;

    @GetMapping("logisstics")
    public String logistics(Model model){
        List<Logistics_provider_management> list = logistics.list();
        model.addAttribute("list",list);
        return "logistics";
    }
    @PostMapping("search_log")
    public String search(String keyword, Model model){
        List<Logistics_provider_management> list = logistics.search(keyword);
        model.addAttribute("list",list);
        return "logistics";
    }
}
