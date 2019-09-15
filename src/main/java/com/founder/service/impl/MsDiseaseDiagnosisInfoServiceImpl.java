package com.founder.service.impl;

import com.founder.dao.MsDiseaseDiagnosisInfoDao;
import com.founder.entity.MsDiseaseDiagnosisInfo;
import com.founder.service.MsDiseaseDiagnosisInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:18
 */
@Service
public class MsDiseaseDiagnosisInfoServiceImpl implements MsDiseaseDiagnosisInfoService {

    @Autowired
    MsDiseaseDiagnosisInfoDao msDiseaseDiagnosisInfoDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsDiseaseDiagnosisInfo> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsDiseaseDiagnosisInfo> msDiseaseDiagnosisInfos= msDiseaseDiagnosisInfoDao.selectAllByUploadTime(startTime,endTime);
        return msDiseaseDiagnosisInfos;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsDiseaseDiagnosisInfo> selectByPeronId(String personId) {
        ArrayList<MsDiseaseDiagnosisInfo> msDiseaseDiagnosisInfos=msDiseaseDiagnosisInfoDao.selectByPeronId(personId);
        return msDiseaseDiagnosisInfos;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsDiseaseDiagnosisInfo> selectByEhrId(String ehrId) {
        ArrayList<MsDiseaseDiagnosisInfo> msDiseaseDiagnosisInfos=msDiseaseDiagnosisInfoDao.selectByEhrId(ehrId);
        return msDiseaseDiagnosisInfos;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsDiseaseDiagnosisInfo> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsDiseaseDiagnosisInfo> msDiseaseDiagnosisInfos=msDiseaseDiagnosisInfoDao.selectByEhrAndPersonId(ehrId,personId);
        return msDiseaseDiagnosisInfos;
    }
}
