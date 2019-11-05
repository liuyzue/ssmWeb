package com.founder.service.impl;

import com.founder.entity.ContractTeamInfo;
import com.founder.mapper.ContractTeamInfoMapper;
import com.founder.service.ContractTeamInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author liuyuze
 */
@Service
public class ContractTeamInfoServiceImpl implements ContractTeamInfoService {
    private static final HashMap<String,String> ORGAN=new HashMap<String,String>(){{
        put("494367733","石莱镇卫生院");
        put("494367581","翟镇中心卫生院");
        put("LDPDY0001","楼德中心卫生院");
        put("495177763","放城中心卫生院");
        put("494367223","东都镇卫生院");
        put("494365594","岳家庄乡卫生院");
        put("494367231","谷里镇卫生院");
        put("494367311","羊流中心卫生院");
        put("494366554","西张庄镇卫生院");
        put("494367274","龙廷中心卫生院");
        put("494365623","果都镇卫生院");
        put("49436628X","刘杜中心卫生院");
        put("494367661","小协镇卫生院");
        put("495174837","禹村镇卫生院");
        put("494365949","泉沟镇卫生院");
        put("494365711","宫里镇卫生院");
        put("494366765","新汶街道社区卫生服务中心");
        put("494366212","汶南中心卫生院");
        put("494365236","青云街道社区卫生服务中心");
    }};



    @Autowired
    ContractTeamInfoMapper contractTeamInfoMapper;

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");


    @Override
    public void updateContractTeamInfo(){
        List<ContractTeamInfo> signTeamVo =contractTeamInfoMapper.findByCode();

        for (ContractTeamInfo svo :signTeamVo) {
            svo.setTeam_name(ORGAN.get(svo.getTeam_name()));
            svo.setTeamNo(signTeamVo.indexOf(svo)+1);
            svo.setCreateDate(sdf.format(new Date()));
        }

        for (ContractTeamInfo vo:signTeamVo){
            contractTeamInfoMapper.updateRecord(vo);
        }

        /*for (ContractTeamInfo vo:signTeamVo){
            contractTeamInfoMapper.insertRecord(vo);
        }*/

        System.out.println(sdf.format(new Date())+"contractTeamInfo DONE!");


    }
}
