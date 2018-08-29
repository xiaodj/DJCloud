package com.djweb.action;

import com.djweb.dto.MsgDTO;
import com.djweb.dto.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by xiaodj on 2018/7/17.
 */
@Controller
public class ProductAction {

    @Autowired
    private MsgDTO msgDTO;

    /**
     * 查询用户所有产品基本信息
     */

    /**
     * 查询用户某一个产品的详细信息
     */

    /**
     * 创建一个产品
     */
    @RequestMapping(value = "/product.do", method = RequestMethod.POST)
    public @ResponseBody MsgDTO createProduct(){

        return msgDTO;
    }
}
