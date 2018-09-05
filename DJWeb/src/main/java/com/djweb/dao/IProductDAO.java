package com.djweb.dao;

import com.djweb.entity.DeviceEntity;
import com.djweb.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductDAO{
    //增
    public boolean insert(ProductEntity productEntity);
    //根据产品ID删除产品
    public boolean deleteByPID(Integer pid);
    //根据用户ID查询产品信息
    public List<ProductEntity> selectByUID(Integer uid);
    //根据产品ID查询产品信息
    public ProductEntity selectByPID(Integer pid);
}
