package com.djweb.service;

import com.djweb.dto.AttributeDto;
import com.djweb.dto.AttributesDto;
import com.djweb.dto.BaseDto;

import java.util.Map;

public interface IAttributeService {

    //添加属性
    public BaseDto AddAttribute(Map<String, String> var);

    //更新属性
    public BaseDto UpdateAttribute(Map<String, String> var);

    //查看指定属性信息
    public AttributeDto GetAttribute(Integer aid);

    //查看产品下所有属性信息
    public AttributesDto GetAttributes(Integer pid);

    //删除属性
    public BaseDto DeleteProduct(Integer aid);
}
