package com.founder.service.impl;

import com.founder.dao.MsOutpatientInfoDao;
import com.founder.entity.MsOutpatientInfo;
import com.founder.service.MsOutpatientInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:57
 */
@Service
public class MsOutpatientInfoServiceImpl implements MsOutpatientInfoService {

    @Autowired
    MsOutpatientInfoDao msOutpatientInfoDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsOutpatientInfo> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsOutpatientInfo> msOutpatientInfos=msOutpatientInfoDao.selectAllByUploadTime(startTime,endTime);
        return msOutpatientInfos;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsOutpatientInfo> selectByPeronId(String personId) {
        ArrayList<MsOutpatientInfo> msOutpatientInfos=msOutpatientInfoDao.selectByPeronId(personId);
        return msOutpatientInfos;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsOutpatientInfo> selectByEhrId(String ehrId) {
        ArrayList<MsOutpatientInfo> msOutpatientInfos=msOutpatientInfoDao.selectByEhrId(ehrId);
        return msOutpatientInfos;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsOutpatientInfo> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsOutpatientInfo> msOutpatientInfos=msOutpatientInfoDao.selectByEhrAndPersonId(ehrId,personId);
        return msOutpatientInfos;
    }
}
