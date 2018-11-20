package com.djweb.dao;

import com.djweb.entity.AttributeEntity;
import com.djweb.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAttributeDAO {
    //添加属性
    public boolean insert(AttributeEntity attrEntity);
    //根据属性ID删除属性
    public boolean deleteByAID(Integer aid);
    //查询产品的所有属性
    public List<AttributeEntity> selectByPID(Integer pid);
}
