package com.djweb.service.db;

import com.djweb.entity.UserEntity;

public interface IUserDB {
    //用户是否存在
    public boolean IsExistByUid(Integer uid);
    //获取用户信息
    public UserEntity GetUserByUid(Integer uid);
    //添加用户
    public void AddUser(UserEntity userEntity);
}
