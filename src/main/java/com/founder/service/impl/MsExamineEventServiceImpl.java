package com.founder.service.impl;

import com.founder.dao.MsExamineEventDao;
import com.founder.entity.CheckUnit;
import com.founder.entity.ErrorInfo;
import com.founder.entity.MsExamineEvent;
import com.founder.service.MsExamineEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:39
 */
@Service
public class MsExamineEventServiceImpl implements MsExamineEventService {
    @Autowired
    MsExamineEventDao msExamineEventDao;
    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsExamineEvent> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsExamineEvent> msExamineEvents=msExamineEventDao.selectAllByUploadTime(startTime,endTime);
        return msExamineEvents;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsExamineEvent> selectByPeronId(String personId) {
        ArrayList<MsExamineEvent> msExamineEvents=msExamineEventDao.selectByPeronId(personId);
        return msExamineEvents;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsExamineEvent> selectByEhrId(String ehrId) {
        ArrayList<MsExamineEvent> msExamineEvents=msExamineEventDao.selectByEhrId(ehrId);
        return msExamineEvents;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsExamineEvent> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsExamineEvent> msExamineEvents=msExamineEventDao.selectByEhrAndPersonId(ehrId,personId);
        return msExamineEvents;
    }

    /**
     * 校验 检验明细
     *
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> msExamineCheckExamineDetail() {
        return msExamineEventDao.msExamineCheckExamineDetail();
    }
}
