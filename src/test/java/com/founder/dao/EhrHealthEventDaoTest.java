package com.founder.dao;

import com.founder.cron.Relevance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.dao
 * @date:2019/9/13
 * @time:17:26
 */
//配置spring和junit整合，这样junit在启动时就会加载spring容器
@RunWith(SpringJUnit4ClassRunner.class)//固定写法
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:config/springconfig.xml"})//spring与mybatis整合的配置文件
@Commit
public class EhrHealthEventDaoTest {

    @Autowired
    MsSurgeryInfoDao ehrHealthEventDao;

    @Autowired
    Relevance relevance;

    @Test
    public void checkEhrOutpatient() {
        //checkData.checkEhrOutpatient();
    }
}