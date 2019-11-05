package com.founder.mapper;

import com.founder.entity.RecordContractByPeopleInfo;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * RecordContractBypeopleInfoMapper，映射SQL语句的接口，无逻辑实现
 */
@Component
public interface RecordContractBypeopleInfoMapper {

    List<RecordContractByPeopleInfo> findAll();

    String findPtype();

    String findPtypeno();

    int findjdPnumbersPTRQ();

    int findjdPnumbersGXY();

    int findjdPnumbersTNB();

    int findjdPnumbersLNR();

    int findjdPnumbersET();

    int findjdPnumbersYCF();

    int findjdPnumbersJSB();

    int findjdPnumbersJHB();

    int findjdPnumbersPKRK();

    int findjdPnumbersJSTK();

    int findjdPnumbersCJR();

    int findqyPnumbersPTRQ();

    int findqyPnumbersGXY();

    int findqyPnumbersTNB();

    int findqyPnumbersLNR();

    int findqyPnumbersET();

    int findqyPnumbersYCF();

    int findqyPnumbersJSB();

    int findqyPnumbersJHB();

    int findqyPnumbersPKRK();

    int findqyPnumbersJSTK();

    int findqyPnumbersCJR();

    void updateCard(RecordContractByPeopleInfo recordContractBypeopleInfo);

}