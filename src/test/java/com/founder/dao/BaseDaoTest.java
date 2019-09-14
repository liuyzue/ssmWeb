package com.founder.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.dao
 * @date:2019/9/14
 * @time:10:26
 */
//使用Spring-test提供的单元测试类作为启动参数
@RunWith(SpringJUnit4ClassRunner.class)//固定写法
//给junit配置运行时所需的spring配置文件
@ContextConfiguration({"classpath:config/springconfig.xml"})
public class BaseDaoTest {

    @Test
    public void test1() {
    }
}