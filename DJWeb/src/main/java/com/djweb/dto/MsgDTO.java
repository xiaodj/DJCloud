package com.djweb.dto;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/8/30.
 */
@Component
public class MsgDTO {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
