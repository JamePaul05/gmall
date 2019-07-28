package com.kunluo.service;

import com.kunluo.bean.BaseAttrInfo;
import com.kunluo.bean.BaseCatalog1;
import com.kunluo.bean.BaseCatalog2;
import com.kunluo.bean.BaseCatalog3;

import java.util.List;

public interface CatalogService {

    List<BaseCatalog1> getAllBaseCatalog1();


    List<BaseCatalog2> getAllBaseCatalog2BycataLog1Id(String cataLog1Id);

    List<BaseCatalog3> getAllBaseCatalog3BycataLog2Id(String cataLog2Id);

    List<BaseAttrInfo> getAllAttrListByCtg3Id(String cataLog3Id);
}
