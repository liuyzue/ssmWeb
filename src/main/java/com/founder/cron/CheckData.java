package com.founder.cron;

import com.founder.cron.datacheck.relevance.EhrHealthEventRelev;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.cron
 * @date:2019/9/17
 * @time:15:14
 */
@Component
public class CheckData{
    @Autowired
    private EhrHealthEventRelev ehrHealthEventRelev;

    public void checkEhrOutpatient(){
        ehrHealthEventRelev.checkOutpatient(new Date(),-360);
    }

}
