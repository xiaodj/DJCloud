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
     * 用户注册接口
     * @author dengjiang
     */
    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    public @ResponseBody MsgDTO register(@RequestBody Map<String, String> map){
        msgDTO = iUser.register(map);
        return msgDTO;
    }

    /**
     *  用户登录接口
     * @author dengjiang
     */
    @RequestMapping(value = "//login", method = RequestMethod.POST)
    public @ResponseBody MsgDTO login(@RequestBody Map<String, String> param, HttpSession session){

        msgDTO = iUser.login(param, session);
        return msgDTO;
    }

    /**
     * 获取用户信息
     * @author dengjiang
     *
     */
    @RequestMapping(value = "/userinfo", method = RequestMethod.GET)
    public @ResponseBody UserInfoDTO getUserInfo(HttpSession session){
        String login = (String)session.getAttribute("login");
        if (login == null || login.isEmpty() || !login.equals("yes")) {
            userInfoDTO.setCode(1);
            userInfoDTO.setUsername("");
        } else {
            String uid = (String)session.getAttribute("uid");
            //用户ID
            userInfoDTO = iUser.getUserInfo(uid);
        }

        return userInfoDTO;
    }




    /**
     * 用户是否登陆
     * @author dengjiang
     */
    @RequestMapping(value = "/islogin", method = RequestMethod.GET)
    public @ResponseBody MsgDTO isLogin(HttpSession session){
        String login = (String)session.getAttribute("login");
        if (login.equals(null) || login.isEmpty() || login.equals("yes")) {
            msgDTO.setCode(1);
        }else {
            msgDTO.setCode(0);
        }
        return msgDTO;
    }

    /**
     * 退出登录
     * @author dengjiang
     */
    @RequestMapping(value = "/outlogin", method = RequestMethod.POST)
    public @ResponseBody MsgDTO outLogin(HttpSession session) {
        String login = (String)session.getAttribute("login");
        if (login.equals(null) || login.isEmpty() || login.equals("yes")) {
            msgDTO.setCode(1);
        }else {
            session.invalidate();
            msgDTO.setCode(0);
        }user
        return msgDTO;
    }
}
