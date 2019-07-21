package com.kunluo.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kunluo.bean.BaseCatalog1;
import com.kunluo.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description: 类别的controller
 * @author: kunluo
 * @create: 2019-07-21 22:40
 **/
@Controller
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatalog1(){
        return catalogService.getAllBaseCatalog1();
    }
}
