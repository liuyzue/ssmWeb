package com.founder.cron.datacheck.relevance;

import com.founder.dao.*;
import com.founder.entity.*;
import com.founder.service.EhrHealthEventService;
import com.founder.service.ErrorInfoService;
import com.founder.util.DateUtil;
import com.founder.util.TableNameMapper;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.cron.datacheck.relevance
 * @date:2019/9/17
 * @time:15:33
 */
@Component
public class RelevanceCheck {

    private static final int COMMIT_NUM=2000;

    @Autowired
    ErrorInfoDao errorInfoDao;

    public void updateErrorInfo(List<ErrorInfo> list){
        if (!ObjectUtils.isEmpty(list)) {
            System.out.println("toStepAdd  "+list.get(0).getTableName()+"  start  "+DateUtil.toDay(new Date()));
            toStepAdd(list);
            System.out.println("toStepAdd  "+list.get(0).getTableName()+"  end  "+DateUtil.toDay(new Date()));
            System.out.println(list.get(0).getTableName() + " : "  + list.size());
        }else{
            System.out.println("list is null");
        }
    }

    /**
     * 分步插入数据 每2000条插入一次
     * @param addList
     */
    private void toStepAdd(List<ErrorInfo> addList) {
        if (!ObjectUtils.isEmpty(addList)) {
            if (addList.size()<COMMIT_NUM) {
                errorInfoDao.addErrorInfo(addList);
            }else {
                int times=addList.size()/COMMIT_NUM;
                for (int i=0;i<times+1;i++){
                    errorInfoDao.addErrorInfo(addList.subList(i*COMMIT_NUM,Math.min((i+1)*COMMIT_NUM,addList.size())));
                }
            }
        }
    }

}
