package com.founder.mapper;


import com.founder.entity.RecordContractNumAllInfo;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * RecordContractNumAllInfoMapper，映射SQL语句的接口，无逻辑实现
 */
@Component
public interface RecordContractNumAllInfoMapper {

    List<RecordContractNumAllInfo> findAll();

    int findFollowUpNum();

    int findRecordNum();

    int findContractNum();

    int findFollowUpSecondDI();

    int findFollowUpSecondHYPE();

    void updateRecord(RecordContractNumAllInfo ra);

    int insertRecord(RecordContractNumAllInfo ra);


}