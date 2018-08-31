package com.djweb.service;

import com.djweb.dto.MsgDTO;
import com.djweb.dto.ProductsInfoDTO;

import java.util.Map;

/**
 * Created by xiaodj on 2018/8/29.
 */
public interface IProductService {

    //获取产品信息
    public ProductsInfoDTO getProductsInfo(int uid);

    //创建产品
    public MsgDTO createProduct(Map<String, String> var);
}
