package com.djweb.service.db;

import com.djweb.entity.TriggerEntity;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public interface ITriggerDB {
    //触发器是否存在
    public boolean IsExistOfTrigger(String trigname);
    //添加触发器
    public boolean AddTrigger(TriggerEntity trigger);
    //修改触发器信息
    public boolean UpdateTriggerByTID(TriggerEntity trigger);
    //根据触发器编码获取触发器信息
    public TriggerEntity GetTriggerByTID(Integer tid);
    //根据产品编码获取触发器信息
    public List<TriggerEntity> GetTriggersByPID(Integer pid);
    //根据触发器编码删除触发器信息
    public boolean DeleteTriggerByTID(Integer tid);
}
