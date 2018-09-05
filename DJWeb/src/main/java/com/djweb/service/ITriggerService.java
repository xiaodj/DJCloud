package com.djweb.service;

import com.djweb.dto.MsgDTO;
import com.djweb.dto.TriggersInfoDTO;

import java.util.Map;

public interface ITriggerService {

    //创建产品触发器
    public MsgDTO createTrigger(Map<String, String> var);

    //删除产品触发器
    public MsgDTO deleteTrigger(String tid);

    //获取所有产品触发器信息
    public TriggersInfoDTO getTriggersInfo(String pid);
}
