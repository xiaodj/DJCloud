package com.djweb.dao;

import com.djweb.entity.ProductEntity;
import com.djweb.entity.TriggerEntity;

import java.util.List;

public interface ITriggerDAO extends IBaseDAO<TriggerEntity> {
    //增
    public boolean insert(TriggerEntity triggerEntity);
    //删
    public boolean delete(TriggerEntity triggerEntity);
    //改
    public boolean update(TriggerEntity triggerEntity);
    //查询
    public List<TriggerEntity> select(TriggerEntity triggerEntity);
}
