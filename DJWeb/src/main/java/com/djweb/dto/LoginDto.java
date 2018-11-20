package com.djweb.dto;

import org.springframework.stereotype.Component;

@Component
public class LoginDto extends BaseDto {
    private Integer UID;

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }
}
