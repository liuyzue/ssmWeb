package com.founder.service.impl;

import com.founder.dao.MsSurgeryInfoDao;
import com.founder.entity.MsSurgeryInfo;
import com.founder.service.MsSurgeryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:15:04
 */
@Service
public class MsSurgeryInfoServiceImpl implements MsSurgeryInfoService {

    @Autowired
    MsSurgeryInfoDao msSurgeryInfoDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsSurgeryInfo> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsSurgeryInfo> msSurgeryInfos=msSurgeryInfoDao.selectAllByUploadTime(startTime,endTime);
        return msSurgeryInfos;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsSurgeryInfo> selectByPeronId(String personId) {
        ArrayList<MsSurgeryInfo> msSurgeryInfos=msSurgeryInfoDao.selectByPeronId(personId);
        return msSurgeryInfos;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsSurgeryInfo> selectByEhrId(String ehrId) {
        ArrayList<MsSurgeryInfo> msSurgeryInfos=msSurgeryInfoDao.selectByEhrId(ehrId);
        return msSurgeryInfos;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsSurgeryInfo> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsSurgeryInfo> msSurgeryInfos=msSurgeryInfoDao.selectByEhrAndPersonId(ehrId,personId);
        return msSurgeryInfos;
    }
}
