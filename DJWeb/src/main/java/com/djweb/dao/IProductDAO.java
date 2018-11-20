package com.djweb.dao;

import com.djweb.entity.DeviceEntity;
import com.djweb.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductDAO{
    //增加产品
    public boolean insert(ProductEntity productEntity);
    //更新产品信息
    public boolean update(ProductEntity productEntity);
    //根据产品名称查询产品信息
    public ProductEntity selectByPDName(String pdname);
    //根据产品编码查询产品信息
    public ProductEntity selectByPID(Integer pid);
    //根据用户编码查询产品信息
    public List<ProductEntity> selectByUID(Integer uid);
    //根据产品ID删除产品
    public boolean deleteByPID(Integer pid);
    //获取设备个数
    public Integer GetDevNumByPID(Integer pid);
    //获取触发器个数
    public Integer GetTrigNumByPID(Integer pid);
}
