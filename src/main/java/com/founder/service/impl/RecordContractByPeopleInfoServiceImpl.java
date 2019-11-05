package com.founder.service.impl;

import com.founder.mapper.RecordContractBypeopleInfoMapper;
import com.founder.entity.RecordContractByPeopleInfo;
import com.founder.service.RecordContractByPeopleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author liuyuze
 */
@Service
public class RecordContractByPeopleInfoServiceImpl implements RecordContractByPeopleInfoService {

    Map<String,Integer> PERSON_CODE=new HashMap<String, Integer>(){{
        put("ptrq",11);
        put("gxy",12);
        put("tnb",13);
        put("lnr",14);
        put("et",15);
        put("ycf",16);
        put("jsb",17);
        put("jhb",18);
        put("pkrk",19);
        put("jstk",20);
        put("cjr",21);
    }};

    DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm");

    @Autowired
    RecordContractBypeopleInfoMapper mapper;

    @Override
    public void updateRecord(){

        List<RecordContractByPeopleInfo> jdRecord;
        List<RecordContractByPeopleInfo> qyRecord;
        jdRecord=jdRecord();
        qyRecord=qyRecord();

        for (RecordContractByPeopleInfo record:jdRecord) {
            mapper.updateCard(record);
        }
        for (RecordContractByPeopleInfo record1:qyRecord) {
            mapper.updateCard(record1);
        }

        System.out.println(df.format(new Date())+"recordContractBypeopleInfo DONE!");

    }

    List<RecordContractByPeopleInfo> jdRecord(){
        List<RecordContractByPeopleInfo> JD=new ArrayList<>();
        JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("ptrq"),mapper.findjdPnumbersPTRQ(),1,df.format(new Date())));
        JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("gxy"),mapper.findjdPnumbersGXY(),1,df.format(new Date())));
        //JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("jhb"),mapper.findjdPnumbersJHB(),1,df.format(new Date())));
        JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("lnr"),mapper.findjdPnumbersLNR(),1,df.format(new Date())));
        JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("tnb"),mapper.findjdPnumbersTNB(),1,df.format(new Date())));
        JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("ycf"),mapper.findjdPnumbersYCF(),1,df.format(new Date())));
        //JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("jsb"),mapper.findjdPnumbersJSB(),1,df.format(new Date())));
        JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("pkrk"),mapper.findjdPnumbersPKRK(),1,df.format(new Date())));
        JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("cjr"),mapper.findjdPnumbersCJR(),1,df.format(new Date())));
        JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("jstk"),mapper.findjdPnumbersJSTK(),1,df.format(new Date())));
        JD.add(new RecordContractByPeopleInfo(PERSON_CODE.get("et"),mapper.findjdPnumbersET(),1,df.format(new Date())));

        return JD;
    }
    List<RecordContractByPeopleInfo> qyRecord(){
        List<RecordContractByPeopleInfo> QY=new ArrayList<>();
        QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("ptrq"),mapper.findqyPnumbersPTRQ(),2,df.format(new Date())));
        QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("gxy"),mapper.findqyPnumbersGXY(),2,df.format(new Date())));
        //QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("jhb"),mapper.findqyPnumbersJHB(),2,df.format(new Date())));
        QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("lnr"),mapper.findqyPnumbersLNR(),2,df.format(new Date())));
        QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("tnb"),mapper.findqyPnumbersTNB(),2,df.format(new Date())));
        QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("ycf"),mapper.findqyPnumbersYCF(),2,df.format(new Date())));
        //QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("jsb"),mapper.findqyPnumbersJSB(),2,df.format(new Date())));
        QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("pkrk"),mapper.findqyPnumbersPKRK(),2,df.format(new Date())));
        QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("cjr"),mapper.findqyPnumbersCJR(),2,df.format(new Date())));
        QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("jstk"),mapper.findqyPnumbersJSTK(),2,df.format(new Date())));
        QY.add(new RecordContractByPeopleInfo(PERSON_CODE.get("et"),mapper.findqyPnumbersET(),2,df.format(new Date())));
        return QY;
    }

}
