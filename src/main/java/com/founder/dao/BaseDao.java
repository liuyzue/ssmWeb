package com.founder.dao;

import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.dao
 * @date:2019/9/14
 * @time:9:01
 */
public interface BaseDao <T>{

    /**
     * 查询所有记录
     * @return
     */
    ArrayList<T> selectAll();

    /**
     * 根据一段upload_time查询所有记录
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime yyyy-MM-dd hh24:mi:ss
     * @return
     */
    ArrayList<T> selectAllByUploadTime(@Param("startTime") String startTime, @Param("endTime") String endTime);

    /**
     * 根据person_id查询记录
     * @param personId
     * @return
     */
    ArrayList<T> selectByPeronId(String personId);

    /**
     * 根据ehr_id查询记录
     * @param ehrId
     * @return
     */
    ArrayList<T> selectByEhrId(String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     * @param ehrId
     * @param personId
     * @return
     */
    ArrayList<T> selectByEhrAndPersonId(@Param("ehr_id") String ehrId,@Param("person_id") String personId);

}
