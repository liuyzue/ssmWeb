package com.founder.service.impl;

import com.founder.dao.MsRegisterRecordDao;
import com.founder.entity.MsRegisterRecord;
import com.founder.service.MsRegisterRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:15:00
 */
@Service
public class MsRegisterRecordServiceImpl implements MsRegisterRecordService {

    @Autowired
    MsRegisterRecordDao msRegisterRecordDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsRegisterRecord> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsRegisterRecord> msRegisterRecords=msRegisterRecordDao.selectAllByUploadTime(startTime,endTime);
        return msRegisterRecords;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsRegisterRecord> selectByPeronId(String personId) {
        ArrayList<MsRegisterRecord> msRegisterRecords=msRegisterRecordDao.selectByPeronId(personId);
        return msRegisterRecords;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsRegisterRecord> selectByEhrId(String ehrId) {
        ArrayList<MsRegisterRecord> msRegisterRecords=msRegisterRecordDao.selectByEhrId(ehrId);
        return msRegisterRecords;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsRegisterRecord> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsRegisterRecord> msRegisterRecords=msRegisterRecordDao.selectByEhrAndPersonId(ehrId,personId);
        return msRegisterRecords;
    }
}
