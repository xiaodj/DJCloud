package com.djweb.service.impl;

import com.djweb.dao.IUserDao;
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


    @Override
    public boolean login(Map<String, String> var) {
        String name = var.get("username");
        String passwd = var.get("password");

        if (name.equals(null) || passwd.equals(null) || name.isEmpty() || passwd.isEmpty())
            return false;

        userEntity.setUSERNAME(name);

        List<UserEntity> userlist = new ArrayList<UserEntity>();
        userlist = iUserDao.select(userEntity);
        if(userlist.size() != 1)
            return false;

        userEntity = userlist.get(0);
        if (!name.equals(userEntity.getUSERNAME()) || !passwd.equals(userEntity.getPASSWORD()))
            return false;

        return true;
    }

    @Override
    public boolean register(Map<String, String> var) {

        String name = var.get("username");
        String passwd = var.get("password");

        if (name.equals(null) || passwd.equals(null) || name.isEmpty() || passwd.isEmpty())
            return false;


        userEntity.setUID(0);
        userEntity.setUSERNAME(var.get("username"));
        userEntity.setPASSWORD(var.get("password"));

        iUserDao.insert(userEntity);

        return true;
    }

    @Override
    public UserEntity getUserInfo(Map<String, String> var) {
        return userEntity;
    }


}
