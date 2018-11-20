package com.djweb.dao;

import com.djweb.entity.AttributeEntity;
import com.djweb.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAttributeDAO {
    //添加属性
    public boolean insert(AttributeEntity attrEntity);
    //更新属性信息
    public boolean update(AttributeEntity attrEntity);
    //根据属性名称查询属性信息
    public AttributeEntity selectByAttrName(String attrname);
    //根据属性编码查询属性信息
    public AttributeEntity selectByAID(Integer aid);
    //查询产品的所有属性
    public List<AttributeEntity> selectByPID(Integer pid);
    //根据属性ID删除属性
    public boolean deleteByAID(Integer aid);
}
