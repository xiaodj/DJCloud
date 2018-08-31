package com.djweb.dao;

import com.djweb.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaodj on 2018/8/24.
 */

@Repository
public interface IUserDAO{
    //增
    public boolean insert(UserEntity userEntity);
    //删除用户
    public boolean deleteByUID(int uid);
    //删除用户
    public boolean deleteByName(String username);
    //更改用户信息
    //public boolean update(UserEntity userEntity);
    //查询用户信息
    public UserEntity selectByName(String username);
    //查询用户信息
    public UserEntity selectByUID(int uid);
}
