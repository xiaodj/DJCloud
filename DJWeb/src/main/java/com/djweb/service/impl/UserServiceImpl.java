package com.djweb.service.impl;

import com.djweb.dao.IUserDao;
import com.djweb.entity.UserEntity;
import com.djweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public boolean register(Map<String, String> map) {

        String name = map.get("username");
        String passwd = map.get("password");

        if (name.equals(null) || passwd.equals(null) || name.isEmpty() || passwd.isEmpty())
            return false;

        userEntity.setUID(0);
        userEntity.setUSERNAME(map.get("username"));
        userEntity.setPASSWORD(map.get("password"));

        iUserDao.insert();

        return true;
    }
}
