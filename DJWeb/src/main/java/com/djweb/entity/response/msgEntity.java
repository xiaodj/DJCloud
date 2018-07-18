package com.djweb.entity.response;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/7/16.
 */

@Component
public class msgEntity {
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
