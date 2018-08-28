package com.djweb.service.impl;

import com.djweb.dao.IUserDao;
import com.djweb.dto.MsgDTO;
import com.djweb.entity.UserEntity;
import com.djweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaodj on 2018/8/24.
 */

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDao iUserDao;
    @Autowired
    private UserEntity userEntity;
    @Autowired
    private MsgDTO msgDTO;


    @Override
    public MsgDTO login(Map<String, String> var) {

        String name = var.get("username");
        String passwd = var.get("password");

        if (name.equals(null) || passwd.equals(null) || name.isEmpty() || passwd.isEmpty()) {
            msgDTO.setCode("1");
            msgDTO.setMsg("用户名或密码不能为空");
            return msgDTO;
        }

        userEntity.setUSERNAME(name);
        List<UserEntity> userlist = new ArrayList<UserEntity>();
        userlist = iUserDao.select(userEntity);
        if(userlist.size() != 1){
            msgDTO.setCode("1");
            msgDTO.setMsg("用户不存在");
            return msgDTO;
        }

        userEntity = userlist.get(0);
        if (!name.equals(userEntity.getUSERNAME()) || !passwd.equals(userEntity.getPASSWORD())){
            msgDTO.setCode("1");
            msgDTO.setMsg("用户名或密码不正确");
        }

        msgDTO.setCode("0");
        msgDTO.setMsg("登录成功");
        return msgDTO;
    }

    @Override
    public MsgDTO register(Map<String, String> var) {

        String name = var.get("username");
        String passwd = var.get("password");
        String phone = var.get("phone");

        if (name.equals(null) || name.isEmpty()){
            msgDTO.setCode("1");
            msgDTO.setMsg("用户名不能为空");
            return msgDTO;
        }

        if (passwd.equals(null) || passwd.isEmpty()){
            msgDTO.setCode("1");
            msgDTO.setMsg("密码不能为空");
            return msgDTO;
        }

        if (phone.equals(null) || phone.isEmpty()){
            msgDTO.setCode("1");
            msgDTO.setMsg("手机号不能为空");
            return msgDTO;
        }

        userEntity.setUID(0);
        userEntity.setUSERNAME(name);
        userEntity.setPASSWORD(passwd);
        userEntity.setPHONE(phone);

        iUserDao.insert(userEntity);

        msgDTO.setCode("0");
        msgDTO.setMsg("注册成功");
        return msgDTO;
    }

    @Override
    public UserEntity getUserInfo(Map<String, String> var) {
        return userEntity;
    }


}
