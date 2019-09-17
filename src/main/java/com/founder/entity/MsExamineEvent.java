package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class MsExamineEvent {

  private String id;
  private String ehrId;
  private String personId;
  private String recordNumber;
  private String name;
  private String gender;
  private String age;
  private String checkListTitle;
  private String sampleTypeName;
  private String inspectionType;
  private String hospitalCode;
  private String hospitalName;
  private String applyRoomCode;
  private String applyRoomName;
  private String applyPeopleNo;
  private String applyPeopleName;
  private String applyPeopleIdcard;
  private java.sql.Date applyDate;
  private String auditCode;
  private String auditName;
  private String auditIdcard;
  private java.sql.Date auditDate;
  private String checkPeopleCode;
  private String checkPeopleName;
  private String checkPeopleIdcard;
  private java.sql.Date checkDate;
  private String updateName;
  private String updateIdcard;
  private java.sql.Timestamp updateDate;
  private String isDelete;
  private String marriage;
  private String examinationNumber;
  private String examinationCode;
  private String examinationName;
  private String othercardtype;
  private String othercardno;
  private String opEmHpExNo;
  private String opEmHpExMark;
  private String rptCatCode;
  private java.sql.Date sampDt;
  private java.sql.Date acceptDt;
  private String eqptCatCode;
  private String eqptNo;
  private String eqptName;
  private String testmethod;
  private String processStatus;
  private String isLimit;
  private java.sql.Date gatherDate;
  private String opEmInExMark;
  private String visitStatus;

  public MsExamineEvent() {
  }

  public MsExamineEvent(String id, String ehrId, String personId, String recordNumber, String name, String gender, String age, String checkListTitle, String sampleTypeName, String inspectionType, String hospitalCode, String hospitalName, String applyRoomCode, String applyRoomName, String applyPeopleNo, String applyPeopleName, String applyPeopleIdcard, Date applyDate, String auditCode, String auditName, String auditIdcard, Date auditDate, String checkPeopleCode, String checkPeopleName, String checkPeopleIdcard, Date checkDate, String updateName, String updateIdcard, Timestamp updateDate, String isDelete, String marriage, String examinationNumber, String examinationCode, String examinationName, String othercardtype, String othercardno, String opEmHpExNo, String opEmHpExMark, String rptCatCode, Date sampDt, Date acceptDt, String eqptCatCode, String eqptNo, String eqptName, String testmethod, String processStatus, String isLimit, Date gatherDate, String opEmInExMark, String visitStatus) {
    this.id = id;
    this.ehrId = ehrId;
    this.personId = personId;
    this.recordNumber = recordNumber;
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.checkListTitle = checkListTitle;
    this.sampleTypeName = sampleTypeName;
    this.inspectionType = inspectionType;
    this.hospitalCode = hospitalCode;
    this.hospitalName = hospitalName;
    this.applyRoomCode = applyRoomCode;
    this.applyRoomName = applyRoomName;
    this.applyPeopleNo = applyPeopleNo;
    this.applyPeopleName = applyPeopleName;
    this.applyPeopleIdcard = applyPeopleIdcard;
    this.applyDate = applyDate;
    this.auditCode = auditCode;
    this.auditName = auditName;
    this.auditIdcard = auditIdcard;
    this.auditDate = auditDate;
    this.checkPeopleCode = checkPeopleCode;
    this.checkPeopleName = checkPeopleName;
    this.checkPeopleIdcard = checkPeopleIdcard;
    this.checkDate = checkDate;
    this.updateName = updateName;
    this.updateIdcard = updateIdcard;
    this.updateDate = updateDate;
    this.isDelete = isDelete;
    this.marriage = marriage;
    this.examinationNumber = examinationNumber;
    this.examinationCode = examinationCode;
    this.examinationName = examinationName;
    this.othercardtype = othercardtype;
    this.othercardno = othercardno;
    this.opEmHpExNo = opEmHpExNo;
    this.opEmHpExMark = opEmHpExMark;
    this.rptCatCode = rptCatCode;
    this.sampDt = sampDt;
    this.acceptDt = acceptDt;
    this.eqptCatCode = eqptCatCode;
    this.eqptNo = eqptNo;
    this.eqptName = eqptName;
    this.testmethod = testmethod;
    this.processStatus = processStatus;
    this.isLimit = isLimit;
    this.gatherDate = gatherDate;
    this.opEmInExMark = opEmInExMark;
    this.visitStatus = visitStatus;
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


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }


  public String getRecordNumber() {
    return recordNumber;
  }

  public void setRecordNumber(String recordNumber) {
    this.recordNumber = recordNumber;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }


  public String getCheckListTitle() {
    return checkListTitle;
  }

  public void setCheckListTitle(String checkListTitle) {
    this.checkListTitle = checkListTitle;
  }


  public String getSampleTypeName() {
    return sampleTypeName;
  }

  public void setSampleTypeName(String sampleTypeName) {
    this.sampleTypeName = sampleTypeName;
  }


  public String getInspectionType() {
    return inspectionType;
  }

  public void setInspectionType(String inspectionType) {
    this.inspectionType = inspectionType;
  }


  public String getHospitalCode() {
    return hospitalCode;
  }

  public void setHospitalCode(String hospitalCode) {
    this.hospitalCode = hospitalCode;
  }


  public String getHospitalName() {
    return hospitalName;
  }

  public void setHospitalName(String hospitalName) {
    this.hospitalName = hospitalName;
  }


  public String getApplyRoomCode() {
    return applyRoomCode;
  }

  public void setApplyRoomCode(String applyRoomCode) {
    this.applyRoomCode = applyRoomCode;
  }


  public String getApplyRoomName() {
    return applyRoomName;
  }

  public void setApplyRoomName(String applyRoomName) {
    this.applyRoomName = applyRoomName;
  }


  public String getApplyPeopleNo() {
    return applyPeopleNo;
  }

  public void setApplyPeopleNo(String applyPeopleNo) {
    this.applyPeopleNo = applyPeopleNo;
  }


  public String getApplyPeopleName() {
    return applyPeopleName;
  }

  public void setApplyPeopleName(String applyPeopleName) {
    this.applyPeopleName = applyPeopleName;
  }


  public String getApplyPeopleIdcard() {
    return applyPeopleIdcard;
  }

  public void setApplyPeopleIdcard(String applyPeopleIdcard) {
    this.applyPeopleIdcard = applyPeopleIdcard;
  }


  public java.sql.Date getApplyDate() {
    return applyDate;
  }

  public void setApplyDate(java.sql.Date applyDate) {
    this.applyDate = applyDate;
  }


  public String getAuditCode() {
    return auditCode;
  }

  public void setAuditCode(String auditCode) {
    this.auditCode = auditCode;
  }


  public String getAuditName() {
    return auditName;
  }

  public void setAuditName(String auditName) {
    this.auditName = auditName;
  }


  public String getAuditIdcard() {
    return auditIdcard;
  }

  public void setAuditIdcard(String auditIdcard) {
    this.auditIdcard = auditIdcard;
  }


  public java.sql.Date getAuditDate() {
    return auditDate;
  }

  public void setAuditDate(java.sql.Date auditDate) {
    this.auditDate = auditDate;
  }


  public String getCheckPeopleCode() {
    return checkPeopleCode;
  }

  public void setCheckPeopleCode(String checkPeopleCode) {
    this.checkPeopleCode = checkPeopleCode;
  }


  public String getCheckPeopleName() {
    return checkPeopleName;
  }

  public void setCheckPeopleName(String checkPeopleName) {
    this.checkPeopleName = checkPeopleName;
  }


  public String getCheckPeopleIdcard() {
    return checkPeopleIdcard;
  }

  public void setCheckPeopleIdcard(String checkPeopleIdcard) {
    this.checkPeopleIdcard = checkPeopleIdcard;
  }


  public java.sql.Date getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(java.sql.Date checkDate) {
    this.checkDate = checkDate;
  }


  public String getUpdateName() {
    return updateName;
  }

  public void setUpdateName(String updateName) {
    this.updateName = updateName;
  }


  public String getUpdateIdcard() {
    return updateIdcard;
  }

  public void setUpdateIdcard(String updateIdcard) {
    this.updateIdcard = updateIdcard;
  }


  public java.sql.Timestamp getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(java.sql.Timestamp updateDate) {
    this.updateDate = updateDate;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }


  public String getMarriage() {
    return marriage;
  }

  public void setMarriage(String marriage) {
    this.marriage = marriage;
  }


  public String getExaminationNumber() {
    return examinationNumber;
  }

  public void setExaminationNumber(String examinationNumber) {
    this.examinationNumber = examinationNumber;
  }


  public String getExaminationCode() {
    return examinationCode;
  }

  public void setExaminationCode(String examinationCode) {
    this.examinationCode = examinationCode;
  }


  public String getExaminationName() {
    return examinationName;
  }

  public void setExaminationName(String examinationName) {
    this.examinationName = examinationName;
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


  public String getOpEmHpExNo() {
    return opEmHpExNo;
  }

  public void setOpEmHpExNo(String opEmHpExNo) {
    this.opEmHpExNo = opEmHpExNo;
  }


  public String getOpEmHpExMark() {
    return opEmHpExMark;
  }

  public void setOpEmHpExMark(String opEmHpExMark) {
    this.opEmHpExMark = opEmHpExMark;
  }


  public String getRptCatCode() {
    return rptCatCode;
  }

  public void setRptCatCode(String rptCatCode) {
    this.rptCatCode = rptCatCode;
  }


  public java.sql.Date getSampDt() {
    return sampDt;
  }

  public void setSampDt(java.sql.Date sampDt) {
    this.sampDt = sampDt;
  }


  public java.sql.Date getAcceptDt() {
    return acceptDt;
  }

  public void setAcceptDt(java.sql.Date acceptDt) {
    this.acceptDt = acceptDt;
  }


  public String getEqptCatCode() {
    return eqptCatCode;
  }

  public void setEqptCatCode(String eqptCatCode) {
    this.eqptCatCode = eqptCatCode;
  }


  public String getEqptNo() {
    return eqptNo;
  }

  public void setEqptNo(String eqptNo) {
    this.eqptNo = eqptNo;
  }


  public String getEqptName() {
    return eqptName;
  }

  public void setEqptName(String eqptName) {
    this.eqptName = eqptName;
  }


  public String getTestmethod() {
    return testmethod;
  }

  public void setTestmethod(String testmethod) {
    this.testmethod = testmethod;
  }


  public String getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(String processStatus) {
    this.processStatus = processStatus;
  }


  public String getIsLimit() {
    return isLimit;
  }

  public void setIsLimit(String isLimit) {
    this.isLimit = isLimit;
  }


  public java.sql.Date getGatherDate() {
    return gatherDate;
  }

  public void setGatherDate(java.sql.Date gatherDate) {
    this.gatherDate = gatherDate;
  }


  public String getOpEmInExMark() {
    return opEmInExMark;
  }

  public void setOpEmInExMark(String opEmInExMark) {
    this.opEmInExMark = opEmInExMark;
  }


  public String getVisitStatus() {
    return visitStatus;
  }

  public void setVisitStatus(String visitStatus) {
    this.visitStatus = visitStatus;
  }

}
