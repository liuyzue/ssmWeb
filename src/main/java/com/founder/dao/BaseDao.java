package com.founder.dao;

import java.util.List;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.dao
 * @date:2019/9/14
 * @time:9:01
 */
public interface BaseDao <T>{

    /**
     * 根据一段upload_time查询所有记录
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime yyyy-MM-dd hh24:mi:ss
     * @return
     */
    List<T> selectAllByUploadTime(String startTime, String endTime);

    /**
     * 根据person_id查询记录
     * @param personId
     * @return
     */
    List<T> selectByPeronId(String personId);

    /**
     * 根据ehr_id查询记录
     * @param ehrId
     * @return
     */
    List<T> selectByEhrId(String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     * @param ehrId
     * @param personId
     * @return
     */
    List<T> selectByEhrAndPersonId(String ehrId,String personId);

}
