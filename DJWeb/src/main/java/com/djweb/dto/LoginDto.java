package com.djweb.dto;

import org.springframework.stereotype.Component;

@Component
public class LoginDto extends BaseDto {
    private Integer UID;
    private String  NickName;

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }
}
