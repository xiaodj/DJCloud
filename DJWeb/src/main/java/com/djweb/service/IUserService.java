package com.djweb.service;

import com.djweb.dto.MsgDTO;
import com.djweb.dto.UserInfoDTO;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by xiaodj on 2018/8/24.
 */
public interface IUserService {

    //登陆
    public MsgDTO login(Map<String, String> var, HttpSession session);
    //注册
    public MsgDTO register(Map<String, String> var);
    //获取用户信息
    public UserInfoDTO getUserInfo(int uid);
}
