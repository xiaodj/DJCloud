package com.djweb.dao;

import com.djweb.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaodj on 2018/8/24.
 */

@Repository
public interface IUserDAO extends IBaseDAO<UserEntity>{
    //增
    public boolean insert(UserEntity userEntity);
    //删
    public boolean delete(UserEntity userEntity);
    //改
    public boolean update(UserEntity userEntity);
    //查询
    public List<UserEntity> select(UserEntity userEntity);
}
