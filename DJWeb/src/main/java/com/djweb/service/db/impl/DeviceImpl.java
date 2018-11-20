package com.djweb.service.db.impl;

import com.djweb.dao.IDeviceDAO;
import com.djweb.entity.DeviceEntity;
import com.djweb.service.db.IDeviceDB;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public class DeviceImpl implements IDeviceDB {

    @Autowired
    private IDeviceDAO iDeviceDao;

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
