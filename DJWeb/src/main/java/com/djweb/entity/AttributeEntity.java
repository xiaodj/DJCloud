package com.djweb.entity;

import org.springframework.stereotype.Component;

@Component
public class AttributeEntity {
    private Integer AID;	//属性编码
    private String  ATTRNAME;	//属性名称
    private String  UNITNAME;	//单位名称
    private String  UNITSYMBOL;	//单位符号
    private Integer PID;	//产品编码

    public Integer getAID() {
        return AID;
    }

    public void setAID(Integer AID) {
        this.AID = AID;
    }

    public String getATTRNAME() {
        return ATTRNAME;
    }

    public void setATTRNAME(String ATTRNAME) {
        this.ATTRNAME = ATTRNAME;
    }

    public String getUNITNAME() {
        return UNITNAME;
    }

    public void setUNITNAME(String UNITNAME) {
        this.UNITNAME = UNITNAME;
    }

    public String getUNITSYMBOL() {
        return UNITSYMBOL;
    }

    public void setUNITSYMBOL(String UNITSYMBOL) {
        this.UNITSYMBOL = UNITSYMBOL;
    }

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }
}
