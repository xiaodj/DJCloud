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
    public boolean IsExistOfUserName(String username) {
        UserEntity userEntity = iUserDao.selectByUserName(username);
        if (userEntity == null)
            return false;
        else
            return true;
    }

    @Override
    public UserEntity GetUserByUid(Integer uid) {
        return iUserDao.selectByUID(uid);
    }

    @Override
    public UserEntity GetUserByUserName(String username) {
        return iUserDao.selectByUserName(username);
    }

    @Override
    public boolean AddUser(UserEntity userEntity) {
        return iUserDao.insert(userEntity);
    }
}
