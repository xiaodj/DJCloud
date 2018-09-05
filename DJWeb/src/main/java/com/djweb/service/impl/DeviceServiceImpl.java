package com.djweb.service.impl;

import com.djweb.dao.IDeviceDAO;
import com.djweb.dto.DeviceInfoDTO;
import com.djweb.dto.DevicesInfoDTO;
import com.djweb.dto.MsgDTO;
import com.djweb.entity.DeviceEntity;
import com.djweb.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DeviceServiceImpl implements IDeviceService{

    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    private IDeviceDAO iDevDao;
    @Autowired
    private DeviceEntity devEntity;
    @Autowired
    private DevicesInfoDTO devsInfoDTO;
    @Autowired
    private DeviceInfoDTO devInfoDTO;

    @Override
    public MsgDTO createDevice(Map<String, String> var) {

        String devnm = var.get("devnm");
        String devtify = var.get("devtify");
        String devdtsec = var.get("devdtsec");
        String pid = var.get("pid");

        devEntity.setDEVNAME(devnm);
        devEntity.setDEVIDENTIFY(devtify);
        devEntity.setDATASECURITY(devdtsec);
        devEntity.setPID(Integer.valueOf(pid));

        iDevDao.insert(devEntity);

        return msgDTO;
    }

    @Override
    public MsgDTO deleteDevice(String did) {
        iDevDao.deleteByDID(Integer.valueOf(did));
        return msgDTO;
    }

    @Override
    public DevicesInfoDTO getDevicesInfo(String pid) {
        List<DeviceEntity> listDevice = new ArrayList<DeviceEntity>();
        listDevice = iDevDao.selectByPID(Integer.valueOf(pid));
        return devsInfoDTO;
    }

    @Override
    public DeviceInfoDTO getDeviceInfo(String did) {
        devEntity = iDevDao.selectByDID(Integer.valueOf(did));
        return devInfoDTO;
    }
}
