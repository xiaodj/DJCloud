package com.djweb.dto;

import org.springframework.stereotype.Component;

@Component
public class ProductsInfo {

    private String pnm;     //产品名称
    private String pindu;   //产品行业
    private String accprot; //设备接入协议

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
