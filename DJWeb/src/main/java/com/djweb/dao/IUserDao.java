package com.djweb.dao;

import com.djweb.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by xiaodj on 2018/8/24.
 */

@Repository
public interface IUserDao {

    //查询
    //public void select();
    //插入
    public void insert();
    //更新
    //public void update();
    //删除
    //public void delete();
}
