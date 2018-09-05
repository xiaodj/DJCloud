package com.djweb.service.impl;

import com.djweb.dao.IDeviceDAO;
import com.djweb.dao.ITriggerDAO;
import com.djweb.dto.*;
import com.djweb.entity.DeviceEntity;
import com.djweb.entity.TriggerEntity;
import com.djweb.service.ITriggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TriggerServiceImpl implements ITriggerService {

    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    private ITriggerDAO iTrigDao;
    @Autowired
    private TriggerEntity trigEntity;
    @Autowired
    private TriggersInfoDTO trigsInfoDTO;

    @Override
    public MsgDTO createTrigger(Map<String, String> var) {

        String tggnm = var.get("tggnm");
        String tggctl = var.get("tggctl");
        String attrnm = var.get("attrnm");
        String tggcond = var.get("tggcond");
        String tggaccept = var.get("tggaccept");
        String pid = var.get("pid");

        trigEntity.setTRIGNAME(tggnm);
        trigEntity.setTRIGCONDITION(tggctl);
        trigEntity.setATTRNAME(attrnm);
        trigEntity.setTRIGCONDITION(tggcond);
        trigEntity.setACCEPTWAY(tggaccept);
        trigEntity.setPID(Integer.valueOf(pid));

        iTrigDao.insert(trigEntity);
        return msgDTO;
    }

    @Override
    public MsgDTO deleteTrigger(String tid) {
        iTrigDao.deleteByTID(Integer.valueOf(tid));
        return msgDTO;
    }

    @Override
    public TriggersInfoDTO getTriggersInfo(String pid) {
        List<TriggerEntity> listTggs = new ArrayList<TriggerEntity>();
        listTggs = iTrigDao.selectByPID(Integer.valueOf(pid));
        return trigsInfoDTO;
    }
}
