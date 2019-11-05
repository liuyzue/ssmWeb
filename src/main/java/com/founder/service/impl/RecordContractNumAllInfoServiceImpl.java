package com.founder.service.impl;

import com.founder.entity.RecordContractNumAllInfo;
import com.founder.mapper.RecordContractNumAllInfoMapper;
import com.founder.service.RecordContractNumAllInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuyuze
 */
@Service
public class RecordContractNumAllInfoServiceImpl implements RecordContractNumAllInfoService {

    @Autowired
    RecordContractNumAllInfoMapper rcm;

    SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm");

    @Override
    public void updateRecordContractNumAllInfo(){

        int followUp=rcm.findFollowUpNum();
        int recordNum=rcm.findRecordNum();
        int contract=rcm.findContractNum();
        String create=sd.format(new Date());
        int followUpSecond=rcm.findFollowUpSecondDI()+rcm.findFollowUpSecondHYPE();

        RecordContractNumAllInfo rc=new RecordContractNumAllInfo(followUp,recordNum,contract,followUpSecond);
        rc.setCreateDate(create);
        rcm.updateRecord(rc);
        /*rcm.insertRecord(rc);*/

        System.out.println(sd.format(new Date())+rc.toString());

    }

}
