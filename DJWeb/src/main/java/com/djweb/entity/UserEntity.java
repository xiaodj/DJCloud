package com.djweb.entity;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/8/24.
 */

@Component
public class UserEntity {

    private int UID;
    private String PHONE;   //手机号码
    private String USERNAME;    //用户名
    private String PASSWORD;    //密码

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
}
