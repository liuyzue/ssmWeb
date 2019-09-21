package com.founder.dao;

import com.founder.entity.CheckUnit;
import com.founder.entity.ErrorInfo;
import com.founder.entity.MsInpatientInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.dao
 * @date:2019/9/14
 * @time:23:23
 */
@Repository
public interface MsInpatientInfoDao extends BaseDao<MsInpatientInfo> {


    /**
     * 查询所有记录
     *
     * @return
     */
    @Override
    ArrayList<MsInpatientInfo> selectAll();

    /**
     * 根据一段upload_time查询所有记录
     *
     * @param startTime yyyy-MM-dd hh24:mi:ss
     * @param endTime   yyyy-MM-dd hh24:mi:ss
     * @return
     */
    @Override
    ArrayList<MsInpatientInfo> selectAllByUploadTime(@Param("startTime") String startTime, @Param("endTime") String endTime);

    /**
     * 根据person_id查询记录
     *
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsInpatientInfo> selectByPeronId(String personId);

    /**
     * 根据ehr_id查询记录
     *
     * @param ehrId
     * @return
     */
    @Override
    ArrayList<MsInpatientInfo> selectByEhrId(String ehrId);

    /**
     * 根据ehr_id和person_id查询记录
     *
     * @param ehrId
     * @param personId
     * @return
     */
    @Override
    ArrayList<MsInpatientInfo> selectByEhrAndPersonId(@Param("ehr_id") String ehrId, @Param("person_id") String personId);

    //校验方法
    /**
     * 校验 住院医嘱记录
     * @return
     */
    ArrayList<ErrorInfo> msInpatientCheckMsDoctorAdv();
    /**
     * 校验 费用记录
     * @return
     */
    ArrayList<ErrorInfo> msInpatientCheckMsExpenseInfo();
    /**
     * 校验 诊断记录
     * @return
     */
    ArrayList<ErrorInfo> msInpatientCheckMsDiseaseDia();
    /**
     * 校验 检验记录
     * @return
     */
    ArrayList<ErrorInfo> msInpatientCheckMsExamineInfo();
    /**
     * 校验 检查记录
     * @return
     */
    ArrayList<ErrorInfo> msInpatientCheckMsStudy();
    /**
     * 校验 出院小结记录
     * @return
     */
    ArrayList<ErrorInfo> msInpatientCheckMsOutHospitalSum();
    /**
     * 校验 病案首页记录
     * @return
     */
    ArrayList<ErrorInfo> msInpatientCheckMsInpatientMedical();

}
