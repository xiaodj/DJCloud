package com.djweb.action;

import com.djweb.dto.MsgDTO;
import com.djweb.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class DeviceAction {

    @Autowired
    private IDeviceService IDevService;
    @Autowired
    private MsgDTO msgDTO;

    /**
     * 添加设备
     */
    @RequestMapping(value = "/devices", method = RequestMethod.POST)
    public @ResponseBody MsgDTO addDevice(@RequestBody Map<String, String> param){
        msgDTO = IDevService.createDevice(param);
        return msgDTO;
    }

    /**
     * 删除设备
     */
    @RequestMapping(value = "/devices/{did}", method = RequestMethod.DELETE)
    public void delDevice(){

    }

    /**
     * 修改设备
     */
    @RequestMapping(value = "/devices", method = RequestMethod.PUT)
    public void putDevice(){

    }

    /**
     * 查询设备详细信息
     */
    @RequestMapping(value = "/devices/{did}", method = RequestMethod.GET)
    public void getDeviceInfo(){

    }

    /**
     * 查询产品中所有设备基本信息
     */
    @RequestMapping(value = "/devices", method = RequestMethod.GET)
    public void getDevicesInfo(){

    }
}
