package com.kunluo.user.service.impl;



import com.kunluo.bean.UserInfo;
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

    @Override
    public List<UserInfo> getAllUser() {
        return null;
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
