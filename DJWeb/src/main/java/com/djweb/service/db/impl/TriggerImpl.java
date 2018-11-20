package com.djweb.service.db.impl;

import com.djweb.entity.TriggerEntity;
import com.djweb.service.db.ITriggerDB;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/20.
 */
public class TriggerImpl implements ITriggerDB {
    @Override
    public boolean IsExistOfTrigger(String trigname) {
        return false;
    }

    @Override
    public boolean AddTrigger(TriggerEntity trigger) {
        return false;
    }

    @Override
    public boolean UpdateTriggerByTID(TriggerEntity trigger) {
        return false;
    }

    @Override
    public TriggerEntity GetTriggerByTID(Integer tid) {
        return null;
    }

    @Override
    public List<TriggerEntity> GetTriggersByPID(Integer pid) {
        return null;
    }

    @Override
    public boolean DeleteTriggerByTID(Integer tid) {
        return false;
    }
}
