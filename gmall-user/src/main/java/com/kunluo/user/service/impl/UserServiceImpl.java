package com.kunluo.user.service.impl;



import com.kunluo.bean.UserInfo;
import com.kunluo.user.mapper.UserMapper;
import com.kunluo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


/**
 * @description:
 * @author: kunluo
 * @create: 2019-07-07 11:57
 **/
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {
     @Autowired
     private UserMapper userMapper;

    @Override
    public List<UserInfo> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public String deleUserById(String id) {
        return null;
    }

    @Override
    public String modifyUserById(UserInfo userInfo) {
        return null;
    }

    @Override
    public String addUserInfo(UserInfo userInfo) {
        return null;
    }
}
