package com.djweb.service.db.impl;

import com.djweb.dao.IAttributeDAO;
import com.djweb.entity.AttributeEntity;
import com.djweb.service.db.IAttributeDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
@Component
public class AttributeDBImpl implements IAttributeDB {

    @Autowired
    private IAttributeDAO iAttributeDao;

    @Override
    public boolean IsExistOfAttribute(String attrname) {
        AttributeEntity attributeEntity = iAttributeDao.selectByAttrName(attrname);
        if (attributeEntity == null)
            return false;
        else
            return true;
    }

    @Override
    public boolean AddAttribute(AttributeEntity attribute) {
        return iAttributeDao.insert(attribute);
    }

    @Override
    public boolean UpdateAttributeByAID(AttributeEntity attribute) {
        return iAttributeDao.update(attribute);
    }

    @Override
    public AttributeEntity GetAttributeByAID(Integer aid) {
        return iAttributeDao.selectByAID(aid);
    }

    @Override
    public List<AttributeEntity> GetAttributesByPID(Integer pid) {
        return iAttributeDao.selectByPID(pid);
    }

    @Override
    public boolean DeleteAttributeByAID(Integer aid) {
        return iAttributeDao.deleteByAID(aid);
    }
}
