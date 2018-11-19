package com.djweb.dto;

import java.util.ArrayList;

/**
 * Created by xiaodj on 2018/11/19.
 */
public class TriggersDto extends BaseDto {
    private ArrayList<TriggerInfo> Triggers;

    public ArrayList<TriggerInfo> getTriggers() {
        return Triggers;
    }

    public void setTriggers(ArrayList<TriggerInfo> triggers) {
        Triggers = triggers;
    }
}
