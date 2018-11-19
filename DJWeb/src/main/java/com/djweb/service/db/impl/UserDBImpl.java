package com.djweb.service.db.impl;

import com.djweb.dao.IUserDAO;
import com.djweb.entity.UserEntity;
import com.djweb.service.db.IUserDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDBImpl implements IUserDB {

    @Autowired
    private IUserDAO iUserDao;

    @Override
    public boolean IsExistByUid(Integer uid) {
        return false;
    }

    @Override
    public UserEntity GetUserByUid(Integer uid) {
        return null;
    }

    @Override
    public void AddUser(UserEntity userEntity) {

    }
}
