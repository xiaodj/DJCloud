package com.djweb.action;

import com.djweb.dto.MsgDTO;
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
public class UserAction {

    @Autowired
    private MsgDTO msgDTO;
    @Autowired
    private UserInfoDTO userInfoDTO;
    @Autowired
    private IUserService iUser;

    /**
     * 获取用户信息
     * @author dengjiang
     *
     */
    @RequestMapping(value = "/userinfo.do", method = RequestMethod.GET)
    public @ResponseBody UserInfoDTO getUserInfo(HttpSession session){
        String name = (String) session.getAttribute("login");
        if (name == null || name.isEmpty()){
            userInfoDTO.setCode("1");
            userInfoDTO.setUsername("");
        }else {
            userInfoDTO.setCode("0");
            userInfoDTO.setUsername("邓江");
        }

        return userInfoDTO;
    }

    /**
     *  登录
     * @author dengjiang
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public @ResponseBody MsgDTO login(@RequestBody Map<String, String> param, HttpSession session){

        msgDTO = iUser.login(param);
        if (msgDTO.getCode() == "0"){
            session.setMaxInactiveInterval(2*60);
            session.setAttribute("login","succ");
        }
        return msgDTO;
    }

    /**
     * 用户注册
     * @author dengjiang
     */
    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public @ResponseBody MsgDTO register(@RequestBody Map<String, String> map){

        msgDTO = iUser.register(map);
        return msgDTO;
    }

    /**
     * 用户是否登陆
     * @author dengjiang
     */
    @RequestMapping(value = "/islogin.do", method = RequestMethod.GET)
    public @ResponseBody MsgDTO isLogin(HttpSession session){
        String strLogin = (String)session.getAttribute("login");
        if (strLogin == null || strLogin.isEmpty()) {
            msgDTO.setCode("1");
            msgDTO.setMsg("未登陆");
        }else {
            msgDTO.setCode("0");
            msgDTO.setMsg("已登陆");
        }
        return msgDTO;
    }

    /**
     * 退出登录
     * @author dengjiang
     */
    @RequestMapping(value = "/outlogin.do", method = RequestMethod.POST)
    public @ResponseBody MsgDTO outLogin(HttpSession session) {
        String strLogin = (String)session.getAttribute("login");
        if (strLogin == null || strLogin.isEmpty()) {
            msgDTO.setCode("1");
            msgDTO.setMsg("未登陆");
        }else {
            session.invalidate();
            msgDTO.setCode("0");
            msgDTO.setMsg("已退出登陆");
        }
        return msgDTO;
    }
}
