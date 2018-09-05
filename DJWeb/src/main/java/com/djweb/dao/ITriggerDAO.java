package com.djweb.dao;

import com.djweb.entity.ProductEntity;
import com.djweb.entity.TriggerEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITriggerDAO{
    //增
    public boolean insert(TriggerEntity triggerEntity);
    //根据触发器ID删除触发器
    public boolean deleteByTID(Integer tid);
    //根据产品ID查询触发器信息
    public List<TriggerEntity> selectByPID(Integer pid);

}
