package com.djweb.action;

import com.djweb.dto.DeviceInfoDTO;
import com.djweb.dto.DevicesInfoDTO;
import com.djweb.dto.MsgDTO;
import com.djweb.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class DeviceAction {

    @Autowired
    private IDeviceService IDevService;
    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    private DevicesInfoDTO devsInfoDTO;
    @Autowired
    private DeviceInfoDTO devInfoDTO;

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
    public @ResponseBody MsgDTO delDevice(@PathVariable("did") String did){
        msgDTO = IDevService.deleteDevice(did);
        return msgDTO;
    }

    /**
     * 修改设备
     */
    @RequestMapping(value = "/devices", method = RequestMethod.PUT)
    public void putDevice(){

    }

    /**
     * 查询产品中所有设备基本信息
     */
    @RequestMapping(value = "/product/{pid}/devices", method = RequestMethod.GET)
    public DevicesInfoDTO getDevicesInfo(@PathVariable("pid") String pid){
        devsInfoDTO = IDevService.getDevicesInfo(pid);
        return devsInfoDTO;
    }

    /**
     * 查询设备详细信息
     */
    @RequestMapping(value = "/product/{pid}/devices/{did}", method = RequestMethod.GET)
    public DeviceInfoDTO getDeviceInfo(@PathVariable("did") String did){
        devInfoDTO = IDevService.getDeviceInfo(did);
        return devInfoDTO;
    }
}
