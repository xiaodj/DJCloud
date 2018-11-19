package com.djweb.service;

import com.djweb.dto.BaseDto;
import com.djweb.dto.TriggerDto;
import com.djweb.dto.TriggersDto;

import java.util.Map;

public interface ITriggerService {

    //添加触发器
    public BaseDto AddTrigger(Map<String, String> var);

    //更新触发器
    public BaseDto UpdateTrigger(Map<String, String> var);

    //查看指定触发器信息
    public TriggerDto GetTrigger(Integer tid);

    //查看产品下所有触发器信息
    public TriggersDto GetTriggers(Integer pid);

    //删除触发器
    public BaseDto DeleteTrigger(Integer tid);
}
