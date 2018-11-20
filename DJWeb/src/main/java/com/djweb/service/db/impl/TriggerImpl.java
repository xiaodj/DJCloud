package com.djweb.service.db.impl;

import com.djweb.dao.ITriggerDAO;
import com.djweb.entity.TriggerEntity;
import com.djweb.service.db.ITriggerDB;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public class TriggerImpl implements ITriggerDB {

    @Autowired
    private ITriggerDAO iTriggerDao;

    @Override
    public boolean IsExistOfTrigger(String trigname) {
        TriggerEntity triggerEntity = iTriggerDao.selectByTrigName(trigname);
        if (triggerEntity == null)
            return false;
        else
            return true;
    }

    @Override
    public boolean AddTrigger(TriggerEntity trigger) {
        return iTriggerDao.insert(trigger);
    }

    @Override
    public boolean UpdateTriggerByTID(TriggerEntity trigger) {
        return iTriggerDao.update(trigger);
    }

    @Override
    public TriggerEntity GetTriggerByTID(Integer tid) {
        return iTriggerDao.selectByTID(tid);
    }

    @Override
    public List<TriggerEntity> GetTriggersByPID(Integer pid) {
        return iTriggerDao.selectByPID(pid);
    }

    @Override
    public boolean DeleteTriggerByTID(Integer tid) {
        return iTriggerDao.deleteByTID(tid);
    }
}
