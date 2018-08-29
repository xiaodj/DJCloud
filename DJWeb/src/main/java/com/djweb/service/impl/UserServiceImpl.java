package com.djweb.service.impl;

import com.djweb.dao.IUserDao;
import com.djweb.dto.MsgDTO;
import com.djweb.dto.UserInfoDTO;
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

        String username = var.get("username");
        String passwd = var.get("password");

        if (username.equals(null) || passwd.equals(null) || username.isEmpty() || passwd.isEmpty()) {
            msgDTO.setCode("1");
            msgDTO.setMsg("用户名或密码不能为空");
            return msgDTO;
        }

        userEntity.setUSERNAME(username);
        List<UserEntity> userlist = new ArrayList<UserEntity>();
        userlist = iUserDao.select(userEntity);
        if(userlist.size() != 1){
            msgDTO.setCode("1");
            msgDTO.setMsg("用户不存在");
            return msgDTO;
        }

        userEntity = userlist.get(0);
        if (!username.equals(userEntity.getUSERNAME()) || !passwd.equals(userEntity.getPASSWORD())){
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
        String rpasswd = var.get("rpassword");
        //String mobile = var.get("mobile");

        if (name.equals(null) || name.isEmpty()){
            msgDTO.setCode("1");
            msgDTO.setMsg("用户名不能为空");
            return msgDTO;
        }

        if (passwd.equals(null) || passwd.isEmpty() || rpasswd.equals(null) || rpasswd.isEmpty()){
            msgDTO.setCode("1");
            msgDTO.setMsg("密码不能为空");
            return msgDTO;
        }

//        if (mobile.equals(null) || mobile.isEmpty()){
//            msgDTO.setCode("1");
//            msgDTO.setMsg("手机号不能为空");
//            return msgDTO;
//        }

        if (!passwd.equals(rpasswd)){
            msgDTO.setCode("1");
            msgDTO.setMsg("两次输入的密码不相同");
            return msgDTO;
        }

        userEntity.setUID(0);
        userEntity.setUSERNAME(name);
        userEntity.setPASSWORD(passwd);
        //userEntity.setMOBILE(mobile);

        iUserDao.insert(userEntity);

        msgDTO.setCode("0");
        msgDTO.setMsg("注册成功");

        return msgDTO;
    }

    @Override
    public UserInfoDTO getUserInfo(String username) {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userEntity.setUSERNAME(username);
        List<UserEntity> userlist = new ArrayList<UserEntity>();
        userlist = iUserDao.select(userEntity);

        return userInfoDTO;
    }


}
