package com.djweb.entity;

import org.springframework.stereotype.Component;

@Component
public class DeviceEntity {

    private Integer DID;	//设备编号
    private String DEVNAME;	//设备名称
    private String DEVIDENTIFY;	//设备标识码
    private String DATASECURITY;	//数据保密性
    private Integer PID;	//产品编码

    public Integer getDID() {
        return DID;
    }

    public void setDID(Integer DID) {
        this.DID = DID;
    }

    public String getDEVNAME() {
        return DEVNAME;
    }

    public void setDEVNAME(String DEVNAME) {
        this.DEVNAME = DEVNAME;
    }

    public String getDEVIDENTIFY() {
        return DEVIDENTIFY;
    }

    public void setDEVIDENTIFY(String DEVIDENTIFY) {
        this.DEVIDENTIFY = DEVIDENTIFY;
    }

    public String getDATASECURITY() {
        return DATASECURITY;
    }

    public void setDATASECURITY(String DATASECURITY) {
        this.DATASECURITY = DATASECURITY;
    }

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }
}
