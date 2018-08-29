package com.djweb.entity;

/**
 * Created by xiaodj on 2018/8/29.
 */
public class ProductEntity {
    private int PID;                //产品编号
    private String PRODNAME;        //产品名称
    private String PRODINDUSTRY;    //产品行业
    private String PRODCATEGORY;    //产品类别
    private String PRODSCHEDULE;    //产品进度
    private String PRODINTRODUCE;   //产品简介
    private String OS;              //操作系统
    private String HEDNO;           //网络运营商
    private String ACCESSWAY;       //设备接入方式
    private String NETWAY;          //联网方式
    private String MODUSELECT;      //模组选择
    private String ACCPROTOCOL;     //设备接入协议

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getPRODNAME() {
        return PRODNAME;
    }

    public void setPRODNAME(String PRODNAME) {
        this.PRODNAME = PRODNAME;
    }

    public String getPRODINDUSTRY() {
        return PRODINDUSTRY;
    }

    public void setPRODINDUSTRY(String PRODINDUSTRY) {
        this.PRODINDUSTRY = PRODINDUSTRY;
    }

    public String getPRODCATEGORY() {
        return PRODCATEGORY;
    }

    public void setPRODCATEGORY(String PRODCATEGORY) {
        this.PRODCATEGORY = PRODCATEGORY;
    }

    public String getPRODSCHEDULE() {
        return PRODSCHEDULE;
    }

    public void setPRODSCHEDULE(String PRODSCHEDULE) {
        this.PRODSCHEDULE = PRODSCHEDULE;
    }

    public String getPRODINTRODUCE() {
        return PRODINTRODUCE;
    }

    public void setPRODINTRODUCE(String PRODINTRODUCE) {
        this.PRODINTRODUCE = PRODINTRODUCE;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getHEDNO() {
        return HEDNO;
    }

    public void setHEDNO(String HEDNO) {
        this.HEDNO = HEDNO;
    }

    public String getACCESSWAY() {
        return ACCESSWAY;
    }

    public void setACCESSWAY(String ACCESSWAY) {
        this.ACCESSWAY = ACCESSWAY;
    }

    public String getNETWAY() {
        return NETWAY;
    }

    public void setNETWAY(String NETWAY) {
        this.NETWAY = NETWAY;
    }

    public String getMODUSELECT() {
        return MODUSELECT;
    }

    public void setMODUSELECT(String MODUSELECT) {
        this.MODUSELECT = MODUSELECT;
    }

    public String getACCPROTOCOL() {
        return ACCPROTOCOL;
    }

    public void setACCPROTOCOL(String ACCPROTOCOL) {
        this.ACCPROTOCOL = ACCPROTOCOL;
    }
}
