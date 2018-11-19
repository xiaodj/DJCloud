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

    @Override
    public BaseDto AddTrigger(Map<String, String> var) {
        return null;
    }

    @Override
    public BaseDto UpdateTrigger(Map<String, String> var) {
        return null;
    }

    @Override
    public TriggerDto GetTrigger(Integer tid) {
        return null;
    }

    @Override
    public TriggersDto GetTriggers(Integer pid) {
        return null;
    }

    @Override
    public BaseDto DeleteTrigger(Integer tid) {
        return null;
    }
}
