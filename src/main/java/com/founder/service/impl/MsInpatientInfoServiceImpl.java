package com.founder.service.impl;

import com.founder.dao.MsInpatientInfoDao;
import com.founder.entity.CheckUnit;
import com.founder.entity.ErrorInfo;
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

    /**
     * 校验 住院医嘱记录
     *
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> msInpatientCheckMsDoctorAdv() {
        return msInpatientInfoDao.msInpatientCheckMsDoctorAdv();
    }

    /**
     * 校验 费用记录
     *
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> msInpatientCheckMsExpenseInfo() {
        return msInpatientInfoDao.msInpatientCheckMsExpenseInfo();
    }

    /**
     * 校验 诊断记录
     *
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> msInpatientCheckMsDiseaseDia() {
        return msInpatientInfoDao.msInpatientCheckMsDiseaseDia();
    }

    /**
     * 校验 检验记录
     *
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> msInpatientCheckMsExamineInfo() {
        return msInpatientInfoDao.msInpatientCheckMsExamineInfo();
    }

    /**
     * 校验 检查记录
     *
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> msInpatientCheckMsStudy() {
        return msInpatientInfoDao.msInpatientCheckMsStudy();
    }

    /**
     * 校验 出院小结记录
     *
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> msInpatientCheckMsOutHospitalSum() {
        return msInpatientInfoDao.msInpatientCheckMsOutHospitalSum();
    }

    /**
     * 校验 病案首页记录
     *
     * @return
     */
    @Override
    public ArrayList<ErrorInfo> msInpatientCheckMsInpatientMedical() {
        return msInpatientInfoDao.msInpatientCheckMsInpatientMedical();
    }
}
