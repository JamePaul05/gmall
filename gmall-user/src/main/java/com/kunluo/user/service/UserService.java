package com.kunluo.user.service;

import com.kunluo.user.bean.UserInfo;

import java.util.List;

/**
 * @description:
 * @author: kunluo
 * @create: 2019-07-07 11:43
 **/
public interface UserService {

    List<UserInfo> getAllUser();
}