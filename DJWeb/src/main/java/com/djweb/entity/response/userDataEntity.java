package com.djweb.entity.response;

import org.springframework.stereotype.Component;

/**
 * Created by xiaodj on 2018/7/17.
 */
@Component
public class userDataEntity{
    private String code;
    private String nickname;    //昵称

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
