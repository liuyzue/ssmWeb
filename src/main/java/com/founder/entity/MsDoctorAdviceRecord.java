package com.founder.entity;


import java.sql.Date;

public class MsDoctorAdviceRecord {

  private String id;
  private String ehrId;
  private String hpNo;
  private String hpSNo;
  private String odrNo;
  private String othercardtype;
  private String othercardno;
  private java.sql.Date gatherDate;

  public MsDoctorAdviceRecord() {
  }

  public MsDoctorAdviceRecord(String id, String ehrId, String hpNo, String hpSNo, String odrNo, String othercardtype, String othercardno, Date gatherDate) {
    this.id = id;
    this.ehrId = ehrId;
    this.hpNo = hpNo;
    this.hpSNo = hpSNo;
    this.odrNo = odrNo;
    this.othercardtype = othercardtype;
    this.othercardno = othercardno;
    this.gatherDate = gatherDate;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getEhrId() {
    return ehrId;
  }

  public void setEhrId(String ehrId) {
    this.ehrId = ehrId;
  }


  public String getHpNo() {
    return hpNo;
  }

  public void setHpNo(String hpNo) {
    this.hpNo = hpNo;
  }


  public String getHpSNo() {
    return hpSNo;
  }

  public void setHpSNo(String hpSNo) {
    this.hpSNo = hpSNo;
  }


  public String getOdrNo() {
    return odrNo;
  }

  public void setOdrNo(String odrNo) {
    this.odrNo = odrNo;
  }


  public String getOthercardtype() {
    return othercardtype;
  }

  public void setOthercardtype(String othercardtype) {
    this.othercardtype = othercardtype;
  }


  public String getOthercardno() {
    return othercardno;
  }

  public void setOthercardno(String othercardno) {
    this.othercardno = othercardno;
  }


  public java.sql.Date getGatherDate() {
    return gatherDate;
  }

  public void setGatherDate(java.sql.Date gatherDate) {
    this.gatherDate = gatherDate;
  }

}
