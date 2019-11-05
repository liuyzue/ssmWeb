package com.founder.entity;

import java.util.Date;

public class ReportDynamicDeteal {
    public int id;         //id
    public Integer year;
    public Integer month;
    public Integer day;
    public Integer quarter;    //季度
    public String jgmc;       //机构名称
    public Integer mzrs;       //门诊人数
    public Integer mzpkrs;     //门诊贫困人数-------月就诊人次
    public Double mzpkzb;     //门诊贫困人数占比---
    public Double mzpkmhe;    //门诊免号额---------收费金额药占比
    public Integer zyrs;       //住院人数
    public Integer zypkrs;     //住院贫困人数-------当前在院人数
    public Integer zypkzb;     //住院贫困人数占比----今日出院人数
    public Double cyrs;       //出院人数 ----------门诊日收费
    public Double cypkrs;     //出院贫困人数--------门诊月收费
    public Double cypkzb;     //出院贫困人数占比
    public Integer cypkbxe;    //出院贫困人数报销额
    public Double yxrs;       //影像人数----------今日收费
    public Double yxycrs;     //影像远程人数-------月收费
    public Double yxyczb;     //影像远程占比--------月报销
    public Date dbdt;       //日期
    public Integer infodt;
    public String jgcode;     //
    public Integer YLCYRS;     //医疗出院人数


    public ReportDynamicDeteal(){

    }
    public ReportDynamicDeteal(int year,int month,int day,int quarter) {
        this.year=year;
        this.month=month;
        this.day=day;
        this.quarter=quarter;
        this.mzrs = 0;
        this.mzpkrs = 0;
        this.mzpkzb = 0.0;
        this.mzpkmhe = 0.0;
        this.zyrs = 0;
        this.zypkrs = 0;
        this.zypkzb = 0;
        this.cyrs = 0.0;
        this.cypkrs = 0.0;
        this.cypkzb = 0.0;
        this.cypkbxe = 0;
        this.yxrs = 0.0;
        this.yxycrs = 0.0;
        this.yxyczb = 0.0;
        this.infodt=0;
        this.YLCYRS=0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    public String getJgmc() {
        return jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
    }

    public int getMzrs() {
        return mzrs;
    }

    public void setMzrs(int mzrs) {
        this.mzrs = mzrs;
    }

    public Integer getMzpkrs() {
        return mzpkrs;
    }

    public void setMzpkrs(Integer mzpkrs) {
        this.mzpkrs = mzpkrs;
    }

    public Double getMzpkzb() {
        return mzpkzb;
    }

    public void setMzpkzb(Double mzpkzb) {
        this.mzpkzb = mzpkzb;
    }

    public Double getMzpkmhe() {
        return mzpkmhe;
    }

    public void setMzpkmhe(Double mzpkmhe) {
        this.mzpkmhe = mzpkmhe;
    }

    public int getZyrs() {
        return zyrs;
    }

    public void setZyrs(int zyrs) {
        this.zyrs = zyrs;
    }

    public int getZypkrs() {
        return zypkrs;
    }

    public void setZypkrs(int zypkrs) {
        this.zypkrs = zypkrs;
    }

    public Integer getZypkzb() {
        return zypkzb;
    }

    public void setZypkzb(Integer zypkzb) {
        this.zypkzb = zypkzb;
    }

    public Double getCyrs() {
        return cyrs;
    }

    public void setCyrs(Double cyrs) {
        this.cyrs = cyrs;
    }

    public Double getCypkrs() {
        return cypkrs;
    }

    public void setCypkrs(Double cypkrs) {
        this.cypkrs = cypkrs;
    }

    public Double getCypkzb() {
        return cypkzb;
    }

    public void setCypkzb(Double cypkzb) {
        this.cypkzb = cypkzb;
    }

    public int getCypkbxe() {
        return cypkbxe;
    }

    public void setCypkbxe(int cypkbxe) {
        this.cypkbxe = cypkbxe;
    }

    public Double getYxrs() {
        return yxrs;
    }

    public void setYxrs(Double yxrs) {
        this.yxrs = yxrs;
    }

    public Double getYxycrs() {
        return yxycrs;
    }

    public void setYxycrs(Double yxycrs) {
        this.yxycrs = yxycrs;
    }

    public Double getYxyczb() {
        return yxyczb;
    }

    public void setYxyczb(Double yxyczb) {
        this.yxyczb = yxyczb;
    }

    public Date getDbdt() {
        return dbdt;
    }

    public void setDbdt(Date dbdt) {
        this.dbdt = dbdt;
    }

    public Integer getInfodt() {
        return infodt;
    }

    public void setInfodt(Integer infodt) {
        this.infodt = infodt;
    }

    public String getJgcode() {
        return jgcode;
    }

    public void setJgcode(String jgcode) {
        this.jgcode = jgcode;
    }

    public Integer getYLCYRS() {
        return YLCYRS;
    }

    public void setYLCYRS(Integer YLCYRS) {
        this.YLCYRS = YLCYRS;
    }

    @Override
    public String toString() {
        //public Double mzpkrs;     //门诊贫困人数-------门诊收费金额
        //    public Double mzpkzb;     //门诊贫困人数占比----门诊报销金额
        //    public Double mzpkmhe;    //门诊免号额---------收费金额药占比
        return "{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", quarter=" + quarter +
                ", 机构名称='" + jgmc + '\'' +
                ", 日门诊人次=" + mzrs +
                ", 月门诊人次=" + mzpkrs +
                ", mzpkzb=" + mzpkzb +
                ", mzpkmhe=" + mzpkmhe +
                ", zyrs=" + zyrs +
                ", zypkrs=" + zypkrs +
                ", zypkzb=" + zypkzb +
                ", 日收费额(cyrs)=" + cyrs +
                ", 月收费额(CYPKRS)=" + cypkrs +
                ", cypkzb=" + cypkzb +
                ", cypkbxe=" + cypkbxe +
                ", yxrs=" + yxrs +
                ", yxycrs=" + yxycrs +
                ", yxyczb=" + yxyczb +
                ", dbdt=" + dbdt +
                ", infodt='" + infodt + '\'' +
                ", jgcode='" + jgcode + '\'' +
                ", YLCYRS='" + YLCYRS + '\'' +
                '}';
    }
}
