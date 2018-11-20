package com.djweb.dto;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class TriggerDto extends BaseDto {
    private String TrigName;	//触发器名称
    private String AttrName;	//属性名称
    private String ControlRange;    //控制范围
    private String TrigSymbol;	//触发条件符号
    private String TrigValue;	//触发条件值
    private String MsgAccess;	//接受信息方式
    private String MsgAddress;	//信息地址

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

    public String getControlRange() {
        return ControlRange;
    }

    public void setControlRange(String controlRange) {
        ControlRange = controlRange;
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
}
