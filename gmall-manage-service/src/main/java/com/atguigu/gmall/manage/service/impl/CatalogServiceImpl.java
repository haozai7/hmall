package com.atguigu.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;
import com.atguigu.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.atguigu.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.atguigu.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import com.atguigu.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;


    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        //设置查询条件
        PmsBaseCatalog2 pmsBaseCatalog2Tmp = new PmsBaseCatalog2();
        pmsBaseCatalog2Tmp.setCatalog1Id(catalog1Id);
        List<PmsBaseCatalog2> catalog2List = pmsBaseCatalog2Mapper.select(pmsBaseCatalog2Tmp);
        return catalog2List;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        //设置查询条件
        PmsBaseCatalog3 pmsBaseCatalog3Tmp = new PmsBaseCatalog3();
        pmsBaseCatalog3Tmp.setCatalog2Id(catalog2Id);
        List<PmsBaseCatalog3> catalog3List = pmsBaseCatalog3Mapper.select(pmsBaseCatalog3Tmp);
        return catalog3List;
    }
}
