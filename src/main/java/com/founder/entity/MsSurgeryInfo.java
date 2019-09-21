package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class MsSurgeryInfo extends BaseEntity{

  private String id;
  private String ehrId;
  private String personId;
  private String hospitalCode;
  private String hospitalName;
  private String anesthesiaMethodCode;
  private String anesthesiaMethodName;
  private String anesthesiaDoctorCode;
  private String anesthesiaDoctorName;
  private String anesthesiaDoctorIdcard;
  private String incisionHealingGradeCode;
  private String incisionHealingGradeName;
  private String opertationCode;
  private String opertationName;
  private String opertationDesc;
  private String opertationTargetCode;
  private String opertationTargetName;
  private String operatorCode;
  private String operatorName;
  private String operationUnitName;
  private String operatorIdcard;
  private java.sql.Timestamp opertationDate;
  private String operationLevelName;
  private String operationAssistantOne;
  private String operationAssistantTwo;
  private String isDelete;
  private String name;
  private String age;
  private String gender;
  private String marriage;
  private String processStatus;
  private String applyNo;
  private java.sql.Date beginTime;
  private java.sql.Date endTime;
  private String analysisStatus;
  private String opEmHpMark;
  private String isLimit;
  private String isAnalyse;
  private java.sql.Date gatherDate;

  public MsSurgeryInfo() {
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


  public String getAnesthesiaMethodCode() {
    return anesthesiaMethodCode;
  }

  public void setAnesthesiaMethodCode(String anesthesiaMethodCode) {
    this.anesthesiaMethodCode = anesthesiaMethodCode;
  }


  public String getAnesthesiaMethodName() {
    return anesthesiaMethodName;
  }

  public void setAnesthesiaMethodName(String anesthesiaMethodName) {
    this.anesthesiaMethodName = anesthesiaMethodName;
  }


  public String getAnesthesiaDoctorCode() {
    return anesthesiaDoctorCode;
  }

  public void setAnesthesiaDoctorCode(String anesthesiaDoctorCode) {
    this.anesthesiaDoctorCode = anesthesiaDoctorCode;
  }


  public String getAnesthesiaDoctorName() {
    return anesthesiaDoctorName;
  }

  public void setAnesthesiaDoctorName(String anesthesiaDoctorName) {
    this.anesthesiaDoctorName = anesthesiaDoctorName;
  }


  public String getAnesthesiaDoctorIdcard() {
    return anesthesiaDoctorIdcard;
  }

  public void setAnesthesiaDoctorIdcard(String anesthesiaDoctorIdcard) {
    this.anesthesiaDoctorIdcard = anesthesiaDoctorIdcard;
  }


  public String getIncisionHealingGradeCode() {
    return incisionHealingGradeCode;
  }

  public void setIncisionHealingGradeCode(String incisionHealingGradeCode) {
    this.incisionHealingGradeCode = incisionHealingGradeCode;
  }


  public String getIncisionHealingGradeName() {
    return incisionHealingGradeName;
  }

  public void setIncisionHealingGradeName(String incisionHealingGradeName) {
    this.incisionHealingGradeName = incisionHealingGradeName;
  }


  public String getOpertationCode() {
    return opertationCode;
  }

  public void setOpertationCode(String opertationCode) {
    this.opertationCode = opertationCode;
  }


  public String getOpertationName() {
    return opertationName;
  }

  public void setOpertationName(String opertationName) {
    this.opertationName = opertationName;
  }


  public String getOpertationDesc() {
    return opertationDesc;
  }

  public void setOpertationDesc(String opertationDesc) {
    this.opertationDesc = opertationDesc;
  }


  public String getOpertationTargetCode() {
    return opertationTargetCode;
  }

  public void setOpertationTargetCode(String opertationTargetCode) {
    this.opertationTargetCode = opertationTargetCode;
  }


  public String getOpertationTargetName() {
    return opertationTargetName;
  }

  public void setOpertationTargetName(String opertationTargetName) {
    this.opertationTargetName = opertationTargetName;
  }


  public String getOperatorCode() {
    return operatorCode;
  }

  public void setOperatorCode(String operatorCode) {
    this.operatorCode = operatorCode;
  }


  public String getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
  }


  public String getOperationUnitName() {
    return operationUnitName;
  }

  public void setOperationUnitName(String operationUnitName) {
    this.operationUnitName = operationUnitName;
  }


  public String getOperatorIdcard() {
    return operatorIdcard;
  }

  public void setOperatorIdcard(String operatorIdcard) {
    this.operatorIdcard = operatorIdcard;
  }


  public java.sql.Timestamp getOpertationDate() {
    return opertationDate;
  }

  public void setOpertationDate(java.sql.Timestamp opertationDate) {
    this.opertationDate = opertationDate;
  }


  public String getOperationLevelName() {
    return operationLevelName;
  }

  public void setOperationLevelName(String operationLevelName) {
    this.operationLevelName = operationLevelName;
  }


  public String getOperationAssistantOne() {
    return operationAssistantOne;
  }

  public void setOperationAssistantOne(String operationAssistantOne) {
    this.operationAssistantOne = operationAssistantOne;
  }


  public String getOperationAssistantTwo() {
    return operationAssistantTwo;
  }

  public void setOperationAssistantTwo(String operationAssistantTwo) {
    this.operationAssistantTwo = operationAssistantTwo;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getMarriage() {
    return marriage;
  }

  public void setMarriage(String marriage) {
    this.marriage = marriage;
  }


  public String getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(String processStatus) {
    this.processStatus = processStatus;
  }


  public String getApplyNo() {
    return applyNo;
  }

  public void setApplyNo(String applyNo) {
    this.applyNo = applyNo;
  }


  public java.sql.Date getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(java.sql.Date beginTime) {
    this.beginTime = beginTime;
  }


  public java.sql.Date getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Date endTime) {
    this.endTime = endTime;
  }


  public String getAnalysisStatus() {
    return analysisStatus;
  }

  public void setAnalysisStatus(String analysisStatus) {
    this.analysisStatus = analysisStatus;
  }


  public String getOpEmHpMark() {
    return opEmHpMark;
  }

  public void setOpEmHpMark(String opEmHpMark) {
    this.opEmHpMark = opEmHpMark;
  }


  public String getIsLimit() {
    return isLimit;
  }

  public void setIsLimit(String isLimit) {
    this.isLimit = isLimit;
  }


  public String getIsAnalyse() {
    return isAnalyse;
  }

  public void setIsAnalyse(String isAnalyse) {
    this.isAnalyse = isAnalyse;
  }


  @Override
  public java.sql.Date getGatherDate() {
    return gatherDate;
  }

  @Override
  public void setGatherDate(java.sql.Date gatherDate) {
    this.gatherDate = gatherDate;
  }

}
