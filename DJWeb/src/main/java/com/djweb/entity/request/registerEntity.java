package com.djweb.entity.request;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/7/17.
 */
@Component
public class registerEntity {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
