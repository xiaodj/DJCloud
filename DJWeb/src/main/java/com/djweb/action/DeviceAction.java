package com.djweb.action;

import com.djweb.dto.*;
import com.djweb.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class DeviceAction {

    @Autowired
    private IDeviceService iDevice;

    /**
     * 增加设备接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/{pid}/device", method = RequestMethod.POST)
    public @ResponseBody BaseDto AddDevice(@RequestBody Map<String, String> param){
        return null;
    }

    /**
     * 更新设备信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/device/{did}", method = RequestMethod.PUT)
    public @ResponseBody
    BaseDto UpdateDevice(@RequestBody Map<String, String> param){
        return null;
    }

    /**
     * 查看指定设备详细信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/device/{did}", method = RequestMethod.GET)
    public @ResponseBody
    DeviceDto GetDevice(){
        return null;
    }

    /**
     * 查看指定产品下所有设备信息
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/{pid}/devices", method = RequestMethod.GET)
    public @ResponseBody
    DevicesDto GetDevices(){
        return null;
    }

    /**
     * 删除指定设备
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/device/{did}", method = RequestMethod.DELETE)
    public @ResponseBody BaseDto DeleteDevice(){
        return null;
    }
}
