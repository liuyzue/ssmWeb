package com.founder.service;

import com.founder.entity.MsSurgeryInfo;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service
 * @date:2019/9/15
 * @time:14:12
 */
public interface MsSurgeryInfoService extends BaseService<MsSurgeryInfo> {
    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    ArrayList<MsSurgeryInfo> selectAllByUploadTime(String startTime, String endTime);

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsSurgeryInfo> selectByPeronId(String personId);

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    ArrayList<MsSurgeryInfo> selectByEhrId(String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsSurgeryInfo> selectByEhrAndPersonId(String ehrId, String personId);
}