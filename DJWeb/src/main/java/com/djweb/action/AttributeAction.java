package com.djweb.action;

import com.djweb.dto.*;
import com.djweb.service.IAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class AttributeAction {

    /**
     * 增加属性接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/{pid}/Attribute", method = RequestMethod.POST)
    public @ResponseBody
    BaseDto AddAttribute(@RequestBody Map<String, String> param){
        return null;
    }

    /**
     * 更新属性信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/Attribute/{aid}", method = RequestMethod.PUT)
    public @ResponseBody BaseDto UpdateAttribute(@RequestBody Map<String, String> param){
        return null;
    }

    /**
     * 查看指定属性详细信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/Attribute/{aid}", method = RequestMethod.GET)
    public @ResponseBody
    AttributeDto GetAttribute(){
        return null;
    }

    /**
     * 查看指定产品下所有属性信息
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/{pid}/Attributes", method = RequestMethod.GET)
    public @ResponseBody
    AttributesDto GetAttributes(){
        return null;
    }

    /**
     * 删除指定属性
     * @author dengjiang
     */
    @RequestMapping(value = "/app/product/Attribute/{aid}", method = RequestMethod.DELETE)
    public @ResponseBody BaseDto DeleteAttribute(){
        return null;
    }
}
