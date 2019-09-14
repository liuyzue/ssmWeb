package com.founder.dao;

import com.founder.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

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
public class EhrHealthEventDaoTest {

    @Autowired
    MsSurgeryInfoDao ehrHealthEventDao;

    @Test
    public void findPersonByEhrid() {

        ArrayList<MsSurgeryInfo> ehrHealthEvents=
                ehrHealthEventDao.selectAllByUploadTime("2019/7/30 0:0:0","2019/7/31 1:0:0");
        for (MsSurgeryInfo e :ehrHealthEvents
                ) {
            System.out.println(e.getPersonId()+'\t'+e.getEhrId());
        }
    }
}