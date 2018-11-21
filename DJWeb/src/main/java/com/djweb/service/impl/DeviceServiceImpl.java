package com.djweb.service.impl;

import com.djweb.dao.IDeviceDAO;
import com.djweb.dto.BaseDto;
import com.djweb.dto.DeviceDto;
import com.djweb.dto.DeviceInfo;
import com.djweb.dto.DevicesDto;
import com.djweb.entity.DeviceEntity;
import com.djweb.service.IDeviceService;
import com.djweb.service.db.IDeviceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DeviceServiceImpl implements IDeviceService{

    @Autowired
    private IDeviceDB iDeviceDB;

    @Autowired
    private BaseDto baseDto;
    @Autowired
    private DeviceDto deviceDto;
    @Autowired
    private DevicesDto devicesDto;

    @Override
    public BaseDto AddDevice(Map<String, String> var) {

        String devName = var.get("DevName");
        String devUniNum = var.get("DevUniNum");
        String dataSecrecy = var.get("DataSecrecy");
        String pid = var.get("PID");


        //判断设备名是否已经存在
        if (iDeviceDB.IsExistOfDevice(devName)){
            baseDto.setCode(1);
            baseDto.setMessage("设备名已存在");
            return baseDto;
        }

        DeviceEntity deviceEntity = new DeviceEntity();
        deviceEntity.setDEVNAME(devName);
        deviceEntity.setDEVUNINUM(devUniNum);
        deviceEntity.setDATASECRECY(dataSecrecy);
        deviceEntity.setPID(Integer.parseInt(pid));

        if (!iDeviceDB.AddDevice(deviceEntity)){
            baseDto.setCode(1);
            baseDto.setMessage("设备添加失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("设备添加成功");
            return baseDto;
        }
    }

    @Override
    public BaseDto UpdateDevice(Map<String, String> var) {

        DeviceEntity deviceEntity = new DeviceEntity();
        deviceEntity.setDID(Integer.parseInt(var.get("DID")));
        deviceEntity.setDEVNAME(var.get("DevName"));
        deviceEntity.setDEVUNINUM(var.get("DevUniNum"));
        deviceEntity.setDATASECRECY(var.get("DataSecrecy"));
        deviceEntity.setDEVICONPATH(var.get("DevIcon"));
        deviceEntity.setDEVDESC(var.get("DevDesc"));
        deviceEntity.setDEVLABEL(var.get("DevLabel"));
        deviceEntity.setDEVADDRESS(var.get("DevAddress"));

        if (!iDeviceDB.UpdateDeviceByDID(deviceEntity)){
            baseDto.setCode(1);
            baseDto.setMessage("更新设备信息失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("更新设备信息成功");
            return baseDto;
        }
    }

    @Override
    public DeviceDto GetDevice(Integer did) {
        DeviceEntity deviceEntity = iDeviceDB.GetDeviceByDID(did);
        if (deviceEntity == null){
            deviceDto.setCode(1);
            deviceDto.setMessage("获取设备(did=" +String.valueOf(did)+ ")信息失败");
            return deviceDto;
        }

        deviceDto.setCode(0);
        deviceDto.setMessage("获取设备信息成功");
        deviceDto.setDevName(deviceEntity.getDEVNAME());
        deviceDto.setDevUniNum(deviceEntity.getDEVUNINUM());
        deviceDto.setDataSecrecy(deviceEntity.getDATASECRECY());
        deviceDto.setDevIcon(deviceEntity.getDEVICONPATH());
        deviceDto.setDevDesc(deviceEntity.getDEVDESC());
        deviceDto.setDevLabel(deviceEntity.getDEVLABEL());
        deviceDto.setDevAddress(deviceEntity.getDEVADDRESS());
        return deviceDto;
    }

    @Override
    public DevicesDto GetDevices(Integer pid) {
        List<DeviceInfo> deviceInfoList = new ArrayList<DeviceInfo>();
        List<DeviceEntity> deviceEntityList = iDeviceDB.GetDevicesByPID(pid);
        for (DeviceEntity deviceEntity: deviceEntityList) {
            DeviceInfo deviceInfo = new DeviceInfo();
            deviceInfo.setDID(deviceEntity.getDID());
            deviceInfo.setDevName(deviceEntity.getDEVNAME());
            deviceInfo.setDataSecrecy(deviceEntity.getDATASECRECY());
            deviceInfo.setDevDateTime(deviceEntity.getDEVDATETIME());
            deviceInfoList.add(deviceInfo);
        }
        devicesDto.setCode(0);
        devicesDto.setMessage("获取所有设备信息成功");
        devicesDto.setDevices(deviceInfoList);
        return devicesDto;
    }

    @Override
    public BaseDto DeleteDevice(Integer did) {
        if (!iDeviceDB.DeleteDeviceByDID(did)){
            baseDto.setCode(0);
            baseDto.setMessage("设备删除失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("设备删除成功");
            return baseDto;
        }
    }
}
