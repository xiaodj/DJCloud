package com.djweb.service.impl;

import com.djweb.dao.IUserDAO;
import com.djweb.dto.MsgDTO;
import com.djweb.dto.UserInfoDTO;
import com.djweb.entity.UserEntity;
import com.djweb.service.IUserService;
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
    private IUserDAO iUserDao;
    @Autowired
    private UserEntity userEntity;
    @Autowired
    private MsgDTO msgDTO;


    @Override
    public MsgDTO login(Map<String, String> var, HttpSession session) {

        String username = var.get("username");
        String passwd = var.get("password");

        if (username.equals(null) || passwd.equals(null) || username.isEmpty() || passwd.isEmpty()) {
            msgDTO.setCode(101);
            //用户名或密码为空
            return msgDTO;
        }

        userEntity = iUserDao.selectByName(username);
        if(userEntity.getUSERNAME().isEmpty() || userEntity.getUSERNAME().equals(null)){
            msgDTO.setCode(100);
            return msgDTO;
        }

        if (!username.equals(userEntity.getUSERNAME()) || !passwd.equals(userEntity.getPASSWORD())){
            msgDTO.setCode(102);
            return msgDTO;
        }

        msgDTO.setCode(0);

        session.setMaxInactiveInterval(2*60);
        session.setAttribute("login","yes");
        session.setAttribute("uid",userEntity.getUID());

        return msgDTO;
    }

    @Override
    public MsgDTO register(Map<String, String> var) {

        String name = var.get("username");
        String passwd = var.get("password");
        String rpasswd = var.get("rpassword");
        //String mobile = var.get("mobile");

        if (name.equals(null) || name.isEmpty()){
            msgDTO.setCode(121);
            return msgDTO;
        }

        if (passwd.equals(null) || passwd.isEmpty()) {
            msgDTO.setCode(122);
            return msgDTO;
        }

        if (rpasswd.equals(null) || rpasswd.isEmpty()){
            msgDTO.setCode(123);
            return msgDTO;
        }

//        if (mobile.equals(null) || mobile.isEmpty()){
//            msgDTO.setCode("1");
//            msgDTO.setMsg("手机号不能为空");
//            return msgDTO;
//        }

        if (!passwd.equals(rpasswd)){
            msgDTO.setCode(124);
            return msgDTO;
        }

        userEntity.setUSERNAME(name);
        userEntity.setPASSWORD(passwd);
        //userEntity.setMOBILE(mobile);

        iUserDao.insert(userEntity);

        msgDTO.setCode(0);

        return msgDTO;
    }

    @Override
    public UserInfoDTO getUserInfo(String uid) {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userEntity = iUserDao.selectByUID(Integer.valueOf(uid));

        if (userEntity.getUSERNAME().isEmpty() || userEntity.getUSERNAME().equals(null)){
            userInfoDTO.setCode(100);
        }else {
            userInfoDTO.setCode(0);
            userInfoDTO.setUsername(userEntity.getUSERNAME());
        }
        return userInfoDTO;
    }
}
