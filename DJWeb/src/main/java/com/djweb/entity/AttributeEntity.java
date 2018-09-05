package com.djweb.entity;

import org.springframework.stereotype.Component;

@Component
public class AttributeEntity {

    private Integer AID;	    //属性编号
    private String  ATTRENNAME;	//产品属性英文名称
    private String  ATTRCNNAME;	//产品属性中文名称
    private String  UNITNAME;	//属性单位名称
    private String  UNITSYMBOL;	//属性单位符号
    private Integer PID;	//产品编码

    public Integer getAID() {
        return AID;
    }

    public void setAID(Integer AID) {
        this.AID = AID;
    }

    public String getATTRENNAME() {
        return ATTRENNAME;
    }

    public void setATTRENNAME(String ATTRENNAME) {
        this.ATTRENNAME = ATTRENNAME;
    }

    public String getATTRCNNAME() {
        return ATTRCNNAME;
    }

    public void setATTRCNNAME(String ATTRCNNAME) {
        this.ATTRCNNAME = ATTRCNNAME;
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
