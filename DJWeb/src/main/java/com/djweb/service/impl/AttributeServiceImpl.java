package com.djweb.service.impl;

import com.djweb.dao.IAttributeDAO;
import com.djweb.dto.AttributeDto;
import com.djweb.dto.AttributesDto;
import com.djweb.dto.BaseDto;
import com.djweb.entity.AttributeEntity;
import com.djweb.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AttributeServiceImpl implements IAttributeService {

    @Override
    public BaseDto AddAttribute(Map<String, String> var) {
        return null;
    }

    @Override
    public BaseDto UpdateAttribute(Map<String, String> var) {
        return null;
    }

    @Override
    public AttributeDto GetAttribute(Integer aid) {
        return null;
    }

    @Override
    public AttributesDto GetAttributes(Integer pid) {
        return null;
    }

    @Override
    public BaseDto DeleteProduct(Integer aid) {
        return null;
    }
}
