package com.djweb.service.impl;

import com.djweb.dao.IAttributeDAO;
import com.djweb.dto.AttributeDto;
import com.djweb.dto.AttributeInfo;
import com.djweb.dto.AttributesDto;
import com.djweb.dto.BaseDto;
import com.djweb.entity.AttributeEntity;
import com.djweb.service.IAttributeService;
import com.djweb.service.db.IAttributeDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AttributeServiceImpl implements IAttributeService {

    @Autowired
    IAttributeDB iAttributeDB;

    @Autowired
    private BaseDto baseDto;
    @Autowired
    private AttributeDto attributeDto;
    @Autowired
    private AttributesDto attributesDto;

    @Override
    public BaseDto AddAttribute(Map<String, String> var) {

        String attrName = var.get("AttrName");
        String unitName = var.get("UnitName");
        String unitSymbol = var.get("UnitSymbol");
        String pid = var.get("PID");

        //判断属性是否存在
        if (iAttributeDB.IsExistOfAttribute(attrName)){
            baseDto.setCode(1);
            baseDto.setMessage("属性名已存在");
            return baseDto;
        }

        AttributeEntity attributeEntity = new AttributeEntity();
        attributeEntity.setATTRNAME(attrName);
        attributeEntity.setUNITNAME(unitName);
        attributeEntity.setUNITSYMBOL(unitSymbol);
        attributeEntity.setPID(Integer.parseInt(pid));

        if (!iAttributeDB.AddAttribute(attributeEntity)){
            baseDto.setCode(1);
            baseDto.setMessage("属性添加失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("属性添加成功");
            return baseDto;
        }
    }

    @Override
    public BaseDto UpdateAttribute(Map<String, String> var) {

        AttributeEntity attributeEntity = new AttributeEntity();
        attributeEntity.setAID(Integer.parseInt(var.get("AID")));
        attributeEntity.setATTRNAME(var.get("AttrName"));
        attributeEntity.setUNITNAME(var.get("UnitName"));
        attributeEntity.setUNITSYMBOL(var.get("UnitSymbol"));

        if (!iAttributeDB.UpdateAttributeByAID(attributeEntity)){
            baseDto.setCode(1);
            baseDto.setMessage("更新属性信息失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("更新属性信息成功");
            return baseDto;
        }
    }

    @Override
    public AttributeDto GetAttribute(Integer aid) {
        AttributeEntity attributeEntity = iAttributeDB.GetAttributeByAID(aid);
        if (attributeEntity == null){
            attributeDto.setCode(1);
            attributeDto.setMessage("获取属性(aid=" +String.valueOf(aid)+ ")信息失败");
            return attributeDto;
        }

        attributeDto.setCode(0);
        attributeDto.setMessage("获取属性信息成功");
        attributeDto.setAttrName(attributeEntity.getATTRNAME());
        attributeDto.setUnitName(attributeEntity.getUNITNAME());
        attributeDto.setUnitSymbol(attributeEntity.getUNITSYMBOL());
        return attributeDto;
    }

    @Override
    public AttributesDto GetAttributes(Integer pid) {
        List<AttributeInfo> attributeInfoList = new ArrayList<AttributeInfo>();
        List<AttributeEntity> attributeEntityList = iAttributeDB.GetAttributesByPID(pid);
        for (AttributeEntity attributeEntity: attributeEntityList) {
            AttributeInfo attributeInfo = new AttributeInfo();
            attributeInfo.setAID(attributeEntity.getAID());
            attributeInfo.setAttrName(attributeEntity.getATTRNAME());
            attributeInfo.setUnitName(attributeEntity.getUNITNAME());
            attributeInfo.setUnitSymbol(attributeEntity.getUNITSYMBOL());
            attributeInfoList.add(attributeInfo);
        }
        attributesDto.setCode(0);
        attributesDto.setMessage("获取所有属性信息成功");
        attributesDto.setAttrs(attributeInfoList);
        return attributesDto;
    }

    @Override
    public BaseDto DeleteProduct(Integer aid) {
        if (!iAttributeDB.DeleteAttributeByAID(aid)){
            baseDto.setCode(0);
            baseDto.setMessage("属性删除失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("属性删除成功");
            return baseDto;
        }
    }
}
