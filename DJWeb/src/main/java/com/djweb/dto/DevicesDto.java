package com.djweb.dto;

import java.util.ArrayList;

/**
 * Created by xiaodj on 2018/11/19.
 */
public class DevicesDto extends BaseDto {
    private ArrayList<DeviceInfo> Devices;

    public ArrayList<DeviceInfo> getDevices() {
        return Devices;
    }

    public void setDevices(ArrayList<DeviceInfo> devices) {
        Devices = devices;
    }
}
