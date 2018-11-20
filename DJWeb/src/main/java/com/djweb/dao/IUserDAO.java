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
    //增加用户
    public boolean insert(UserEntity userEntity);
    //根据用户ID删除用户
    public boolean deleteByUID(Integer uid);
    //根据用户ID查询用户信息
    public UserEntity selectByUID(Integer uid);
    //根据用户名查询用户信息
    public UserEntity selectByUserName(String username);
}
