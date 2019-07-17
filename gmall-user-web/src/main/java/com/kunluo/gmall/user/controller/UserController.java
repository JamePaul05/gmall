package com.kunluo.user.controller;

import com.kunluo.user.UserInfo;
import com.kunluo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description: 用户相关的Controller层
 * @author: kunluo
 * @create: 2019-07-07 11:35
 **/
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UserInfo> getAllUser(){
        List<UserInfo> userInfoList =  userService.getAllUser();
        return userInfoList;
    }

    @RequestMapping("deleUserById")
    @ResponseBody
    public String deleUserById(String id){
        return userService.deleUserById(id);
   }
    @RequestMapping("modifyUserById")
    @ResponseBody
   public String modifyUserById(UserInfo userInfo){
        return userService.modifyUserById(userInfo);
   }

   @RequestMapping("addUserInfo")
    @ResponseBody
    public String  addUserInfo(UserInfo userInfo){
       return userService.addUserInfo(userInfo);
   }



}
