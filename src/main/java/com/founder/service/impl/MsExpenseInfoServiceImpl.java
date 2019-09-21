package com.founder.service.impl;

import com.founder.dao.MsExpenseInfoDao;
import com.founder.entity.CheckUnit;
import com.founder.entity.ErrorInfo;
import com.founder.entity.MsExpenseInfo;
import com.founder.service.MsExpenseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:48
 */
@Service
public class MsExpenseInfoServiceImpl implements MsExpenseInfoService {

    @Autowired
    MsExpenseInfoDao msExpenseInfoDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsExpenseInfo> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsExpenseInfo> msExpenseInfos=msExpenseInfoDao.selectAllByUploadTime(startTime,endTime);
        return msExpenseInfos;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsExpenseInfo> selectByPeronId(String personId) {
        ArrayList<MsExpenseInfo> msExpenseInfos=msExpenseInfoDao.selectByPeronId(personId);
        return msExpenseInfos;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsExpenseInfo> selectByEhrId(String ehrId) {
        ArrayList<MsExpenseInfo> msExpenseInfos=msExpenseInfoDao.selectByEhrId(ehrId);
        return msExpenseInfos;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsExpenseInfo> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsExpenseInfo> msExpenseInfos=msExpenseInfoDao.selectByEhrAndPersonId(ehrId,personId);
        return msExpenseInfos;
    }

    /**
     * 校验 费用详细
     *
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> msExpenseCheckExpenseDetail() {
        return msExpenseInfoDao.msExpenseCheckExpenseDetail();
    }
}
