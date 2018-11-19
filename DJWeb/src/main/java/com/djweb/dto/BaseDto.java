package com.djweb.dto;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/8/30.
 */
@Component
public class BaseDto {
    private int Code;
    private String Message;

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
