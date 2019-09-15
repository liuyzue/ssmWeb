package com.founder.service.impl;

import com.founder.dao.MsExpenseDetailDao;
import com.founder.entity.MsExpenseDetail;
import com.founder.service.MsExpenseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/15
 * @time:14:44
 */
@Service
public class MsExpenseDetailServiceImpl implements MsExpenseDetailService {

    @Autowired
    MsExpenseDetailDao msExpenseDetailDao;

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    public ArrayList<MsExpenseDetail> selectAllByUploadTime(String startTime, String endTime) {
        ArrayList<MsExpenseDetail> msExpenseDetails=msExpenseDetailDao.selectAllByUploadTime(startTime,endTime);
        return msExpenseDetails;
    }

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsExpenseDetail> selectByPeronId(String personId) {
        ArrayList<MsExpenseDetail> msExpenseDetails=msExpenseDetailDao.selectByPeronId(personId);
        return msExpenseDetails;
    }

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<MsExpenseDetail> selectByEhrId(String ehrId) {
        ArrayList<MsExpenseDetail> msExpenseDetails=msExpenseDetailDao.selectByEhrId(ehrId);
        return msExpenseDetails;
    }

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    public ArrayList<MsExpenseDetail> selectByEhrAndPersonId(String ehrId, String personId) {
        ArrayList<MsExpenseDetail> msExpenseDetails=msExpenseDetailDao.selectByEhrAndPersonId(ehrId,personId);
        return msExpenseDetails;
    }
}
