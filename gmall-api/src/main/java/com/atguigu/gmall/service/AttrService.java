package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.bean.PmsBaseAttrValue;
import com.atguigu.gmall.bean.PmsBaseSaleAttr;

import java.util.List;


public interface AttrService {
    /**
     * 查询属性名列表
     * @param catalog3Id
     * @return
     */
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    /**
     * 对具体的属性值进行增删改
     * @param pmsBaseAttrInfo
     * @return
     */
    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    /**
     * 查询具体属性值列表
     * @param attrId
     * @return
     */
    List<PmsBaseAttrValue>  getAttrValueList(String attrId);

    /**
     * 查询商品的全部销售属性：这部分是直接写死的
     * @return
     */
    List<PmsBaseSaleAttr> baseSaleAttrList();
}
