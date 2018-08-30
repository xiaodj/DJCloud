package com.djweb.dao;

import com.djweb.entity.AttributeEntity;
import com.djweb.entity.UserEntity;

import java.util.List;

public interface IAttributeDAO {
    //增
    public boolean insert(AttributeEntity attrEntity);
    //删
    public boolean delete(AttributeEntity attrEntity);
    //改
    public boolean update(AttributeEntity attrEntity);
    //查询
    public List<AttributeEntity> select(AttributeEntity attrEntity);
}
