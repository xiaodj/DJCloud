package com.djweb.service;

import com.djweb.dto.*;

import java.util.Map;

public interface IDeviceService {

    //创建产品设备
    public MsgDTO createDevice(Map<String, String> var);

    //删除产品设备
    public MsgDTO deleteDevice(String did);

    //获取所有产品设备信息
    public DevicesInfoDTO getDevicesInfo(String pid);

    //获取产品设备详细信息
    public DeviceInfoDTO getDeviceInfo(String did);
}
