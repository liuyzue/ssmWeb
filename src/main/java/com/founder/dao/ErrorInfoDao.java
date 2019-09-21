package com.founder.dao;

import com.founder.entity.ErrorInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.dao
 * @date:2019/9/16
 * @time:10:00
 */
@Repository
public interface ErrorInfoDao {

    /**
     * 查询所有错误信息
     * @return
     */
    ArrayList<ErrorInfo> selectAll();

    /**
     * 根据person_id查询错误信息
     * @param personId
     * @return
     */
    ArrayList<ErrorInfo> selectByPersonId(Integer personId);

    /**
     * 根据ehr_id查询
     * @param ehrId
     * @return
     */
    ArrayList<ErrorInfo> selectByEhrId(String ehrId);

    /**
     * 根据上传时间查询
     * @param startTime
     * @param endTime
     * @return
     */
    ArrayList<ErrorInfo> selectByUploadTime(@Param("startTime") String startTime, @Param("endTime") String endTime);

    /**
     * 插入错误信息
     * @param errorInfoList
     */
    void addErrorInfo(@Param("errorInfoList") List<ErrorInfo> errorInfoList);

    /**
     * 删除指定校验日期之前的错误信息
     * @param checkTime
     */
    void deleteErrorInfoByCheckTime(String checkTime);

    /**
     * 根据表名删除数据
     * @param tableName
     */
    void deleteErrorInfoByTableName(String tableName);

}
