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
}
