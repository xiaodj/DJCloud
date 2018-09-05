package com.djweb.dao;

import com.djweb.entity.DeviceEntity;
import com.djweb.entity.ProductEntity;

import java.util.List;

public interface IProductDAO{
    //增
    public boolean insert(ProductEntity productEntity);
    //删
    public boolean delete(ProductEntity productEntity);
    //改
    public boolean update(ProductEntity productEntity);
    //查询产品信息
    public List<ProductEntity> selectByUID(int uid);
    //查询某个产品信息
    public ProductEntity selectByPID(int pid);
}
