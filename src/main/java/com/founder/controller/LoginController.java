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
public class LoginController {
    private static final Logger logger= LogManager.getLogger(LoginController.class.getName());

    @Autowired
    UserService userService;

    @RequestMapping("/doLogin")
    public String login(){
        return "login";
    }
    @RequestMapping("")
    public String login1(){
        return "login";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @RequestMapping("/check")
    public ModelAndView check(String username, String password){
        logger.info("check");

        if (userService.findPasswordByUsername(username) == null) {
            return new ModelAndView("redirect:/doLogin");
        }else {
            if (userService.findPasswordByUsername(username).equals(password)) {
                ModelAndView model = new ModelAndView("index");
                model.addObject("username",username);
                return model;
            } else {
                return new ModelAndView("redirect:/doLogin");
            }
        }
    }



}