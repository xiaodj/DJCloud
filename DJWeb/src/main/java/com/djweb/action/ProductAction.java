package com.djweb.action;

import com.djweb.dto.MsgDTO;
import com.djweb.dto.ProductsInfo;
import com.djweb.dto.ProductsInfoDTO;
import com.djweb.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by xiaodj on 2018/7/17.
 */
@Controller
public class ProductAction {

    @Autowired
    private IProductService IProdService;
    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    ProductsInfoDTO prodsInfoDTO;

    /**
     * 查询用户所有产品基本信息
     */
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public @ResponseBody ProductsInfoDTO getProducts(HttpSession session){

        String login = (String)session.getAttribute("login");
        if (login.equals(null) || login.isEmpty() || !login.equals("yes")) {
            prodsInfoDTO.setCode(1);
        } else {
            int uid = (int)session.getAttribute("uid");
            //用户ID
            prodsInfoDTO = IProdService.getProductsInfo(uid);
        }

        return prodsInfoDTO;
    }

    /**
     * 查询用户某一个产品的详细信息
     */
    @RequestMapping(value = "/products/11111", method = RequestMethod.GET)
    public @ResponseBody MsgDTO getProductInfo(){
        return msgDTO;
    }

    /**
     * 创建一个产品
     */
    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public @ResponseBody MsgDTO createProduct(@RequestBody Map<String, String> param){
        msgDTO = IProdService.createProduct(param);
        return msgDTO;
    }
}
