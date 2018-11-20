package com.djweb.dto;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class ProductDto extends BaseDto {
    private String PDName;      //产品名称
    private String PDIndustry;  //产品行业
    private String PDCategory;  //产品类别
    private String PDSummary;   //产品简介
    private String PDOS;        //产品操作系统
    private String PDNetwork;   //产品网络运营商
    private String PDNetWay;    //产品联网方式
    private String PDProtocol;  //产品接入协议
    private String PDDateTime;  //产品创建时间

    public String getPDName() {
        return PDName;
    }

    public void setPDName(String PDName) {
        this.PDName = PDName;
    }

    public String getPDIndustry() {
        return PDIndustry;
    }

    public void setPDIndustry(String PDIndustry) {
        this.PDIndustry = PDIndustry;
    }

    public String getPDCategory() {
        return PDCategory;
    }

    public void setPDCategory(String PDCategory) {
        this.PDCategory = PDCategory;
    }

    public String getPDSummary() {
        return PDSummary;
    }

    public void setPDSummary(String PDSummary) {
        this.PDSummary = PDSummary;
    }

    public String getPDOS() {
        return PDOS;
    }

    public void setPDOS(String PDOS) {
        this.PDOS = PDOS;
    }

    public String getPDNetwork() {
        return PDNetwork;
    }

    public void setPDNetwork(String PDNetwork) {
        this.PDNetwork = PDNetwork;
    }

    public String getPDNetWay() {
        return PDNetWay;
    }

    public void setPDNetWay(String PDNetWay) {
        this.PDNetWay = PDNetWay;
    }

    public String getPDProtocol() {
        return PDProtocol;
    }

    public void setPDProtocol(String PDProtocol) {
        this.PDProtocol = PDProtocol;
    }

    public String getPDDateTime() {
        return PDDateTime;
    }

    public void setPDDateTime(String PDDateTime) {
        this.PDDateTime = PDDateTime;
    }
}
