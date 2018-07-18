package com.djweb.action;

import com.djweb.entity.request.loginEntity;
import com.djweb.entity.request.registerEntity;
import com.djweb.entity.response.msgEntity;
import com.djweb.entity.response.userDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by xiaodj on 2018/7/16.
 */

@Controller
public class userAction {

    @Autowired
    private msgEntity msg;

    @Autowired
    private userDataEntity userData;

    /**
     * 获取用户信息
     * @author dengjiang
     *
     */
    @RequestMapping(value = "/userdata.do", method = RequestMethod.GET)
    public @ResponseBody userDataEntity getUserData(HttpSession session){
        String name = (String) session.getAttribute("username");
        if (name == null || name.isEmpty()){
            userData.setCode("1");
            userData.setNickname("");
        }else {
            userData.setCode("0");
            userData.setNickname("key_小江");
        }

        return userData;
    }

    /**
     *  登录
     * @author dengjiang
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public @ResponseBody msgEntity login(@RequestBody loginEntity loginParam, HttpSession session){
        String name = loginParam.getUsername();
        String pwd = loginParam.getPassword();

        if (name.equals("xiaodj") && pwd.equals("xiaodj2014")){
            session.setMaxInactiveInterval(2*60);
            session.setAttribute("username", name);
            msg.setCode("0");
            msg.setMsg("登录成功");
        } else{
            msg.setCode("1");
            msg.setMsg("用户名或密码不正确");
        }
        return msg;
    }

    /**
     * 用户注册
     * @author dengjiang
     */
    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public @ResponseBody msgEntity register(@RequestBody registerEntity regParam){
        String name = regParam.getUsername();
        String pwd = regParam.getPassword();

        if (name.equals(null) || pwd.equals(null) || name.isEmpty() || pwd.isEmpty()){
            msg.setCode("1");
            msg.setMsg("用户名或密码无效");
        }else {
            msg.setCode("0");
            msg.setMsg("注册成功");
        }

        return msg;
    }
}
