package com.founder.mapper;

import com.founder.entity.RecordContractInfo;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * RecordContractInfoMapper，映射SQL语句的接口，无逻辑实现
 */
@Component
public interface RecordContractInfoMapper {

    List<RecordContractInfo> findAll();

    int findRecordNum();

    int findContract();

    void updateRecord(RecordContractInfo cord);

    int insertRecord(RecordContractInfo cord);
}