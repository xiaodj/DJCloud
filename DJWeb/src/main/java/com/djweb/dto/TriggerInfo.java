package com.djweb.dto;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class TriggerInfo {
    private Integer TID;	        //触发器ID
    private String  TrigName;	    //触发器名称
    private String AttrName;	    //属性名称
    private String TrigSymbol;	    //触发条件符号
    private String TrigValue;	    //触发条件值
    private String MsgAccess;	    //接受信息方式
    private String MsgAddress;	    //信息地址
    private String ControlDevNum;	//控制设备个数
    private String TrigDateTime;	//触发器创建时间

    public Integer getTID() {
        return TID;
    }

    public void setTID(Integer TID) {
        this.TID = TID;
    }

    public String getTrigName() {
        return TrigName;
    }

    public void setTrigName(String trigName) {
        TrigName = trigName;
    }

    public String getAttrName() {
        return AttrName;
    }

    public void setAttrName(String attrName) {
        AttrName = attrName;
    }

    public String getTrigSymbol() {
        return TrigSymbol;
    }

    public void setTrigSymbol(String trigSymbol) {
        TrigSymbol = trigSymbol;
    }

    public String getTrigValue() {
        return TrigValue;
    }

    public void setTrigValue(String trigValue) {
        TrigValue = trigValue;
    }

    public String getMsgAccess() {
        return MsgAccess;
    }

    public void setMsgAccess(String msgAccess) {
        MsgAccess = msgAccess;
    }

    public String getMsgAddress() {
        return MsgAddress;
    }

    public void setMsgAddress(String msgAddress) {
        MsgAddress = msgAddress;
    }

    public String getControlDevNum() {
        return ControlDevNum;
    }

    public void setControlDevNum(String controlDevNum) {
        ControlDevNum = controlDevNum;
    }

    public String getTrigDateTime() {
        return TrigDateTime;
    }

    public void setTrigDateTime(String trigDateTime) {
        TrigDateTime = trigDateTime;
    }
}
