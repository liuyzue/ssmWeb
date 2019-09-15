package com.founder.service;

import com.founder.entity.MsRegisterRecord;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service
 * @date:2019/9/15
 * @time:14:11
 */
public interface MsRegisterRecordService extends BaseService<MsRegisterRecord> {
    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    ArrayList<MsRegisterRecord> selectAllByUploadTime(String startTime, String endTime);

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsRegisterRecord> selectByPeronId(String personId);

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    ArrayList<MsRegisterRecord> selectByEhrId(String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsRegisterRecord> selectByEhrAndPersonId(String ehrId, String personId);
}
