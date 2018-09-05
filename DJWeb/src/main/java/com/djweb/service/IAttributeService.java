package com.djweb.service;

import com.djweb.dto.AttributesInfoDTO;
import com.djweb.dto.MsgDTO;

import java.util.Map;

public interface IAttributeService {

    //创建产品属性
    public MsgDTO createAttribute(Map<String, String> var);

    //删除产品属性
    public MsgDTO deleteAttribute(String aid);

    //获取所有产品属性信息
    public AttributesInfoDTO getAttributesInfo(String pid);
}
