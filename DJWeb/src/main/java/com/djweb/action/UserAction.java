package com.djweb.action;

import com.djweb.dto.BaseDto;
import com.djweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by xiaodj on 2018/7/16.
 */

@Controller
public class UserAction {

    @Autowired
    private IUserService iUser;

    /**
     * 用户注册接口
     * @author dengjiang
     */
    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    public @ResponseBody BaseDto register(@RequestBody Map<String, String> param){
        return iUser.register(param);
    }

    /**
     * 用户登录接口
     * @author dengjiang
     */
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public @ResponseBody BaseDto login(@RequestBody Map<String, String> param){
        return iUser.login(param);
    }

    /**
     * 用户退出接口
     * @author dengjiang
     */
    @RequestMapping(value = "/user/{uid}/quit", method = RequestMethod.POST)
    public @ResponseBody BaseDto quit(){
        return iUser.quit(1);
    }
}
