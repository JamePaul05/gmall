package com.kunluo.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kunluo.bean.BaseAttrInfo;
import com.kunluo.bean.BaseCatalog1;
import com.kunluo.bean.BaseCatalog2;
import com.kunluo.bean.BaseCatalog3;
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

    /**
     * 页面加载获取一级分类的数据
     * @return
     */
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatalog1(){
        return catalogService.getAllBaseCatalog1();
    }

    /**
     * 根据一级分类的id动态级联查询二级分类的数据
     * @param cataLog1Id 一级分类的id
     * @return
     */
    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> getCatalog2(String cataLog1Id){
        return catalogService.getAllBaseCatalog2BycataLog1Id(cataLog1Id);
    }

    /**
     *  根据二级分类的id动态级联查询三级分类的数据
     * @param cataLog2Id 二级分类的id
     * @return
     */
    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getCatalog3(String cataLog2Id){
        return catalogService.getAllBaseCatalog3BycataLog2Id(cataLog2Id);
    }


    /**
     *  根据三级分类的id查询所有的属性值
     * @param cataLog3Id  三级分类id
     * @return
     */
    @RequestMapping("getAllAttrListByCtg3Id")
    @ResponseBody
    public List<BaseAttrInfo> getAllAttrListByCtg3Id(String cataLog3Id){
        return catalogService.getAllAttrListByCtg3Id(cataLog3Id);
    }

}
