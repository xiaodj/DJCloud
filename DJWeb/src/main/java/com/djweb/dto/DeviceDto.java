package com.djweb.dto;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class DeviceDto extends BaseDto {
    private String DevName;		//设备名称
    private String DevUniNum;	//设备编号
    private String DataSecrecy;	//数据保密性
    private String PDProtocol;	//产品接入协议
    private String DevIcon;	    //设备图标
    private String DevDesc;	    //设备描述
    private String PDCategory;	//产品类别
    private String DevLabel;	//设备标签
    private String DevAddress;	//设备位置

    public String getDevName() {
        return DevName;
    }

    public void setDevName(String devName) {
        DevName = devName;
    }

    public String getDevUniNum() {
        return DevUniNum;
    }

    public void setDevUniNum(String devUniNum) {
        DevUniNum = devUniNum;
    }

    public String getDataSecrecy() {
        return DataSecrecy;
    }

    public void setDataSecrecy(String dataSecrecy) {
        DataSecrecy = dataSecrecy;
    }

    public String getPDProtocol() {
        return PDProtocol;
    }

    public void setPDProtocol(String PDProtocol) {
        this.PDProtocol = PDProtocol;
    }

    public String getDevIcon() {
        return DevIcon;
    }

    public void setDevIcon(String devIcon) {
        DevIcon = devIcon;
    }

    public String getDevDesc() {
        return DevDesc;
    }

    public void setDevDesc(String devDesc) {
        DevDesc = devDesc;
    }

    public String getPDCategory() {
        return PDCategory;
    }

    public void setPDCategory(String PDCategory) {
        this.PDCategory = PDCategory;
    }

    public String getDevLabel() {
        return DevLabel;
    }

    public void setDevLabel(String devLabel) {
        DevLabel = devLabel;
    }

    public String getDevAddress() {
        return DevAddress;
    }

    public void setDevAddress(String devAddress) {
        DevAddress = devAddress;
    }
}
