package com.djweb.dto;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class AttributeInfo {
    private Integer AID;		//属性ID
    private String  AttrName;	//属性名称
    private String  UnitName;	//单位名称
    private String  UnitSymbol;	//单位符号

    public Integer getAID() {
        return AID;
    }

    public void setAID(Integer AID) {
        this.AID = AID;
    }

    public String getAttrName() {
        return AttrName;
    }

    public void setAttrName(String attrName) {
        AttrName = attrName;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getUnitSymbol() {
        return UnitSymbol;
    }

    public void setUnitSymbol(String unitSymbol) {
        UnitSymbol = unitSymbol;
    }
}
