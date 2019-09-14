package com.founder.service.impl;

import com.founder.dao.EhrHealthEventDao;
import com.founder.entity.EhrHealthEvent;
import com.founder.service.EhrHealthEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/13
 * @time:16:31
 */
@Service
public class EhrHealthEventServiceImpl implements EhrHealthEventService {

    @Autowired
    EhrHealthEventDao ehrHealthEventDao;


    /**
     * 根据person_id查询索引表记录
     *
     * @return
     */
    @Override
    public Integer printRecord() {
        Integer personId=1;
        //Integer personId=2456723;
        //ArrayList<EhrHealthEvent> ehrHealthEvents=ehrHealthEventDao.findByPersonid(personId);
        //personId=ehrHealthEventDao.selectByEhrId("127");
        return personId;

    }


}
