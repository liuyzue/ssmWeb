package com.founder.dao;

import com.founder.entity.EhrHealthEvent;
import com.founder.entity.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.dao
 * @date:2019/9/13
 * @time:15:56
 */

@Repository
public interface EhrHealthEventDao extends BaseDao<EhrHealthEvent>{

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    ArrayList<EhrHealthEvent> selectAllByUploadTime(@Param("startTime") String startTime,@Param("endTime")  String endTime);

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    ArrayList<EhrHealthEvent> selectByPeronId(@Param("person_id") String personId);

    /**
     * 根据ehr_type查询所有记录
     * @param ehrType
     * @return
     */
    ArrayList<EhrHealthEvent> selectAllByEhrType(String ehrType);
    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    ArrayList<EhrHealthEvent> selectByEhrId(@Param("ehr_id") String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    ArrayList<EhrHealthEvent> selectByEhrAndPersonId(@Param("ehr_id") String ehrId,@Param("person_id") String personId);

    ArrayList<EhrHealthEvent> selectByFenye();


}
