package com.djweb.action;

import com.djweb.dto.MessageDTO;
import com.djweb.dto.UserInfoDTO;
import com.djweb.service.IUserService;
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
    private MessageDTO message;
    @Autowired
    private UserInfoDTO userinfo;
    @Autowired
    private IUserService iUser;

    /**
     * 获取用户信息
     * @author dengjiang
     *
     */
    @RequestMapping(value = "/userinfo.do", method = RequestMethod.GET)
    public @ResponseBody UserInfoDTO getUserData(HttpSession session){
        String name = (String) session.getAttribute("login");
        if (name == null || name.isEmpty()){
            userinfo.setCode("1");
            userinfo.setNickname("");
        }else if (name.equals("succ")){
            userinfo.setCode("0");

            userinfo.setNickname("云平台");
        }

        return userinfo;
    }

    /**
     *  登录
     * @author dengjiang
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public @ResponseBody MessageDTO login(@RequestBody Map<String, String> param, HttpSession session){

        boolean bflag = false;
        bflag = iUser.login(param);

        if (bflag){
            session.setMaxInactiveInterval(2*60);
            session.setAttribute("login","succ");
            message.setCode("0");
            message.setMsg("登录成功");
        } else{
            message.setCode("1");
            message.setMsg("用户名或密码不正确");
        }
        return message;
    }

    /**
     * 用户注册
     * @author dengjiang
     */
    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public @ResponseBody MessageDTO register(@RequestBody Map<String, String> map){

        boolean bflag = false;
        bflag = iUser.register(map);
        if (bflag){
            message.setCode("0");
            message.setMsg("注册成功");
        }else{
            message.setCode("1");
            message.setMsg("用户名或密码无效");
        }
        return message;
    }

    /**
     * 用户是否登陆
     * @author dengjiang
     */

    public @ResponseBody MessageDTO isLogin(HttpSession session){
        String strLogin = (String)session.getAttribute("login");
        if (strLogin == null || strLogin.isEmpty()) {
            message.setCode("1");
            message.setMsg("未登陆");
        }else {
            message.setCode("0");
            message.setMsg("已登陆");
        }
        return message;
    }
}
