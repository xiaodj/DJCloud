package com.djweb.service;

import com.djweb.dto.*;

import java.util.Map;

public interface IDeviceService {

    //添加设备
    public BaseDto AddDevice(Map<String, String> var);

    //更新设备
    public BaseDto UpdateDevice(Map<String, String> var);

    //查看指定设备信息
    public DeviceDto GetDevice(Integer did);

    //查看产品下所有设备信息
    public DevicesDto GetDevices(Integer pid);

    //删除设备
    public BaseDto DeleteDevice(Integer did);
}
