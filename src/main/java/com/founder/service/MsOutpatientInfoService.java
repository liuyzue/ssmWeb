package com.founder.service;

import com.founder.entity.CheckUnit;
import com.founder.entity.ErrorInfo;
import com.founder.entity.MsOutpatientInfo;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service
 * @date:2019/9/15
 * @time:14:17
 */
public interface MsOutpatientInfoService extends BaseService<MsOutpatientInfo> {

//通用查询
    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    ArrayList<MsOutpatientInfo> selectAllByUploadTime(String startTime, String endTime);

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsOutpatientInfo> selectByPeronId(String personId);

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    ArrayList<MsOutpatientInfo> selectByEhrId(String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsOutpatientInfo> selectByEhrAndPersonId(String ehrId, String personId);

//校验方法
    /**
     * 校验 挂号记录
     * @return
     */
    ArrayList<ErrorInfo> msOutpatientCheckMsRegister();

    /**
     * 校验 用药记录
     * @return
     */
    ArrayList<ErrorInfo> msOutpatientCheckMsDrug();
    /**
     * 校验 诊断记录
     * @return
     */
    ArrayList<ErrorInfo> msOutpatientCheckMsDiseaseDia();
    /**
     * 校验 门诊处方记录
     * @return
     */
    ArrayList<ErrorInfo> msOutpatientCheckMsOutpatientPres();
    /**
     * 校验 费用记录
     * @return
     */
    ArrayList<ErrorInfo> msOutpatientCheckMsExpInfo();
    /**
     * 校验 检验记录
     * @return
     */
    ArrayList<ErrorInfo> msOutpatientCheckMsExamine();
    /**
     * 校验 检查记录
     * @return
     */
    ArrayList<ErrorInfo> msOutpatientCheckMsStudy();
}
