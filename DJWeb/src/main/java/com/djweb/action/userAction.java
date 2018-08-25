package com.djweb.action;

import com.djweb.entity.msgEntity;
import com.djweb.entity.userDataEntity;
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
    private msgEntity msg;
    @Autowired
    private userDataEntity userData;
    @Autowired
    private IUserService iUser;

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
    public @ResponseBody msgEntity login(@RequestBody Map<String, String> param, HttpSession session){

        boolean bflag = false;
        bflag = iUser.login(param);

        if (bflag){
            session.setMaxInactiveInterval(2*60);
            session.setAttribute("login","succ");
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
    public @ResponseBody msgEntity register(@RequestBody Map<String, String> map){

        boolean bflag = false;
        bflag = iUser.register(map);
        if (bflag){
            msg.setCode("0");
            msg.setMsg("注册成功");
        }else{
            msg.setCode("1");
            msg.setMsg("用户名或密码无效");
        }
        return msg;
    }

    /**
     * 用户是否登陆
     * @author dengjiang
     */

    public @ResponseBody msgEntity isLogin(HttpSession session){
        String strLogin = (String)session.getAttribute("login");
        if (strLogin == null || strLogin.isEmpty()) {
            msg.setCode("1");
            msg.setMsg("未登陆");
        }else {
            msg.setCode("0");
            msg.setMsg("已登陆");
        }
        return msg;
    }
}
