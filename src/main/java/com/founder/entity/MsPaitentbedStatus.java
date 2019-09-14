package com.founder.entity;


public class MsPaitentbedStatus {

  private String id;
  private String hospitalCode;
  private String depCode;
  private String depName;
  private String sumBed;
  private String residueBed;
  private String telNo;
  private java.sql.Date createTime;
  private java.sql.Date updateTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getHospitalCode() {
    return hospitalCode;
  }

  public void setHospitalCode(String hospitalCode) {
    this.hospitalCode = hospitalCode;
  }


  public String getDepCode() {
    return depCode;
  }

  public void setDepCode(String depCode) {
    this.depCode = depCode;
  }


  public String getDepName() {
    return depName;
  }

  public void setDepName(String depName) {
    this.depName = depName;
  }


  public String getSumBed() {
    return sumBed;
  }

  public void setSumBed(String sumBed) {
    this.sumBed = sumBed;
  }


  public String getResidueBed() {
    return residueBed;
  }

  public void setResidueBed(String residueBed) {
    this.residueBed = residueBed;
  }


  public String getTelNo() {
    return telNo;
  }

  public void setTelNo(String telNo) {
    this.telNo = telNo;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public java.sql.Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Date updateTime) {
    this.updateTime = updateTime;
  }

}
