package com.djweb.entity;

import org.springframework.stereotype.Component;

@Component
public class ProductEntity {
    private Integer PID;	//产品编号
    private String  PDNAME;	//产品名称
    private String  PDINDUSTRY;	//产品行业
    private String  PDCATEGORY;	//产品类别
    private String  PDPROGRESS;	//产品当前进度
    private String  PDSUMMARY;	//产品简介
    private String  PDOS;	//产品操作系统
    private String  PDNETWORK;	//产品网络运营商
    private String  PDACCESSWAY;	//产品接入方式
    private String  PDNETWAY;	//产品联网方式
    private String  PDMODULE;	//产品模组选择
    private String  PDPROTOCOL;	//产品接入协议
    private String  PDDATETIME;	//产品创建时间
    private Integer UID;	//用户编号

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public String getPDNAME() {
        return PDNAME;
    }

    public void setPDNAME(String PDNAME) {
        this.PDNAME = PDNAME;
    }

    public String getPDINDUSTRY() {
        return PDINDUSTRY;
    }

    public void setPDINDUSTRY(String PDINDUSTRY) {
        this.PDINDUSTRY = PDINDUSTRY;
    }

    public String getPDCATEGORY() {
        return PDCATEGORY;
    }

    public void setPDCATEGORY(String PDCATEGORY) {
        this.PDCATEGORY = PDCATEGORY;
    }

    public String getPDPROGRESS() {
        return PDPROGRESS;
    }

    public void setPDPROGRESS(String PDPROGRESS) {
        this.PDPROGRESS = PDPROGRESS;
    }

    public String getPDSUMMARY() {
        return PDSUMMARY;
    }

    public void setPDSUMMARY(String PDSUMMARY) {
        this.PDSUMMARY = PDSUMMARY;
    }

    public String getPDOS() {
        return PDOS;
    }

    public void setPDOS(String PDOS) {
        this.PDOS = PDOS;
    }

    public String getPDNETWORK() {
        return PDNETWORK;
    }

    public void setPDNETWORK(String PDNETWORK) {
        this.PDNETWORK = PDNETWORK;
    }

    public String getPDACCESSWAY() {
        return PDACCESSWAY;
    }

    public void setPDACCESSWAY(String PDACCESSWAY) {
        this.PDACCESSWAY = PDACCESSWAY;
    }

    public String getPDNETWAY() {
        return PDNETWAY;
    }

    public void setPDNETWAY(String PDNETWAY) {
        this.PDNETWAY = PDNETWAY;
    }

    public String getPDMODULE() {
        return PDMODULE;
    }

    public void setPDMODULE(String PDMODULE) {
        this.PDMODULE = PDMODULE;
    }

    public String getPDPROTOCOL() {
        return PDPROTOCOL;
    }

    public void setPDPROTOCOL(String PDPROTOCOL) {
        this.PDPROTOCOL = PDPROTOCOL;
    }

    public String getPDDATETIME() {
        return PDDATETIME;
    }

    public void setPDDATETIME(String PDDATETIME) {
        this.PDDATETIME = PDDATETIME;
    }

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }
}
