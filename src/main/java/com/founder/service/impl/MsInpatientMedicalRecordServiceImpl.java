package com.founder.service.impl;

import com.founder.dao.MsInpatientMedicalRecordDao;
import com.founder.entity.MsInpatientMedicalRecord;
import com.founder.service.MsInpatientMedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:52
 */
@Service
public class MsInpatientMedicalRecordServiceImpl implements MsInpatientMedicalRecordService {

    @Autowired
    MsInpatientMedicalRecordDao msInpatientMedicalRecordDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsInpatientMedicalRecord> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsInpatientMedicalRecord> msInpatientMedicalRecords=msInpatientMedicalRecordDao.selectAllByUploadTime(startTime,endTime);
        return msInpatientMedicalRecords;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsInpatientMedicalRecord> selectByPeronId(String personId) {
        ArrayList<MsInpatientMedicalRecord> msInpatientMedicalRecords=msInpatientMedicalRecordDao.selectByPeronId(personId);
        return msInpatientMedicalRecords;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsInpatientMedicalRecord> selectByEhrId(String ehrId) {
        ArrayList<MsInpatientMedicalRecord> msInpatientMedicalRecords=msInpatientMedicalRecordDao.selectByEhrId(ehrId);
        return msInpatientMedicalRecords;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsInpatientMedicalRecord> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsInpatientMedicalRecord> msInpatientMedicalRecords=msInpatientMedicalRecordDao.selectByEhrAndPersonId(ehrId,personId);
        return msInpatientMedicalRecords;
    }
}
