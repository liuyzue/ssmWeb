package com.founder.cron;

import com.founder.cron.datacheck.relevance.RelevanceCheck;
import com.founder.entity.ErrorInfo;
import com.founder.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.cron
 * @date:2019/9/17
 * @time:15:14
 */
@Component
public class Relevance {

    @Autowired
    private ErrorInfoService errorInfoService;
    @Autowired
    private RelevanceCheck relevanceCheck;
    @Autowired
    private EhrHealthEventService ehrHealthEventService;
    @Autowired
    private MsExamineEventService msExamineEventService;
    @Autowired
    private MsExpenseInfoService msExpenseInfoService;
    @Autowired
    private MsInpatientInfoService msInpatientInfoService;
    @Autowired
    private MsOutpatientInfoService msOutpatientInfoService;

    @Scheduled(cron = "0 0 23 * * ? *")
    public void checkAll(){
        errorInfoService.truncateErrorInfo();
        relevanceCheck.updateErrorInfo(ehrHealthEventService.ehrCheckMsInpatient());
        relevanceCheck.updateErrorInfo(ehrHealthEventService.ehrCheckMsOutpatient());
        relevanceCheck.updateErrorInfo(msExamineEventService.msExamineCheckExamineDetail());
        relevanceCheck.updateErrorInfo(msExpenseInfoService.msExpenseCheckExpenseDetail());
        relevanceCheck.updateErrorInfo(msInpatientInfoService.msInpatientCheckMsDiseaseDia());
        relevanceCheck.updateErrorInfo(msInpatientInfoService.msInpatientCheckMsDoctorAdv());
        relevanceCheck.updateErrorInfo(msInpatientInfoService.msInpatientCheckMsExpenseInfo());
        relevanceCheck.updateErrorInfo(msInpatientInfoService.msInpatientCheckMsInpatientMedical());
        relevanceCheck.updateErrorInfo(msInpatientInfoService.msInpatientCheckMsOutHospitalSum());
        relevanceCheck.updateErrorInfo(msInpatientInfoService.msInpatientCheckMsStudy());
        relevanceCheck.updateErrorInfo(msInpatientInfoService.msInpatientCheckMsExamineInfo());
        relevanceCheck.updateErrorInfo(msOutpatientInfoService.msOutpatientCheckMsDiseaseDia());
        relevanceCheck.updateErrorInfo(msOutpatientInfoService.msOutpatientCheckMsDrug());
        relevanceCheck.updateErrorInfo(msOutpatientInfoService.msOutpatientCheckMsExamine());
        relevanceCheck.updateErrorInfo(msOutpatientInfoService.msOutpatientCheckMsExpInfo());
        relevanceCheck.updateErrorInfo(msOutpatientInfoService.msOutpatientCheckMsOutpatientPres());
        relevanceCheck.updateErrorInfo(msOutpatientInfoService.msOutpatientCheckMsRegister());
        relevanceCheck.updateErrorInfo(msOutpatientInfoService.msOutpatientCheckMsStudy());
    }

    void checkOne(List<ErrorInfo> list){
        relevanceCheck.updateErrorInfo(list);
    }


    
}
