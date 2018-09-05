package com.djweb.action;

import com.djweb.dto.AttributesInfoDTO;
import com.djweb.dto.MsgDTO;
import com.djweb.dto.TriggersInfoDTO;
import com.djweb.entity.TriggerEntity;
import com.djweb.service.IAttributeService;
import com.djweb.service.ITriggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TriggerAction {

    @Autowired
    private ITriggerService ITrigService;
    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    private TriggersInfoDTO trigsInfoDTO;

    /**
     * 添加触发器
     */
    @RequestMapping(value = "/trigger", method = RequestMethod.POST)
    public @ResponseBody
    MsgDTO createAttribute(@RequestBody Map<String, String> param){
        msgDTO = ITrigService.createTrigger(param);
        return msgDTO;
    }

    /**
     * 删除触发器
     */
    @RequestMapping(value = "/trigger/{tid}", method = RequestMethod.DELETE)
    public @ResponseBody MsgDTO delAttribute(@PathVariable("tid") String tid){
        msgDTO = ITrigService.deleteTrigger(tid);
        return msgDTO;
    }

    /**
     * 查询产品中所有的触发器
     */
    @RequestMapping(value = "/products/triggers/{pid}", method = RequestMethod.GET)
    public TriggersInfoDTO getAttrsInfo(@PathVariable("pid") String pid){
        trigsInfoDTO = ITrigService.getTriggersInfo(pid);
        return trigsInfoDTO;
    }
}
