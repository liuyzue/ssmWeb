package com.founder.dao;

import com.founder.entity.MsStudyEvent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.dao
 * @date:2019/9/15
 * @time:0:12
 */
@Repository
public interface MsStudyEventDao extends BaseDao<MsStudyEvent> {

    /**
     * 查询所有记录
     *
     * @return
     */
    @Override
    ArrayList<MsStudyEvent> selectAll();

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    ArrayList<MsStudyEvent> selectAllByUploadTime(@Param("startTime") String startTime, @Param("endTime") String endTime);

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsStudyEvent> selectByPeronId(String personId);

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    ArrayList<MsStudyEvent> selectByEhrId(String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsStudyEvent> selectByEhrAndPersonId(@Param("ehr_id") String ehrId, @Param("person_id") String personId);
}
