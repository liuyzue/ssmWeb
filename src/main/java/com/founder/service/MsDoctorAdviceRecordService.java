package com.founder.service;

import com.founder.entity.MsDoctorAdviceRecord;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service
 * @date:2019/9/15
 * @time:14:06
 */
public interface MsDoctorAdviceRecordService extends BaseService<MsDoctorAdviceRecord> {
    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    ArrayList<MsDoctorAdviceRecord> selectAllByUploadTime(String startTime, String endTime);

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsDoctorAdviceRecord> selectByPeronId(String personId);

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    ArrayList<MsDoctorAdviceRecord> selectByEhrId(String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsDoctorAdviceRecord> selectByEhrAndPersonId(String ehrId, String personId);
}
