package com.djweb.service.db;

import com.djweb.entity.UserEntity;

public interface IUserDB {
    //用户是否存在
    public boolean IsExistOfUser(String username);
    //获取用户信息
    public UserEntity GetUserByUid(Integer uid);
    //获取用户信息
    public UserEntity GetUserByUserName(String username);
    //添加用户
    public boolean AddUser(UserEntity userEntity);
}
