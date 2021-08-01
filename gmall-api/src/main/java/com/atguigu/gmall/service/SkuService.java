package com.atguigu.gmall.service;


import com.atguigu.gmall.bean.PmsSkuInfo;

import java.util.List;


public interface SkuService {

    String saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    /**
     * 通过sku的id查缓存考虑多级缓存的问题
     * @param skuId
     * @param ip
     * @return
     */
    PmsSkuInfo getSkuById(String skuId,String ip);

    List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(String productId);
}
