package com.djweb.entity;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/8/24.
 */

@Component
public class UserEntity {

    private int UID;
    private String USERNAME;
    private String PASSWORD;

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
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
