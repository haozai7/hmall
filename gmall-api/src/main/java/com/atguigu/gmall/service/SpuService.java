package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsProductImage;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.bean.PmsProductSaleAttr;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);


    /**
     * 根据spuId查询商品的销售属性
     * @param spuId
     * @return
     */
    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    /**
     * 查询spu中的图片url
     * @param spuId
     * @return
     */
    List<PmsProductImage> spuImageList(String spuId);

    /**
     *
     * @param productId
     * @param id
     * @return
     */
    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId, String id);
}
