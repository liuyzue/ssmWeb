package com.founder.service.impl;

import com.founder.dao.MsInpatientInfoDao;
import com.founder.entity.MsInpatientInfo;
import com.founder.service.MsInpatientInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:50
 */
@Service
public class MsInpatientInfoServiceImpl implements MsInpatientInfoService {

    @Autowired
    MsInpatientInfoDao msInpatientInfoDao;
    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsInpatientInfo> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsInpatientInfo> msInpatientInfos=msInpatientInfoDao.selectAllByUploadTime(startTime,endTime);
        return msInpatientInfos;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsInpatientInfo> selectByPeronId(String personId) {
        ArrayList<MsInpatientInfo> msInpatientInfos=msInpatientInfoDao.selectByPeronId(personId);
        return msInpatientInfos;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsInpatientInfo> selectByEhrId(String ehrId) {
        ArrayList<MsInpatientInfo> msInpatientInfos=msInpatientInfoDao.selectByEhrId(ehrId);
        return msInpatientInfos;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsInpatientInfo> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsInpatientInfo> msInpatientInfos=msInpatientInfoDao.selectByEhrAndPersonId(ehrId,personId);
        return msInpatientInfos;
    }
}
