package com.founder.service.impl;

import com.founder.dao.MsOutpatientPrescriptionDao;
import com.founder.entity.MsOutpatientPrescription;
import com.founder.service.MsOutpatientPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:59
 */
@Service
public class MsOutpatientPrescriptionServiceImpl implements MsOutpatientPrescriptionService {

    @Autowired
    MsOutpatientPrescriptionDao msOutpatientPrescriptionDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsOutpatientPrescription> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsOutpatientPrescription> msOutpatientPrescriptions=msOutpatientPrescriptionDao.selectAllByUploadTime(startTime,endTime);
        return msOutpatientPrescriptions;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsOutpatientPrescription> selectByPeronId(String personId) {
        ArrayList<MsOutpatientPrescription> msOutpatientPrescriptions=msOutpatientPrescriptionDao.selectByPeronId(personId);
        return msOutpatientPrescriptions;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsOutpatientPrescription> selectByEhrId(String ehrId) {
        ArrayList<MsOutpatientPrescription> msOutpatientPrescriptions=msOutpatientPrescriptionDao.selectByEhrId(ehrId);
        return msOutpatientPrescriptions;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsOutpatientPrescription> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsOutpatientPrescription> msOutpatientPrescriptions=msOutpatientPrescriptionDao.selectByEhrAndPersonId(ehrId,personId);
        return msOutpatientPrescriptions;
    }
}
