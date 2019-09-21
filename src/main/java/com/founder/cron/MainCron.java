package com.founder.cron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.cron.datacheck
 * @date:2019/9/19
 * @time:10:30
 */
@Component
public class MainCron {
    @Autowired
    Relevance relevance;

    /**
     * 每天23点执行一次：0 0 23 * * ?
     */
    //@Scheduled(cron = "0 0 23 * * ?")
    public void cronCheck(){
        relevance.checkAll();
    }
}
