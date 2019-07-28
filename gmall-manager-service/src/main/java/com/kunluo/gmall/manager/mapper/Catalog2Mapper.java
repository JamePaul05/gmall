package com.kunluo.gmall.manager.mapper;

import com.kunluo.bean.BaseCatalog1;
import com.kunluo.bean.BaseCatalog2;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


/**
 * @description: 一级分类的mapper
 * @author: kunluo
 * @create: 2019-07-21 22:15
 **/
public interface Catalog2Mapper extends Mapper<BaseCatalog2> {

    @Select(value = "SELECT id , name FROM base_catalog2 WHERE catalog1_id =#{cataLog1Id}")
    List<BaseCatalog2> getAllBaseCatalog2BycataLog1Id(String cataLog1Id);
}
