package com.founder.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author liuyuze
 */
public class mainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-mybatis.xml");
        Cron sh= (Cron) context.getBean("TimedTask");

        sh.cron();

    }
}
