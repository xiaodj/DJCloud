package com.djweb.service;

import com.djweb.entity.UserEntity;

import java.util.Map;

/**
 * Created by xiaodj on 2018/8/24.
 */
public interface IUserService {

    //登陆
    public boolean login(Map<String, String> var);
    //注册
    public boolean register(Map<String, String> var);
    //获取用户信息
    public UserEntity getUserInfo(Map<String, String> var);
}
