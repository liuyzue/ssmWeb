package com.founder.mapper;

import com.founder.entity.ContractTeamInfo;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * ContractTeamInfoMapper，映射SQL语句的接口，无逻辑实现
 */
@Component
public interface ContractTeamInfoMapper {

    List<ContractTeamInfo> findAll();


    List<ContractTeamInfo> findByCode();

    void updateRecord(ContractTeamInfo contractTeamInfo);

    int insertRecord(ContractTeamInfo contractTeamInfo);

}