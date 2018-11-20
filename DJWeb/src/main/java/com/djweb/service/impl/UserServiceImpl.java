package com.djweb.service.impl;

import com.djweb.dto.BaseDto;
import com.djweb.dto.LoginDto;
import com.djweb.entity.UserEntity;
import com.djweb.service.IUserService;
import com.djweb.service.db.IUserDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by xiaodj on 2018/8/24.
 */

@Service
public class UserServiceImpl implements IUserService{

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

        String username = var.get("UserName");
        String password = var.get("PassWord");
        String nickname = var.get("NickName");

        if (nickname.isEmpty() || username.isEmpty() || password.isEmpty()){
            baseDto.setCode(1);
            baseDto.setMessage("昵称、用户名、密码不能为空");
            return baseDto;
        }

        //检查昵称是否已经存在
        if(iUserDB.IsExistOfUser(username)){
            baseDto.setCode(1);
            baseDto.setMessage("用户名已存在");
            return baseDto;
        }

        UserEntity userEntity = new UserEntity();
        userEntity.setUSERNAME(username);
        userEntity.setPASSWORD(password);
        userEntity.setNICKNAME(nickname);

        if (!iUserDB.AddUser(userEntity)){
            baseDto.setCode(1);
            baseDto.setMessage("用户注册失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("用户注册成功");
            return baseDto;
        }
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
        UserEntity userEntity = iUserDB.GetUserByUserName(username);
        if (userEntity == null){
            loginDto.setCode(1);
            loginDto.setMessage("该用户不存在");
            return loginDto;
        }

        if (!userEntity.getPASSWORD().equals(password)){
            loginDto.setCode(1);
            loginDto.setMessage("用户名与密码不匹配");
            return loginDto;
        }else {
            loginDto.setCode(0);
            loginDto.setMessage("登录成功");
            loginDto.setUID(userEntity.getUID());
            return loginDto;
        }
    }

    @Override
    public BaseDto quit(Integer uid) {
        return null;
    }
}
