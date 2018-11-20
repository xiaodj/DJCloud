package com.djweb.dto;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class DeviceInfo {
    private Integer DID;	    //设备ID
    private String  DevName;	//设备名称
    private String DataSecrecy;	//数据保密性
    private String DevDateTime;	//设备创建时间

    public Integer getDID() {
        return DID;
    }

    public void setDID(Integer DID) {
        this.DID = DID;
    }

    public String getDevName() {
        return DevName;
    }

    public void setDevName(String devName) {
        DevName = devName;
    }

    public String getDataSecrecy() {
        return DataSecrecy;
    }

    public void setDataSecrecy(String dataSecrecy) {
        DataSecrecy = dataSecrecy;
    }

    public String getDevDateTime() {
        return DevDateTime;
    }

    public void setDevDateTime(String devDateTime) {
        DevDateTime = devDateTime;
    }
}
