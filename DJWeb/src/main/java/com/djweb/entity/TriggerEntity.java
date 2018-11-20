package com.djweb.entity;

import org.springframework.stereotype.Component;

@Component
public class TriggerEntity {
    private Integer TID;	//触发器编码
    private String  TRIGNAME;	//触发器名称
    private String  ATTRNAME;	//属性名称
    private String  TRIGSYMBOL;	//触发条件符号
    private String  TRIGVALUE;	//触发条件值
    private String  MSGACCESS;	//接受信息方式
    private Integer PID;	//产品编码

    public Integer getTID() {
        return TID;
    }

    public void setTID(Integer TID) {
        this.TID = TID;
    }

    public String getTRIGNAME() {
        return TRIGNAME;
    }

    public void setTRIGNAME(String TRIGNAME) {
        this.TRIGNAME = TRIGNAME;
    }

    public String getATTRNAME() {
        return ATTRNAME;
    }

    public void setATTRNAME(String ATTRNAME) {
        this.ATTRNAME = ATTRNAME;
    }

    public String getTRIGSYMBOL() {
        return TRIGSYMBOL;
    }

    public void setTRIGSYMBOL(String TRIGSYMBOL) {
        this.TRIGSYMBOL = TRIGSYMBOL;
    }

    public String getTRIGVALUE() {
        return TRIGVALUE;
    }

    public void setTRIGVALUE(String TRIGVALUE) {
        this.TRIGVALUE = TRIGVALUE;
    }

    public String getMSGACCESS() {
        return MSGACCESS;
    }

    public void setMSGACCESS(String MSGACCESS) {
        this.MSGACCESS = MSGACCESS;
    }

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }
}
