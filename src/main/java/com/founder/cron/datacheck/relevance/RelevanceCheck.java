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
//            System.out.println("initAddList  "+list.get(0).getBaseTableName()+"  start  "+DateUtil.toDay(new Date()));
//            ArrayList<ErrorInfo> addList = initAddList(list);
//            System.out.println("initAddList  "+list.get(0).getBaseTableName()+"  start  "+DateUtil.toDay(new Date()));
            System.out.println("toStepAdd  "+list.get(0).getTableName()+"  start  "+DateUtil.toDay(new Date()));
//            toStepAdd(addList);
            toStepAdd(list);
            System.out.println("toStepAdd  "+list.get(0).getTableName()+"  end  "+DateUtil.toDay(new Date()));
            System.out.println(list.get(0).getTableName() + " : "  + list.size());
        }else{
            System.out.println("list is null");
        }
    }

    /**
     * 初始化需要添加到错误表的记录，过滤列错误表中已经存在的记录
     * @param list
     * @return
     */
    private ArrayList<ErrorInfo> initAddList(List<ErrorInfo> list) {
        ArrayList<ErrorInfo> addList = new ArrayList<>();
        ArrayList<ErrorInfo> existsList = errorInfoDao.selectAll();
        /*for (CheckUnit t : list
        ) {
            addList.add(initErrorInfo(t));
        }*/
        /*if (!ObjectUtils.isEmpty(existsList)) {
            for (CheckUnit t : list
            ) {
                boolean isExist=false;
                    for (ErrorInfo e : existsList
                    ) {
                        if ("1".equals(e.getResultType())&&e.getEhrId().equals(t.getEhrId())) {
                            isExist=true;
                            break;
                        }
                    }
                    if (!isExist){
                        addList.add(initErrorInfo(t));
                }
            }
        }else{
            for (CheckUnit t : list
            ) {
                addList.add(initErrorInfo(t));
            }
        }*/
        return addList;
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

    /**
     * 初始化错误对象
     * @param t
     * @return
     */
    private ErrorInfo initErrorInfo(CheckUnit t){
        ErrorInfo errorInfo=new ErrorInfo();
        errorInfo.setEhrId(t.getEhrId());
        errorInfo.setPersonId(t.getPersonId());
        errorInfo.setResultType("1");
        errorInfo.setUploadDate(t.getGatherDate());
        errorInfo.setCheckDate(new Date());
        errorInfo.setSqlText("select * from "+ t.getTargetTableName()+" where ehr_id='"+t.getEhrId()+"';");
        errorInfo.setTableName(t.getTargetTableName());
        return errorInfo;
    }

    private ArrayList<ErrorInfo> errorInfos() {
        ArrayList<ErrorInfo> a = new ArrayList<>();
        ErrorInfo b = new ErrorInfo();
        b.setTableName("123132");
        a.add(b);
        return a;
    }

}
