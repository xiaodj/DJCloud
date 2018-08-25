package com.djweb.service;

import com.djweb.entity.UserEntity;

import java.util.Map;

/**
 * Created by xiaodj on 2018/8/24.
 */
public interface IUserService {

    //注册
    public boolean register(Map<String, String> map);
}
