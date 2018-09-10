package com.djweb.dto;

import org.springframework.stereotype.Component;

@Component
public class ProductsInfo {

    private String pnm;     //产品名称
    private String pindu;   //产品行业
    private String accprot; //设备接入协议
    private String ctTime;    //创建时间
    private Integer devCount;   //接入的设备个数

    public String getCtTime() {
        return ctTime;
    }

    public void setCtTime(String ctTime) {
        this.ctTime = ctTime;
    }

    public Integer getDevCount() {
        return devCount;
    }

    public void setDevCount(Integer devCount) {
        this.devCount = devCount;
    }

    public String getPnm() {
        return pnm;
    }

    public void setPnm(String pnm) {
        this.pnm = pnm;
    }

    public String getPindu() {
        return pindu;
    }

    public void setPindu(String pindu) {
        this.pindu = pindu;
    }

    public String getAccprot() {
        return accprot;
    }

    public void setAccprot(String accprot) {
        this.accprot = accprot;
    }
}
