package com.kunluo.gmall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @description: 负责页面的跳转的controller
 * @author: kunluo
 * @create: 2019-07-21 10:27
 **/
@Controller
public class IndexController  {

    @RequestMapping("attrListPage")
    public String attrListPage(){
        return "attrListPage";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
