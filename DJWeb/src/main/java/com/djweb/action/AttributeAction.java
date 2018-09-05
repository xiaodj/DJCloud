package com.djweb.action;

import com.djweb.dto.AttributesInfoDTO;
import com.djweb.dto.MsgDTO;
import com.djweb.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class AttributeAction {

    @Autowired
    private IAttributeService IAttrService;
    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    private AttributesInfoDTO attrsInfoDTO;

    /**
     * 添加产品属性
     */
    @RequestMapping(value = "/attribute", method = RequestMethod.POST)
    public @ResponseBody MsgDTO createAttribute(@RequestBody Map<String, String> param){
        msgDTO = IAttrService.createAttribute(param);
        return msgDTO;
    }

    /**
     * 删除产品属性
     */
    @RequestMapping(value = "/attribute/{aid}", method = RequestMethod.DELETE)
    public @ResponseBody MsgDTO delAttribute(@PathVariable("aid") String aid){
        msgDTO = IAttrService.deleteAttribute(aid);
        return msgDTO;
    }

    /**
     * 修改产品属性
     */
    @RequestMapping(value = "/attribute", method = RequestMethod.PUT)
    public void pubAttribute(){

    }

    /**
     * 查询产品所有属性
     */
    @RequestMapping(value = "/attributes/{pid}", method = RequestMethod.GET)
    public AttributesInfoDTO getAttrsInfo(@PathVariable("pid") String pid){
        attrsInfoDTO = IAttrService.getAttributesInfo(pid);
        return attrsInfoDTO;
    }
}
