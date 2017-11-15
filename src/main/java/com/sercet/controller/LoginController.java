package com.sercet.controller;

import com.sercet.service.LoginService;
import com.sercet.common.base.BaseController;
import com.sercet.vo.PBUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by john on 2017/11/11.
 */
@Controller
public class LoginController extends BaseController{
    @Autowired
    LoginService loginService;

    @RequestMapping("login")
    public ModelAndView login(PBUser pbUser){
        ModelAndView mv = new ModelAndView();
        String message = loginService.login(pbUser);
        if (message.equals("ok")){
            mv.setViewName("index");
            this.session.setAttribute("user",pbUser);

            return mv;
        }
        mv.setViewName("login");
        mv.addObject("message",message);
        return mv;
    }
    @RequestMapping("/")
    public String welcome(){
        return "login";
    }

    @RequestMapping("logout")
    public String logout(){
        this.session.invalidate();
        return "login";
    }
}
