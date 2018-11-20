package com.djweb.dao;

import com.djweb.entity.AttributeEntity;
import com.djweb.entity.DeviceEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDeviceDAO{
    //增加设备
    public boolean insert(DeviceEntity deviceEntity);
    //更新设备信息
    public boolean update(DeviceEntity deviceEntity);
    //根据设备名称查询设备信息
    public DeviceEntity selectByDevName(String devname);
    //根据设备编码查询设备信息
    public DeviceEntity selectByDID(Integer did);
    //根据产品ID查询设备信息
    public List<DeviceEntity> selectByPID(Integer pid);
    //根据设备ID删除设备
    public boolean deleteByDID(Integer did);
}
