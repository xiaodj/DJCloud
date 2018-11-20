package com.djweb.dto;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xiaodj on 2018/11/19.
 */
@Component
public class DevicesDto extends BaseDto {
    private List<DeviceInfo> Devices;

    public List<DeviceInfo> getDevices() {
        return Devices;
    }

    public void setDevices(List<DeviceInfo> devices) {
        Devices = devices;
    }
}
