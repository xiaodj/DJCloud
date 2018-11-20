package com.djweb.dto;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class TriggersDto extends BaseDto {
    private List<TriggerInfo> Triggers;

    public List<TriggerInfo> getTriggers() {
        return Triggers;
    }

    public void setTriggers(List<TriggerInfo> triggers) {
        Triggers = triggers;
    }
}
