package com.djweb.action;

import com.djweb.dto.*;
import com.djweb.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class AttributeAction {

    @Autowired
    private IAttributeService iAttribute;

    /**
     * 增加属性接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/{pid}/Attribute", method = RequestMethod.POST)
    public @ResponseBody
    BaseDto AddAttribute(@PathVariable("pid") String pid, @RequestBody Map<String, String> param){
        param.put("PID", pid);
        return iAttribute.AddAttribute(param);
    }

    /**
     * 更新属性信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/Attribute/{aid}", method = RequestMethod.PUT)
    public @ResponseBody BaseDto UpdateAttribute(@PathVariable("aid") String aid, @RequestBody Map<String, String> param){
        param.put("AID", aid);
        return iAttribute.UpdateAttribute(param);
    }

    /**
     * 查看指定属性详细信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/Attribute/{aid}", method = RequestMethod.GET)
    public @ResponseBody
    AttributeDto GetAttribute(@PathVariable("aid") Integer aid){
        return iAttribute.GetAttribute(aid);
    }

    /**
     * 查看指定产品下所有属性信息
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/{pid}/Attributes", method = RequestMethod.GET)
    public @ResponseBody
    AttributesDto GetAttributes(@PathVariable("pid") Integer pid){
        return iAttribute.GetAttributes(pid);
    }

    /**
     * 删除指定属性
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/Attribute/{aid}", method = RequestMethod.DELETE)
    public @ResponseBody BaseDto DeleteAttribute(@PathVariable("aid") Integer aid){
        return iAttribute.DeleteProduct(aid);
    }
}
