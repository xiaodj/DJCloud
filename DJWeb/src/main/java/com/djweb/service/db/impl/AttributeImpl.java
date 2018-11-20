package com.djweb.service.db.impl;

import com.djweb.dao.IAttributeDAO;
import com.djweb.entity.AttributeEntity;
import com.djweb.service.db.IAttributeDB;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public class AttributeImpl implements IAttributeDB {

    @Autowired
    private IAttributeDAO iAttributeDao;

    @Override
    public boolean IsExistOfAttribute(String attrname) {
        return false;
    }

    @Override
    public boolean AddAttribute(AttributeEntity attribute) {
        return false;
    }

    @Override
    public boolean UpdateAttributeByAID(AttributeEntity attribute) {
        return false;
    }

    @Override
    public AttributeEntity GetAttributeByAID(Integer aid) {
        return null;
    }

    @Override
    public List<AttributeEntity> GetAttributesByPID(Integer pid) {
        return null;
    }

    @Override
    public boolean DeleteAttributeByAID(Integer aid) {
        return false;
    }
}
