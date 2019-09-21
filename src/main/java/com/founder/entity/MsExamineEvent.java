package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author lyz
 */
public class MsExamineEvent extends BaseEntity{

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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public String getEhrId() {
    return ehrId;
  }

  @Override
  public void setEhrId(String ehrId) {
    this.ehrId = ehrId;
  }


  @Override
  public String getPersonId() {
    return personId;
  }

  @Override
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


  @Override
  public java.sql.Date getGatherDate() {
    return gatherDate;
  }

  @Override
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
