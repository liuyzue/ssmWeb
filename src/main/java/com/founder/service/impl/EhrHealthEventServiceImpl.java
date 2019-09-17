package com.founder.service.impl;

import com.founder.dao.EhrHealthEventDao;
import com.founder.dao.MsInpatientInfoDao;
import com.founder.dao.MsOutpatientInfoDao;
import com.founder.entity.EhrHealthEvent;
import com.founder.entity.MsOutpatientInfo;
import com.founder.service.EhrHealthEventService;
import com.founder.service.ErrorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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
    @Autowired
    MsOutpatientInfoDao msOutpatientInfoDao;
    @Autowired
    MsInpatientInfoDao msInpatientInfoDao;
    @Autowired
    ErrorInfoService errorInfoService;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<EhrHealthEvent> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<EhrHealthEvent> ehrHealthEvents=ehrHealthEventDao.selectAllByUploadTime(startTime,endTime);
        return ehrHealthEvents;
    }

    /**
     * 根据ehr_type查询记录
     * @param ehrType
     * @return
     */
    @Override
    public ArrayList<EhrHealthEvent> selectAllByEhrType(String ehrType) {
        ArrayList<EhrHealthEvent> ehrHealthEvents=ehrHealthEventDao.selectAllByEhrType(ehrType);
        return ehrHealthEvents;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<EhrHealthEvent> selectByPeronId(String personId) {
        ArrayList<EhrHealthEvent> ehrHealthEvents=ehrHealthEventDao.selectByPeronId(personId);
        return ehrHealthEvents;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<EhrHealthEvent> selectByEhrId(String ehrId) {
        ArrayList<EhrHealthEvent> ehrHealthEvents=ehrHealthEventDao.selectByEhrId(ehrId);
        return ehrHealthEvents;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<EhrHealthEvent> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<EhrHealthEvent> ehrHealthEvents=ehrHealthEventDao.selectByEhrAndPersonId(ehrId,personId);
        return ehrHealthEvents;
    }

    /**
     * 事件表的记录是否在门诊记录表中
     *
     * @param ehrId
     * @return
     */
    @Override
    public boolean isExistsInOutPatientInfo(String ehrId) {
        if (!ObjectUtils.isEmpty(msOutpatientInfoDao.selectByEhrId(ehrId))){
            return true;
        }
        return false;
    }

    @Override
    public boolean isExistsInInPatientInfo(String ehrId) {
        if (!ObjectUtils.isEmpty(msInpatientInfoDao.selectByEhrId(ehrId))){
            return true;
        }
        return false;
    }

}
