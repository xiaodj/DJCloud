package com.djweb.action;

import com.djweb.dto.*;
import com.djweb.service.ITriggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class TriggerAction {

    @Autowired
    private ITriggerService iTrigger;

    /**
     * 增加触发器接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/{pid}/trigger", method = RequestMethod.POST)
    public @ResponseBody BaseDto AddTrigger(@PathVariable("pid") String pid, @RequestBody Map<String, String> param){
        param.put("PID", pid);
        return iTrigger.AddTrigger(param);
    }

    /**
     * 更新触发器信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/trigger/{tid}", method = RequestMethod.PUT)
    public @ResponseBody
    BaseDto UpdateTrigger(@PathVariable("tid") String tid, @RequestBody Map<String, String> param){
        param.put("TID", tid);
        return iTrigger.UpdateTrigger(param);
    }

    /**
     * 查看指定触发器详细信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/trigger/{tid}", method = RequestMethod.GET)
    public @ResponseBody
    TriggerDto GetTrigger(@PathVariable("tid") Integer tid){
        return iTrigger.GetTrigger(tid);
    }

    /**
     * 查看指定产品下所有触发器信息
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/{pid}/triggers", method = RequestMethod.GET)
    public @ResponseBody
    TriggersDto GetTriggers(@PathVariable("pid") Integer pid){
        return iTrigger.GetTriggers(pid);
    }

    /**
     * 删除指定触发器
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/trigger/{tid}", method = RequestMethod.DELETE)
    public @ResponseBody BaseDto DeleteTrigger(@PathVariable("tid") Integer tid){
        return iTrigger.DeleteTrigger(tid);
    }
}
