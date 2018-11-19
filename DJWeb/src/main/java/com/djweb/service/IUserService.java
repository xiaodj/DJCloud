package com.djweb.service;

import com.djweb.dto.BaseDto;
import com.djweb.dto.LoginDto;

import java.util.Map;

/**
 * Created by xiaodj on 2018/8/24.
 */
public interface IUserService {

    //注册
    public BaseDto register(Map<String, String> var);
    //登陆
    public LoginDto login(Map<String, String> var);
    //退出
    public BaseDto quit(Integer uid);
}
