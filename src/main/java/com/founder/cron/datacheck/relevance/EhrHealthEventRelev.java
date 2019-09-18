package com.founder.cron.datacheck.relevance;

import com.founder.entity.EhrHealthEvent;
import com.founder.entity.ErrorInfo;
import com.founder.service.EhrHealthEventService;
import com.founder.service.ErrorInfoService;
import com.founder.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.cron.datacheck.relevance
 * @date:2019/9/17
 * @time:15:33
 */
@Component
public class EhrHealthEventRelev {

    @Autowired
    EhrHealthEventService healthEventService;
    @Autowired
    ErrorInfoService errorInfoService;

    /**
     * 校验某一天的门诊记录，默认当前日期的前一天
     * @param checkDate
     */
    public void checkOutpatient(Date checkDate){
        List<EhrHealthEvent> list=healthEventService.selectAllByUploadTime(DateUtil.lastDay(checkDate),DateUtil.toDay(checkDate));
        for (EhrHealthEvent e:list
             ) {
            if (!healthEventService.isExistsInOutPatientInfo(e.getEhrId())){
                errorInfoService.addErrorInfo(initErrorInfo(e));
            }
        }
    }
    /**
     * 校验某一天的门诊记录，默认当前日期的前一段时间
     * @param checkDate
     */
    public void checkOutpatient(Date checkDate,Integer plus){
        List<EhrHealthEvent> list=healthEventService.selectAllByUploadTime(DateUtil.lastDay(checkDate,plus),DateUtil.lastDay(checkDate));
        for (EhrHealthEvent e:list
        ) {
            if (!healthEventService.isExistsInOutPatientInfo(e.getEhrId())){
                errorInfoService.addErrorInfo(initErrorInfo(e));
            }
        }
    }

    /**
     * 初始化错误信息
     * @param e
     * @return
     */
    public ErrorInfo initErrorInfo(EhrHealthEvent e){
        ErrorInfo errorInfo=new ErrorInfo();
        errorInfo.setEhrId(e.getEhrId());
        errorInfo.setPersonId(e.getPersonId());
        errorInfo.setResultType("1");
        errorInfo.setUploadDate(e.getGatherDate());
        errorInfo.setCheckDate(new Date());
        errorInfo.setSqlText("select * from ms_outpatient_info where ehr_id='"+e.getEhrId()+"';");
        errorInfo.setTableName(e.getClass().getName());
        return errorInfo;
    }

}
