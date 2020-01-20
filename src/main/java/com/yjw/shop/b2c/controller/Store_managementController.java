package com.yjw.shop.b2c.controller;


import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.yjw.shop.b2c.config.ExcelUtiles;
import com.yjw.shop.b2c.entity.Store_management;
import com.yjw.shop.b2c.service.IStore_managementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
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
@RequestMapping("/b2c")
public class Store_managementController {
    @Autowired
    IStore_managementService store_managementService;

    /**
     * 跳转到店铺管理
     *
     * @return
     */
    @GetMapping("store")
    public String store(Model model) {
        List<Store_management> list = store_managementService.list();
        model.addAttribute("stores", list);
        return "store";
    }

    @GetMapping("/b2c/save")
    public String save_store() {
        return "store_modifi";
    }

    @PostMapping("search")
    public String search(String keyword, Model model) {
        List<Store_management> list = store_managementService.search(keyword);
        model.addAttribute("list", list);
        return "store";
    }


    @GetMapping("/b2c/delete")
    public String delete(Long id) {
        boolean result = store_managementService.delete(id);
        if (result) {
            return "redirect:/b2c/store";
        }
        return "redirect:/b2c/store";
    }

    @GetMapping("/modifi/{id}")
    public String modifi(@PathVariable("id") Long id, Model model) {
        Store_management store = store_managementService.getstore(id);
        model.addAttribute("store", store);
        return "store_modifi";
    }

    /**
     * putmapping 更新信息
     *
     * @param store_management
     * @return
     */
    @PostMapping("/save1")
    public String modifiSave(Store_management store_management) {
        boolean result = store_managementService.modifi(store_management);
        System.out.println(store_management + "qqq");
        if (result) {
            return "redirect:/b2c/store";
        }
        return "forward:/b2c/modifi/" + store_management.getId();
    }

    @PostMapping("save")
    public String addStore(Store_management store_management) {
        store_management.setCreatetime(new Date());
        boolean addstore = store_managementService.addstore(store_management);
        System.out.println(store_management + "ddd");
        if (addstore) {
            return "redirect:/b2c/store";
        }
        return "store_modifi";
    }

    /**
     * 导出全部数据
     *
     * @param response
     * @return
     */
    @GetMapping("/export")
    public void export(HttpServletResponse response) {

        List<Store_management> personList = store_managementService.list();
        // 导出操作
        ExcelUtiles.exportExcel(personList, "店铺管理", "店铺管理", Store_management.class, "店铺管理.xlsx", response);
    }

    /**
     *
     * @param file
     * @return
     */
    @PostMapping("/importExce")
    public Object importExce(@RequestParam("file") MultipartFile file, String shopname, String addshop,Date createtime) {

        ImportParams param = new ImportParams();
        param.setHeadRows(1);
        param.setTitleRows(1);
        param.setNeedVerfiy(true);
        return null;
    }

    @PostMapping("upload")
    public void upload(@RequestParam("file")MultipartFile file){
        ImportParams params = new ImportParams();
        params.setHeadRows(1);
        params.setTitleRows(1);
        params.setNeedVerfiy(true);
        try{
            ExcelImportResult<Store_management> result = ExcelImportUtil.importExcelMore(file.getInputStream(), Store_management.class, params);
            List<Store_management> list = result.getList();
            store_managementService.saveBatch(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



























