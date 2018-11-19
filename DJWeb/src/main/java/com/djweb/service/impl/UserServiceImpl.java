package com.djweb.service.impl;

import com.djweb.dao.IUserDAO;
import com.djweb.dto.BaseDto;
import com.djweb.dto.LoginDto;
import com.djweb.dto.UserInfoDTO;
import com.djweb.entity.UserEntity;
import com.djweb.service.IUserService;
import com.djweb.service.db.IUserDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaodj on 2018/8/24.
 */

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserEntity userEntity;
    @Autowired
    private IUserDB iUserDB;

    /**
     * 用户注册
     * @author dengjiang
     * @param var：注册参数
     * @return BaseDto: 注册返回的消息
     */
    @Override
    public BaseDto register(Map<String, String> var) {
        BaseDto baseDto = new BaseDto();

        String nickname = var.get("NickName");
        String username = var.get("UserName");
        String password = var.get("PassWord");

        if (nickname.isEmpty() || username.isEmpty() || password.isEmpty()){
            baseDto.setCode(1);
            baseDto.setMessage("昵称、用户名、密码不能为空");
            return baseDto;
        }

        //检查昵称是否已经存在


        //

        return baseDto;
    }

    @Override
    public LoginDto login(Map<String, String> var) {
        LoginDto loginDto = new LoginDto();

        String username = var.get("UserName");
        String password = var.get("PassWord");

        if (username.isEmpty() || password.isEmpty()){
            loginDto.setCode(1);
            loginDto.setMessage("用户名或密码不能为空");
            return loginDto;
        }

        //查询用户

        return loginDto;
    }

    @Override
    public BaseDto quit(Map<String, Integer> var){
        BaseDto baseDto = new BaseDto();

        Integer uid = var.get("UID");
        if (uid <= 0){
            baseDto.setCode(1);
            baseDto.setMessage("无效的用户编码");
            return baseDto;
        }

        //退出

        return baseDto;
    }
}
