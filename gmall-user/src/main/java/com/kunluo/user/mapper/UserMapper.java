package com.kunluo.user.mapper;


import com.kunluo.bean.UserInfo;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @description: 用户mapper
 * @author: kunluo
 * @create: 2019-07-07 11:47
 **/
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<UserInfo>{

}