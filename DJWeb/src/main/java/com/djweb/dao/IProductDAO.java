package com.djweb.dao;

import com.djweb.entity.DeviceEntity;
import com.djweb.entity.ProductEntity;

import java.util.List;

public interface IProductDAO extends IBaseDAO<ProductEntity> {
    //增
    public boolean insert(ProductEntity productEntity);
    //删
    public boolean delete(ProductEntity productEntity);
    //改
    public boolean update(ProductEntity productEntity);
    //查询
    public List<ProductEntity> select(ProductEntity productEntity);
}
