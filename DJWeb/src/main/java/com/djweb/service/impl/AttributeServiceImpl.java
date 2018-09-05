package com.djweb.service.impl;

import com.djweb.dao.IAttributeDAO;
import com.djweb.dao.ITriggerDAO;
import com.djweb.dto.AttributesInfoDTO;
import com.djweb.dto.MsgDTO;
import com.djweb.dto.TriggersInfoDTO;
import com.djweb.entity.AttributeEntity;
import com.djweb.entity.TriggerEntity;
import com.djweb.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AttributeServiceImpl implements IAttributeService {

    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    private IAttributeDAO iAttrDao;
    @Autowired
    private AttributeEntity attrEntity;
    @Autowired
    private AttributesInfoDTO attrsInfoDTO;

    @Override
    public MsgDTO createAttribute(Map<String, String> var) {

        return msgDTO;
    }

    @Override
    public MsgDTO deleteAttribute(String aid) {
        iAttrDao.deleteByAID(Integer.valueOf(aid));
        return msgDTO;
    }

    @Override
    public AttributesInfoDTO getAttributesInfo(String pid) {
        List<AttributeEntity> listAttr = new ArrayList<AttributeEntity>();
        listAttr = iAttrDao.selectByPID(Integer.valueOf(pid));
        return attrsInfoDTO;
    }
}
