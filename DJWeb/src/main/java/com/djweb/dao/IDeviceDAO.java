package com.djweb.dao;

import com.djweb.entity.AttributeEntity;
import com.djweb.entity.DeviceEntity;

import java.util.List;

public interface IDeviceDAO extends IBaseDAO<DeviceEntity> {
    //增
    public boolean insert(DeviceEntity deviceEntity);
    //删
    public boolean delete(DeviceEntity deviceEntity);
    //改
    public boolean update(DeviceEntity deviceEntity);
    //查询
    public List<DeviceEntity> select(DeviceEntity deviceEntity);
}
