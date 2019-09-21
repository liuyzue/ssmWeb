package com.founder.dao;

import com.founder.entity.MsOuthospitalSummary;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.dao
 * @date:2019/9/14
 * @time:23:36
 */
@Repository
public interface MsOuthospitalSummaryDao extends BaseDao<MsOuthospitalSummary> {


    /**
     * 查询所有记录
     *
     * @return
     */
    @Override
    ArrayList<MsOuthospitalSummary> selectAll();

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    ArrayList<MsOuthospitalSummary> selectAllByUploadTime(@Param("startTime") String startTime, @Param("endTime") String endTime);

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsOuthospitalSummary> selectByPeronId(String personId);

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    ArrayList<MsOuthospitalSummary> selectByEhrId(String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsOuthospitalSummary> selectByEhrAndPersonId(@Param("ehr_id") String ehrId,@Param("person_id") String personId);
}
