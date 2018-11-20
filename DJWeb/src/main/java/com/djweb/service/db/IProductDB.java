package com.djweb.service.db;

import com.djweb.entity.ProductEntity;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public interface IProductDB {
    //产品是否存在
    public boolean IsExistOfProduct(String pdname);
    //添加产品
    public boolean AddProduct(ProductEntity product);
    //修改产品信息
    public boolean UpdateProductByPID(ProductEntity product);
    //根据产品编码获取产品信息
    public ProductEntity GetProductByPID(Integer tid);
    //根据用户编码获取产品信息
    public List<ProductEntity> GetProductsByUID(Integer uid);
    //根据产品编码删除产品信息
    public boolean DeleteProductByPID(Integer tid);
}
