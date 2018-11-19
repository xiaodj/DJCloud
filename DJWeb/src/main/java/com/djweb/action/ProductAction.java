package com.djweb.action;

import com.djweb.dto.BaseDto;
import com.djweb.dto.ProductDto;
import com.djweb.dto.ProductsDto;
import com.djweb.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by xiaodj on 2018/7/17.
 */
@Controller
public class ProductAction {

    /**
     * 增加新产品接口
     * @author dengjiang
     */
    @RequestMapping(value = "/user/{uid}/product", method = RequestMethod.POST)
    public @ResponseBody BaseDto AddProduct(@RequestBody Map<String, String> param){
        return null;
    }

    /**
     * 更新产品信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/user/product/{pid}", method = RequestMethod.PUT)
    public @ResponseBody BaseDto UpdateProduct(@RequestBody Map<String, String> param){
        return null;
    }

    /**
     * 获取指定产品详细信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/user/product/{pid}", method = RequestMethod.GET)
    public @ResponseBody ProductDto GetProduct(){
        return null;
    }

    /**
     * 获取用户所有产品信息接口
     * @author dengjiang
     */
    @RequestMapping(value = "/user/{uid}/products", method = RequestMethod.GET)
    public @ResponseBody ProductsDto GetProducts(){
        return null;
    }

    /**
     * 删除指定产品接口
     * @author dengjiang
     */
    @RequestMapping(value = "/user/product/{pid}", method = RequestMethod.DELETE)
    public @ResponseBody BaseDto DeleteProduct(){
        return null;
    }
}
