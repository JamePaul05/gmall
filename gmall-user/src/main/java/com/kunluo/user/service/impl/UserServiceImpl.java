package com.kunluo.user.service.impl;

import com.kunluo.user.bean.UserInfo;
import com.kunluo.user.mapper.UserMapper;
import com.kunluo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: kunluo
 * @create: 2019-07-07 11:57
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserInfo> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public String deleUserById(String id) {
        return Integer.toString( userMapper.deleteByPrimaryKey(id));
    }

    @Override
    public String modifyUserById(UserInfo userInfo) {
        UserInfo existUserInfo = userMapper.selectByPrimaryKey(userInfo.getId());
        if(null != existUserInfo){
            return Integer.toString(userMapper.updateByPrimaryKey(userInfo));
        }
        return "用户不存在";
    }

    @Override
    public String addUserInfo(UserInfo userInfo) {
        return Integer.toString(userMapper.insert(userInfo));
    }
}
