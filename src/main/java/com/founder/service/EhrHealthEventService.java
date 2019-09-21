package com.founder.service;

import com.founder.entity.CheckUnit;
import com.founder.entity.EhrHealthEvent;
import com.founder.entity.ErrorInfo;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service.impl
 * @date:2019/9/13
 * @time:16:27
 */
public interface EhrHealthEventService extends BaseService<EhrHealthEvent> {


    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    ArrayList<EhrHealthEvent> selectAllByUploadTime(String startTime, String endTime);

    /**
     * 根据ehr_type查询所有记录
     * @param ehrType
     * @return
     */
    ArrayList<EhrHealthEvent> selectAllByEhrType(String ehrType);

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    ArrayList<EhrHealthEvent> selectByPeronId(String personId);

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    ArrayList<EhrHealthEvent> selectByEhrId(String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    ArrayList<EhrHealthEvent> selectByEhrAndPersonId(String ehrId, String personId);

    /**
     * 校验在门诊记录
     * @return
     */
    ArrayList<ErrorInfo> ehrCheckMsOutpatient();

    /**
     * 校验住院记录
     * @return
     */
    ArrayList<ErrorInfo> ehrCheckMsInpatient();

}