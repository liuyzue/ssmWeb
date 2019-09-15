package com.founder.service.impl;

import com.founder.dao.MsDoctorAdviceDao;
import com.founder.entity.MsDoctorAdvice;
import com.founder.service.MsDoctorAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:28
 */
@Service
public class MsDoctorAdviceServiceImpl implements MsDoctorAdviceService {

    @Autowired
    MsDoctorAdviceDao msDoctorAdviceDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsDoctorAdvice> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsDoctorAdvice> msDoctorAdvices=msDoctorAdviceDao.selectAllByUploadTime(startTime,endTime);
        return msDoctorAdvices;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsDoctorAdvice> selectByPeronId(String personId) {
        ArrayList<MsDoctorAdvice> msDoctorAdvices=msDoctorAdviceDao.selectByPeronId(personId);
        return msDoctorAdvices;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsDoctorAdvice> selectByEhrId(String ehrId) {
        ArrayList<MsDoctorAdvice> msDoctorAdvices=msDoctorAdviceDao.selectByEhrId(ehrId);
        return msDoctorAdvices;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsDoctorAdvice> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsDoctorAdvice> msDoctorAdvices=msDoctorAdviceDao.selectByEhrAndPersonId(ehrId,personId);
        return msDoctorAdvices;
    }
}
