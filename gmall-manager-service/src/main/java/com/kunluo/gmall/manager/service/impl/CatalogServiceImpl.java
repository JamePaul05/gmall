package com.kunluo.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kunluo.bean.BaseAttrInfo;
import com.kunluo.bean.BaseCatalog2;
import com.kunluo.bean.BaseCatalog3;
import com.kunluo.gmall.manager.mapper.BaseAttrInfoMapper;
import com.kunluo.gmall.manager.mapper.Catalog1Mapper;
import com.kunluo.bean.BaseCatalog1;
import com.kunluo.gmall.manager.mapper.Catalog2Mapper;
import com.kunluo.gmall.manager.mapper.Catalog3Mapper;
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

    @Autowired
    private Catalog2Mapper catalog2Mapper;

    @Autowired
    private Catalog3Mapper catalog3Mapper;

    @Autowired
    private BaseAttrInfoMapper baseAttrInfoMapper;
    @Override
    public List<BaseCatalog1> getAllBaseCatalog1() {
        return catalog1Mapper.selectAll();
    }

    @Override
    public List<BaseCatalog2> getAllBaseCatalog2BycataLog1Id(String cataLog1Id) {
        return catalog2Mapper.getAllBaseCatalog2BycataLog1Id(cataLog1Id);
    }

    @Override
    public List<BaseCatalog3> getAllBaseCatalog3BycataLog2Id(String cataLog2Id) {
        BaseCatalog3 baseCatalog3 = new BaseCatalog3();
        baseCatalog3.setCatalog2Id(cataLog2Id);
        return catalog3Mapper.select(baseCatalog3);
    }

    @Override
    public List<BaseAttrInfo> getAllAttrListByCtg3Id(String cataLog3Id) {
        BaseAttrInfo baseAttrInfo = new BaseAttrInfo();
        baseAttrInfo.setCatalog3Id(cataLog3Id);
        return baseAttrInfoMapper.select(baseAttrInfo);
    }
}
