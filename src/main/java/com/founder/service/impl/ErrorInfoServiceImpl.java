package com.founder.service.impl;

import com.founder.dao.ErrorInfoDao;
import com.founder.entity.ErrorInfo;
import com.founder.service.ErrorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/16
 * @time:10:50
 */
@Service
public class ErrorInfoServiceImpl implements ErrorInfoService {

    @Autowired
    ErrorInfoDao errorInfoDao;
    /**
     * 查询所有错误信息
     *
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> selectAll() {
        ArrayList<ErrorInfo> errorInfos=errorInfoDao.selectAll();
        return errorInfos;
    }

    /**
     * 根据person_id查询错误信息
     *
     * @param personId
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> selectByPersonId(Integer personId) {
        ArrayList<ErrorInfo> errorInfos=errorInfoDao.selectByPersonId(personId);
        return errorInfos;
    }

    /**
     * 根据ehr_id查询
     *
     * @param ehrId
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> selectByEhrId(String ehrId) {
        ArrayList<ErrorInfo> errorInfos=errorInfoDao.selectByEhrId(ehrId);
        return errorInfos;
    }

    /**
     * 根据上传时间查询
     *
     * @param startTime
     * @param endTime
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> selectByUploadTime(String startTime, String endTime) {
        ArrayList<ErrorInfo> errorInfos=errorInfoDao.selectByUploadTime(startTime,endTime);
        return errorInfos;
    }

    /**
     * 插入错误信息
     *
     * @param errorInfoList
     */
    @Override
    public void addErrorInfo(ArrayList<ErrorInfo> errorInfoList) {
        errorInfoDao.addErrorInfo(errorInfoList);
    }

    /**
     * 删除指定校验日期之前的错误信息
     *
     * @param checkTime
     */
    @Override
    public void deleteErrorInfoByCheckTime(String checkTime) {

    }
}
