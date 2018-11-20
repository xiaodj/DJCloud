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
        DeviceEntity deviceEntity = iDeviceDao.selectByDevName(devname);
        if (deviceEntity == null)
            return false;
        else
            return true;
    }

    @Override
    public boolean AddDevice(DeviceEntity device) {
        return iDeviceDao.insert(device);
    }

    @Override
    public boolean UpdateDeviceByDID(DeviceEntity device) {
        return iDeviceDao.update(device);
    }

    @Override
    public DeviceEntity GetDeviceByDID(Integer did) {
        return iDeviceDao.selectByDID(did);
    }

    @Override
    public List<DeviceEntity> GetDevicesByPID(Integer pid) {
        return iDeviceDao.selectByPID(pid);
    }

    @Override
    public boolean DeleteDeviceByDID(Integer did) {
        return iDeviceDao.deleteByDID(did);
    }
}
