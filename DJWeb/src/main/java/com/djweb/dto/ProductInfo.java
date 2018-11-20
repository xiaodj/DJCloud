package com.djweb.dto;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class ProductInfo {
    private Integer PID;         //产品ID
    private String PDName;	    //产品名称
    private String PDIndustry;	//产品行业
    private String PDProtocol;	//产品接入协议
    private String PDDateTime;	//产品创建时间
    private Integer DevNum;	    //设备接入个数
    private Integer TriggNum;	//触发器个数
    private String PDKey;		//产品密钥

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

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

    public Integer getDevNum() {
        return DevNum;
    }

    public void setDevNum(Integer devNum) {
        DevNum = devNum;
    }

    public Integer getTriggNum() {
        return TriggNum;
    }

    public void setTriggNum(Integer triggNum) {
        TriggNum = triggNum;
    }

    public String getPDKey() {
        return PDKey;
    }

    public void setPDKey(String PDKey) {
        this.PDKey = PDKey;
    }
}
