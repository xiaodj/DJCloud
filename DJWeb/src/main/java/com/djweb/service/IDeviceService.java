package com.djweb.service;

import com.djweb.dto.MsgDTO;

import java.util.Map;

public interface IDeviceService {
    //创建产品
    public MsgDTO createDevice(Map<String, String> var);
}
