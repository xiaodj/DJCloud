package com.djweb.dto;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/7/17.
 */
@Component
public class UserInfoDTO{
    private int code;
    private String username;    //用户名

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
