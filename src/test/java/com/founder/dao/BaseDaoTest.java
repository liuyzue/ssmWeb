package com.founder.dao;

import com.founder.cron.Relevance;
import com.founder.entity.EhrHealthEvent;
import com.founder.service.ErrorInfoService;
import com.founder.service.MsExamineEventService;
import com.founder.service.MsOutpatientInfoService;
import com.founder.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

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
@Commit
public class BaseDaoTest {

//    @Autowired
//    Relevance relevance;

    @Autowired
    ErrorInfoService errorInfoService;

//    @Autowired
//    EhrHealthEventDao ehrHealthEventDao;
//
//    @Autowired
//    MsExamineEventService msExamineEventService;
//
//    @Autowired
//    MsOutpatientInfoService msOutpatientInfoService;

    @Test
    public void test1() {
        System.out.println(DateUtil.toDay(new Date()));
        //relevance.checkAll();
       // List list=msOutpatientInfoService.msOutpatientCheckMsExamine();   ///2000   4m 34s  216w
        System.out.println(errorInfoService.selectAll().size());
        System.out.println(DateUtil.toDay(new Date()));
    }
}