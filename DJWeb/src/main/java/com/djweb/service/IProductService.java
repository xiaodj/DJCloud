package com.djweb.service;

import com.djweb.dto.MsgDTO;
import com.djweb.dto.ProductInfoDTO;
import com.djweb.dto.ProductsInfoDTO;

import java.util.Map;

/**
 * Created by xiaodj on 2018/8/29.
 */
public interface IProductService {

    //创建产品
    public MsgDTO createProduct(Map<String, String> var);

    //删除产品
    public MsgDTO deleteProduct(String pid);

    //获取所有产品信息
    public ProductsInfoDTO getProductsInfo(String uid);

    //获取产品详细信息
    public ProductInfoDTO getProductInfo(String pid);
}
