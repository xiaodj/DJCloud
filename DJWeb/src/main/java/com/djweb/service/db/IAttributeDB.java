package com.djweb.service.db;

import com.djweb.entity.AttributeEntity;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public interface IAttributeDB {
    //属性是否存在
    public boolean IsExistOfAttribute(String attrname);
    //添加属性
    public boolean AddAttribute(AttributeEntity attribute);
    //修改属性信息
    public boolean UpdateAttributeByAID(AttributeEntity attribute);
    //根据属性编码获取属性信息
    public AttributeEntity GetAttributeByAID(Integer aid);
    //根据产品编码获取属性信息
    public List<AttributeEntity> GetAttributesByPID(Integer pid);
    //根据属性编码删除属性信息
    public boolean DeleteAttributeByAID(Integer aid);
}
