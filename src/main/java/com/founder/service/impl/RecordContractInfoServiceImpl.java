package com.founder.service.impl;

import com.founder.entity.RecordContractInfo;
import com.founder.mapper.RecordContractInfoMapper;
import com.founder.service.RecordContractInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuyuze
 */
@Service
public class RecordContractInfoServiceImpl implements RecordContractInfoService {

    @Autowired
    private RecordContractInfoMapper rc;

    private SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm");

    @Override
    public void sumNum(){
        int RecordNum=rc.findRecordNum();
        int Contract=rc.findContract();
        RecordContractInfo rci = new RecordContractInfo(RecordNum,Contract);
        rci.setCreateDate(sd.format(new Date()));

        rc.updateRecord(rci);
        /*rc.insertRecord(rci);*/

        System.out.println(sd.format(new Date())+rci.toString());
    }
}
