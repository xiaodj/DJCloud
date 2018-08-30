package com.djweb.dto;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class ProductsInfoDTO {
    private int code;
    private int pubcount;   //公开协议产品个数
    private int pricount;   //私有协议产品个数
    private List<ProductsInfo> pubInfo;  //公开协议产品信息
    private List<ProductsInfo> priInfo;  //私有协议产品信息

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPubcount() {
        return pubcount;
    }

    public void setPubcount(int pubcount) {
        this.pubcount = pubcount;
    }

    public int getPricount() {
        return pricount;
    }

    public void setPricount(int pricount) {
        this.pricount = pricount;
    }

    public List<ProductsInfo> getPubInfo() {
        return pubInfo;
    }

    public void setPubInfo(List<ProductsInfo> pubInfo) {
        this.pubInfo = pubInfo;
    }

    public List<ProductsInfo> getPriInfo() {
        return priInfo;
    }

    public void setPriInfo(List<ProductsInfo> priInfo) {
        this.priInfo = priInfo;
    }
}
