package com.founder.service;

import com.founder.entity.ErrorInfo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.service
 * @date:2019/9/16
 * @time:10:49
 */
public interface ErrorInfoService {
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
     * @param errorInfo
     * @return
     */
    void addErrorInfo(ErrorInfo errorInfo);

    /**
     * 删除指定校验日期之前的错误信息
     * @param checkTime
     */
    void deleteErrorInfoByCheckTime(String checkTime);
}
