package com.kunluo.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kunluo.gmall.manager.mapper.Catalog1Mapper;
import com.kunluo.bean.BaseCatalog1;
import com.kunluo.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @description: 类别的service
 * @author: kunluo
 * @create: 2019-07-21 22:10
 **/
@Service
public class CatalogServiceImpl implements CatalogService{

    @Autowired
    private Catalog1Mapper catalog1Mapper;
    @Override
    public List<BaseCatalog1> getAllBaseCatalog1() {
        return catalog1Mapper.selectAll();
    }
}
