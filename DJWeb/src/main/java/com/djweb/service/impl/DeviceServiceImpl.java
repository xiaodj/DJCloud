package com.djweb.service.impl;

import com.djweb.dao.IDeviceDAO;
import com.djweb.dto.BaseDto;
import com.djweb.dto.DeviceDto;
import com.djweb.dto.DevicesDto;
import com.djweb.entity.DeviceEntity;
import com.djweb.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DeviceServiceImpl implements IDeviceService{

    @Override
    public BaseDto AddDevice(Map<String, String> var) {
        return null;
    }

    @Override
    public BaseDto UpdateDevice(Map<String, String> var) {
        return null;
    }

    @Override
    public DeviceDto GetDevice(Integer did) {
        return null;
    }

    @Override
    public DevicesDto GetDevices(Integer pid) {
        return null;
    }

    @Override
    public BaseDto DeleteDevice(Integer did) {
        return null;
    }
}
