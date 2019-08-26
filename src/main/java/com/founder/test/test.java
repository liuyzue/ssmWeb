package com.founder.test;

import com.founder.entity.User;
import com.founder.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){

        ApplicationContext ac=new ClassPathXmlApplicationContext("config/springconfig.xml");

        TestService ts = (TestService) ac.getBean("testServiceImpl");



    }
}
