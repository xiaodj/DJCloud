package com.djweb.service.db.impl;

import com.djweb.entity.DeviceEntity;
import com.djweb.service.db.IDeviceDB;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public class DeviceImpl implements IDeviceDB {
    @Override
    public boolean IsExistOfDevice(String devname) {
        return false;
    }

    @Override
    public boolean AddDevice(DeviceEntity device) {
        return false;
    }

    @Override
    public boolean UpdateDeviceByDID(DeviceEntity device) {
        return false;
    }

    @Override
    public DeviceEntity GetDeviceByDID(Integer did) {
        return null;
    }

    @Override
    public List<DeviceEntity> GetDevicesByPID(Integer pid) {
        return null;
    }

    @Override
    public boolean DeleteDeviceByDID(Integer did) {
        return false;
    }
}
