package com.djweb.service.impl;

import com.djweb.dao.IDeviceDAO;
import com.djweb.dao.ITriggerDAO;
import com.djweb.dto.*;
import com.djweb.entity.DeviceEntity;
import com.djweb.entity.TriggerEntity;
import com.djweb.service.ITriggerService;
import com.djweb.service.db.ITriggerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TriggerServiceImpl implements ITriggerService {

    @Autowired
    private ITriggerDB iTriggerDB;

    @Autowired
    private BaseDto baseDto;
    @Autowired
    private TriggerDto triggerDto;
    @Autowired
    private TriggersDto triggersDto;

    @Override
    public BaseDto AddTrigger(Map<String, String> var) {

        String trigName = var.get("TrigName");
        String controlRange = var.get("ControlRange");
        String attrName = var.get("AttrName");
        String trigSymbol = var.get("TrigSymbol");
        String trigValue = var.get("TrigValue");
        String msgAccess = var.get("MsgAccess");
        String msgAddress = var.get("MsgAddress");
        String pid = var.get("PID");

        //判断触发器名是否存在
        if (iTriggerDB.IsExistOfTrigger(trigName)){
            baseDto.setCode(1);
            baseDto.setMessage("触发器名已存在");
            return baseDto;
        }

        TriggerEntity triggerEntity = new TriggerEntity();
        triggerEntity.setTRIGNAME(trigName);
        triggerEntity.setCONTROLRANGE(controlRange);
        triggerEntity.setATTRNAME(attrName);
        triggerEntity.setTRIGSYMBOL(trigSymbol);
        triggerEntity.setTRIGVALUE(trigValue);
        triggerEntity.setMSGACCESS(msgAccess);
        triggerEntity.setMSGADDRESS(msgAddress);
        triggerEntity.setPID(Integer.parseInt(pid));

        if (!iTriggerDB.AddTrigger(triggerEntity)){
            baseDto.setCode(1);
            baseDto.setMessage("触发器添加失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("触发器添加成功");
            return baseDto;
        }
    }

    @Override
    public BaseDto UpdateTrigger(Map<String, String> var) {

        TriggerEntity triggerEntity = new TriggerEntity();
        triggerEntity.setTID(Integer.parseInt(var.get("PID")));
        triggerEntity.setTRIGNAME(var.get("TrigName"));
        triggerEntity.setATTRNAME(var.get("AttrName"));
        triggerEntity.setCONTROLRANGE(var.get("ControlRange"));
        triggerEntity.setTRIGSYMBOL(var.get("TrigSymbol"));
        triggerEntity.setTRIGVALUE(var.get("TrigValue"));
        triggerEntity.setMSGACCESS(var.get("MsgAccess"));
        triggerEntity.setMSGADDRESS(var.get("MsgAddress"));


        if (!iTriggerDB.UpdateTriggerByTID(triggerEntity)){
            baseDto.setCode(1);
            baseDto.setMessage("更新触发器信息失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("更新触发器信息成功");
            return baseDto;
        }
    }

    @Override
    public TriggerDto GetTrigger(Integer tid) {
        TriggerEntity triggerEntity = iTriggerDB.GetTriggerByTID(tid);
        if (triggerEntity == null){
            triggerDto.setCode(1);
            triggerDto.setMessage("获取触发器(tid=" +String.valueOf(tid)+ ")信息失败");
            return triggerDto;
        }

        triggerDto.setCode(0);
        triggerDto.setMessage("获取触发器信息成功");
        triggerDto.setTrigName(triggerEntity.getTRIGNAME());
        triggerDto.setAttrName(triggerEntity.getATTRNAME());
        triggerDto.setControlRange(triggerEntity.getCONTROLRANGE());
        triggerDto.setTrigSymbol(triggerEntity.getTRIGSYMBOL());
        triggerDto.setTrigValue(triggerEntity.getTRIGVALUE());
        triggerDto.setMsgAccess(triggerEntity.getMSGACCESS());
        triggerDto.setMsgAddress(triggerEntity.getMSGADDRESS());
        return triggerDto;
    }

    @Override
    public TriggersDto GetTriggers(Integer pid) {
        List<TriggerInfo> triggerInfoList = new ArrayList<TriggerInfo>();
        List<TriggerEntity> triggerEntityList = iTriggerDB.GetTriggersByPID(pid);
        for (TriggerEntity triggerEntity: triggerEntityList) {
            TriggerInfo triggerInfo = new TriggerInfo();

            triggerInfoList.add(triggerInfo);
        }
        triggersDto.setCode(0);
        triggersDto.setMessage("查询所有触发器信息成功");
        triggersDto.setTriggers(triggerInfoList);
        return triggersDto;
    }

    @Override
    public BaseDto DeleteTrigger(Integer tid) {
        if (!iTriggerDB.DeleteTriggerByTID(tid)){
            baseDto.setCode(0);
            baseDto.setMessage("触发器删除失败");
            return baseDto;
        }else {
            baseDto.setCode(0);
            baseDto.setMessage("触发器删除成功");
            return baseDto;
        }
    }
}
