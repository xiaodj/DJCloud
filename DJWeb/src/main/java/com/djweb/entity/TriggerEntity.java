package com.djweb.entity;

import org.springframework.stereotype.Component;

@Component
public class TriggerEntity {

    private int TID;	//触发器编号
    private String TRIGNAME;	//触发器名称
    private String CONTROLAREA;	//控制范围
    private String ATTRNAME;	//产品属性名称
    private String TRIGCONDITION;	//触发条件
    private String ACCEPTWAY;	//接受信息方式
    private int PID;	//产品编码

    public int getTID() {
        return TID;
    }

    public void setTID(int TID) {
        this.TID = TID;
    }

    public String getTRIGNAME() {
        return TRIGNAME;
    }

    public void setTRIGNAME(String TRIGNAME) {
        this.TRIGNAME = TRIGNAME;
    }

    public String getCONTROLAREA() {
        return CONTROLAREA;
    }

    public void setCONTROLAREA(String CONTROLAREA) {
        this.CONTROLAREA = CONTROLAREA;
    }

    public String getATTRNAME() {
        return ATTRNAME;
    }

    public void setATTRNAME(String ATTRNAME) {
        this.ATTRNAME = ATTRNAME;
    }

    public String getTRIGCONDITION() {
        return TRIGCONDITION;
    }

    public void setTRIGCONDITION(String TRIGCONDITION) {
        this.TRIGCONDITION = TRIGCONDITION;
    }

    public String getACCEPTWAY() {
        return ACCEPTWAY;
    }

    public void setACCEPTWAY(String ACCEPTWAY) {
        this.ACCEPTWAY = ACCEPTWAY;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }
}
