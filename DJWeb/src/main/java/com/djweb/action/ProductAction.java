package com.djweb.action;

import com.djweb.dto.MsgDTO;
import com.djweb.dto.ProductsInfo;
import com.djweb.dto.ProductsInfoDTO;
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

    @Autowired
    private IProductService IProdService;
    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    private ProductsInfoDTO prodsInfoDTO;

    /**
     * 添加产品
     */
    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public @ResponseBody MsgDTO createProduct(@RequestBody Map<String, String> param){
        msgDTO = IProdService.createProduct(param);
        return msgDTO;
    }

    /**
     * 删除产品
     */
    @RequestMapping(value = "/product/{pid}", method = RequestMethod.DELETE)
    public @ResponseBody MsgDTO deleteProduct(@PathVariable("pid") String pid){
        msgDTO = IProdService.deleteProduct(pid);
        return msgDTO;
    }

    /**
     * 修改产品信息
     */
    @RequestMapping(value = "/product/{pid}", method = RequestMethod.PUT)
    public @ResponseBody MsgDTO updateProduct(@PathVariable("pid") String pid, @RequestBody Map<String, String> param){

        return msgDTO;
    }

    /**
     * 查询用户某一个产品的详细信息
     */
    @RequestMapping(value = "/products/{pid}", method = RequestMethod.GET)
    public @ResponseBody MsgDTO getProductInfo(@PathVariable("pid") String pid){

        return msgDTO;
    }

    /**
     * 查询用户所有产品基本信息
     */
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public @ResponseBody ProductsInfoDTO getProducts(HttpSession session){

        String login = (String)session.getAttribute("login");
        if (login.equals(null) || login.isEmpty() || !login.equals("yes")) {
            prodsInfoDTO.setCode(1);
        } else {
            String uid = (String) session.getAttribute("uid");
            //用户ID
            prodsInfoDTO = IProdService.getProductsInfo(uid);
        }

        return prodsInfoDTO;
    }
}
