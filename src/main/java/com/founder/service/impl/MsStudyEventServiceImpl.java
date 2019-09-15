package com.founder.service.impl;

import com.founder.dao.MsStudyEventDao;
import com.founder.entity.MsStudyEvent;
import com.founder.service.MsStudyEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:15:03
 */
@Service
public class MsStudyEventServiceImpl implements MsStudyEventService {

    @Autowired
    MsStudyEventDao msStudyEventDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsStudyEvent> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsStudyEvent> msStudyEvents=msStudyEventDao.selectAllByUploadTime(startTime,endTime);
        return msStudyEvents;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsStudyEvent> selectByPeronId(String personId) {
        ArrayList<MsStudyEvent> msStudyEvents=msStudyEventDao.selectByPeronId(personId);
        return msStudyEvents;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsStudyEvent> selectByEhrId(String ehrId) {
        ArrayList<MsStudyEvent> msStudyEvents=msStudyEventDao.selectByEhrId(ehrId);
        return msStudyEvents;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsStudyEvent> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsStudyEvent> msStudyEvents=msStudyEventDao.selectByEhrAndPersonId(ehrId,personId);
        return msStudyEvents;
    }
}
