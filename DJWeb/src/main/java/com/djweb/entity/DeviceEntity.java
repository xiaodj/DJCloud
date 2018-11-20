package com.djweb.entity;

import org.springframework.stereotype.Component;

@Component
public class DeviceEntity {
    private Integer DID;	//设备ID
    private String  DEVNAME;	//设备名称
    private String  DEVUNINUM;	//设备编号
    private String  DATASECRECY;	//数据保密性
    private String  DEVICONPATH;	//设备图标路径
    private String  DEVDESC;	//设备描述
    private String  DEVLABEL;	//设备标签
    private String  DEVADDRESS;	//设备地址
    private String  DEVDATETIME;	//设备创建时间
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

    public String getDEVUNINUM() {
        return DEVUNINUM;
    }

    public void setDEVUNINUM(String DEVUNINUM) {
        this.DEVUNINUM = DEVUNINUM;
    }

    public String getDATASECRECY() {
        return DATASECRECY;
    }

    public void setDATASECRECY(String DATASECRECY) {
        this.DATASECRECY = DATASECRECY;
    }

    public String getDEVICONPATH() {
        return DEVICONPATH;
    }

    public void setDEVICONPATH(String DEVICONPATH) {
        this.DEVICONPATH = DEVICONPATH;
    }

    public String getDEVDESC() {
        return DEVDESC;
    }

    public void setDEVDESC(String DEVDESC) {
        this.DEVDESC = DEVDESC;
    }

    public String getDEVLABEL() {
        return DEVLABEL;
    }

    public void setDEVLABEL(String DEVLABEL) {
        this.DEVLABEL = DEVLABEL;
    }

    public String getDEVADDRESS() {
        return DEVADDRESS;
    }

    public void setDEVADDRESS(String DEVADDRESS) {
        this.DEVADDRESS = DEVADDRESS;
    }

    public String getDEVDATETIME() {
        return DEVDATETIME;
    }

    public void setDEVDATETIME(String DEVDATETIME) {
        this.DEVDATETIME = DEVDATETIME;
    }

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }
}
