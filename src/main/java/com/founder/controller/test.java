package com.founder.controller;

import com.founder.dao.UserDao;
import com.founder.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class test {

    @Autowired
    UserDao userDao;

    @RequestMapping("/test.do")
    public @ResponseBody List<User> test(){

        List<User> userList=userDao.selectAll();

        return userList;

    }
}
