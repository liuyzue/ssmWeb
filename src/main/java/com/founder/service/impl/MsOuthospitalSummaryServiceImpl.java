package com.founder.service.impl;

import com.founder.dao.MsOuthospitalSummaryDao;
import com.founder.entity.MsOuthospitalSummary;
import com.founder.service.MsOuthospitalSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:54
 */
@Service
public class MsOuthospitalSummaryServiceImpl implements MsOuthospitalSummaryService {

    @Autowired
    MsOuthospitalSummaryDao msOuthospitalSummaryDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsOuthospitalSummary> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsOuthospitalSummary> msOuthospitalSummaries=msOuthospitalSummaryDao.selectAllByUploadTime(startTime,endTime);
        return msOuthospitalSummaries;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsOuthospitalSummary> selectByPeronId(String personId) {
        ArrayList<MsOuthospitalSummary> msOuthospitalSummaries=msOuthospitalSummaryDao.selectByPeronId(personId);
        return msOuthospitalSummaries;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsOuthospitalSummary> selectByEhrId(String ehrId) {
        ArrayList<MsOuthospitalSummary> msOuthospitalSummaries=msOuthospitalSummaryDao.selectByEhrId(ehrId);
        return msOuthospitalSummaries;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsOuthospitalSummary> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsOuthospitalSummary> msOuthospitalSummaries=msOuthospitalSummaryDao.selectByEhrAndPersonId(ehrId,personId);
        return msOuthospitalSummaries;
    }
}
