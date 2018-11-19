package com.djweb.service;

import com.djweb.dto.BaseDto;
import com.djweb.dto.ProductDto;
import com.djweb.dto.ProductsDto;

import java.util.Map;

/**
 * Created by xiaodj on 2018/8/29.
 */
public interface IProductService {

    //添加产品
    public BaseDto AddProduct(Map<String, String> var);

    //更新产品
    public BaseDto UpdateProduct(Map<String, String> var);

    //查看指定产品信息
    public ProductDto GetProduct(Integer pid);

    //查看用户下所有产品信息
    public ProductsDto GetProducts(Integer uid);

    //删除
    public BaseDto DeleteProduct(Integer pid);
}
