package com.founder.service.impl;

import com.founder.dao.MsDrugUsageDao;
import com.founder.entity.MsDrugUsage;
import com.founder.service.MsDrugUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:33
 */
@Service
public class MsDrugUsageServiceImpl implements MsDrugUsageService{

    @Autowired
    MsDrugUsageDao msDrugUsageDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsDrugUsage> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsDrugUsage> msDrugUsages=msDrugUsageDao.selectAllByUploadTime(startTime,endTime);
        return msDrugUsages;

    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsDrugUsage> selectByPeronId(String personId) {
        ArrayList<MsDrugUsage> msDrugUsages=msDrugUsageDao.selectByPeronId(personId);
        return msDrugUsages;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsDrugUsage> selectByEhrId(String ehrId) {
        ArrayList<MsDrugUsage> msDrugUsages=msDrugUsageDao.selectByEhrId(ehrId);
        return msDrugUsages;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsDrugUsage> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsDrugUsage> msDrugUsages=msDrugUsageDao.selectByEhrAndPersonId(ehrId,personId);
        return msDrugUsages;
    }
}
