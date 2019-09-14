package com.founder.service;

import com.founder.entity.EhrHealthEvent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/13
 * @time:16:27
 */

public interface EhrHealthEventService {

    /**
     *  根据person_id查询索引表记录
     * @param
     * @return
     */
    Integer printRecord();

}
