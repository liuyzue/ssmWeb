package com.founder.controller;

import com.founder.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.controller
 * @date:2019/8/27
 * @time:16:47
 */

@Controller
@RequestMapping("/login")
public class LoginController {
    private static final Logger logger= LogManager.getLogger(LoginController.class.getName());

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String login(){
        return "login";
    }

    @RequestMapping("/home")
    public String home(){
        return "base";
    }

    @RequestMapping("/login")
    public ModelAndView Login(String username, String password){

        if (checkPassword(username,password)) {
                ModelAndView model = new ModelAndView("base");
                model.addObject("username",username);
                return model;
        }else {
            return new ModelAndView("redirect:/login");
        }
    }


    public boolean checkPassword(String username,String password){
        if (username == null) {
            return false;
        }else {
            if (userService.findPasswordByUsername(username).equals(password) && password != null)
            { return true;}
            else {
                return false;
            }
        }
    }

}
