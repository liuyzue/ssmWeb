package com.founder.service.impl;

import com.founder.dao.MsExamineDetailDao;
import com.founder.entity.MsExamineDetail;
import com.founder.service.MsExamineDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:36
 */
@Service
public class MsExamineDetailServiceImpl implements MsExamineDetailService {

    @Autowired
    MsExamineDetailDao msExamineDetailDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsExamineDetail> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsExamineDetail> msExamineDetails=msExamineDetailDao.selectAllByUploadTime(startTime,endTime);
        return msExamineDetails;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsExamineDetail> selectByPeronId(String personId) {
        ArrayList<MsExamineDetail> msExamineDetails=msExamineDetailDao.selectByPeronId(personId);
        return msExamineDetails;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsExamineDetail> selectByEhrId(String ehrId) {
        ArrayList<MsExamineDetail> msExamineDetails=msExamineDetailDao.selectByEhrId(ehrId);
        return msExamineDetails;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsExamineDetail> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsExamineDetail> msExamineDetails=msExamineDetailDao.selectByEhrAndPersonId(ehrId,personId);
        return msExamineDetails;
    }
}
