package com.djweb.service.db;

import com.djweb.entity.DeviceEntity;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public interface IDeviceDB {
    //设备是否存在
    public boolean IsExistOfDevice(String devname);
    //添加设备
    public boolean AddDevice(DeviceEntity device);
    //修改设备信息
    public boolean UpdateDeviceByDID(DeviceEntity device);
    //根据设备编码获取设备信息
    public DeviceEntity GetDeviceByDID(Integer did);
    //根据产品编码获取设备信息
    public List<DeviceEntity> GetDevicesByPID(Integer pid);
    //根据设备编码删除设备信息
    public boolean DeleteDeviceByDID(Integer did);
}
