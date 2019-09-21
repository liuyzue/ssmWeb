package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author F
 */
public class MsDiseaseDiagnosisInfo extends BaseEntity{

  private String id;
  private String ehrId;
  private String personId;
  private String diagnosisCode;
  private String diagnosisDesc;
  private String diagnosisTypeCode;
  private java.sql.Timestamp pathogenesisDate;
  private String primarySite;
  private String secondarySite;
  private String nlohmsiCode;
  private String nlohmsiName;
  private String treatmentPlan;
  private String healthAssessment;
  private String disposalPlan;
  private String hospitalCode;
  private String hospitalName;
  private java.sql.Date diagnoseDate;
  private String diagnoseRoomCode;
  private String diagnoseRoomName;
  private String diagnoseDoctorCode;
  private String diagnoseDoctorName;
  private String diagnoseDoctorIdcard;
  private String updateName;
  private String updateIdcard;
  private java.sql.Timestamp updateDate;
  private String isDelete;
  private String name;
  private String age;
  private String gender;
  private String marriage;
  private String diseaseCode;
  private String diseaseName;
  private String inhosConditionCode;
  private String inhosConditionName;
  private String diagnosisNumber;
  private String initSubsMark;
  private String cmMdisCode;
  private String cmMdisName;
  private String pirncipalDiagnosis;
  private String cmDisName;
  private String cmDisCode;
  private String wmDisName;
  private String analysisStatus;
  private String isLimit;
  private String isAnalyse;
  private java.sql.Date gatherDate;
  private String opEmHpMark;

  public MsDiseaseDiagnosisInfo() {
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


  public String getDiagnosisCode() {
    return diagnosisCode;
  }

  public void setDiagnosisCode(String diagnosisCode) {
    this.diagnosisCode = diagnosisCode;
  }


  public String getDiagnosisDesc() {
    return diagnosisDesc;
  }

  public void setDiagnosisDesc(String diagnosisDesc) {
    this.diagnosisDesc = diagnosisDesc;
  }


  public String getDiagnosisTypeCode() {
    return diagnosisTypeCode;
  }

  public void setDiagnosisTypeCode(String diagnosisTypeCode) {
    this.diagnosisTypeCode = diagnosisTypeCode;
  }


  public java.sql.Timestamp getPathogenesisDate() {
    return pathogenesisDate;
  }

  public void setPathogenesisDate(java.sql.Timestamp pathogenesisDate) {
    this.pathogenesisDate = pathogenesisDate;
  }


  public String getPrimarySite() {
    return primarySite;
  }

  public void setPrimarySite(String primarySite) {
    this.primarySite = primarySite;
  }


  public String getSecondarySite() {
    return secondarySite;
  }

  public void setSecondarySite(String secondarySite) {
    this.secondarySite = secondarySite;
  }


  public String getNlohmsiCode() {
    return nlohmsiCode;
  }

  public void setNlohmsiCode(String nlohmsiCode) {
    this.nlohmsiCode = nlohmsiCode;
  }


  public String getNlohmsiName() {
    return nlohmsiName;
  }

  public void setNlohmsiName(String nlohmsiName) {
    this.nlohmsiName = nlohmsiName;
  }


  public String getTreatmentPlan() {
    return treatmentPlan;
  }

  public void setTreatmentPlan(String treatmentPlan) {
    this.treatmentPlan = treatmentPlan;
  }


  public String getHealthAssessment() {
    return healthAssessment;
  }

  public void setHealthAssessment(String healthAssessment) {
    this.healthAssessment = healthAssessment;
  }


  public String getDisposalPlan() {
    return disposalPlan;
  }

  public void setDisposalPlan(String disposalPlan) {
    this.disposalPlan = disposalPlan;
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


  public java.sql.Date getDiagnoseDate() {
    return diagnoseDate;
  }

  public void setDiagnoseDate(java.sql.Date diagnoseDate) {
    this.diagnoseDate = diagnoseDate;
  }


  public String getDiagnoseRoomCode() {
    return diagnoseRoomCode;
  }

  public void setDiagnoseRoomCode(String diagnoseRoomCode) {
    this.diagnoseRoomCode = diagnoseRoomCode;
  }


  public String getDiagnoseRoomName() {
    return diagnoseRoomName;
  }

  public void setDiagnoseRoomName(String diagnoseRoomName) {
    this.diagnoseRoomName = diagnoseRoomName;
  }


  public String getDiagnoseDoctorCode() {
    return diagnoseDoctorCode;
  }

  public void setDiagnoseDoctorCode(String diagnoseDoctorCode) {
    this.diagnoseDoctorCode = diagnoseDoctorCode;
  }


  public String getDiagnoseDoctorName() {
    return diagnoseDoctorName;
  }

  public void setDiagnoseDoctorName(String diagnoseDoctorName) {
    this.diagnoseDoctorName = diagnoseDoctorName;
  }


  public String getDiagnoseDoctorIdcard() {
    return diagnoseDoctorIdcard;
  }

  public void setDiagnoseDoctorIdcard(String diagnoseDoctorIdcard) {
    this.diagnoseDoctorIdcard = diagnoseDoctorIdcard;
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


  public String getDiseaseCode() {
    return diseaseCode;
  }

  public void setDiseaseCode(String diseaseCode) {
    this.diseaseCode = diseaseCode;
  }


  public String getDiseaseName() {
    return diseaseName;
  }

  public void setDiseaseName(String diseaseName) {
    this.diseaseName = diseaseName;
  }


  public String getInhosConditionCode() {
    return inhosConditionCode;
  }

  public void setInhosConditionCode(String inhosConditionCode) {
    this.inhosConditionCode = inhosConditionCode;
  }


  public String getInhosConditionName() {
    return inhosConditionName;
  }

  public void setInhosConditionName(String inhosConditionName) {
    this.inhosConditionName = inhosConditionName;
  }


  public String getDiagnosisNumber() {
    return diagnosisNumber;
  }

  public void setDiagnosisNumber(String diagnosisNumber) {
    this.diagnosisNumber = diagnosisNumber;
  }


  public String getInitSubsMark() {
    return initSubsMark;
  }

  public void setInitSubsMark(String initSubsMark) {
    this.initSubsMark = initSubsMark;
  }


  public String getCmMdisCode() {
    return cmMdisCode;
  }

  public void setCmMdisCode(String cmMdisCode) {
    this.cmMdisCode = cmMdisCode;
  }


  public String getCmMdisName() {
    return cmMdisName;
  }

  public void setCmMdisName(String cmMdisName) {
    this.cmMdisName = cmMdisName;
  }


  public String getPirncipalDiagnosis() {
    return pirncipalDiagnosis;
  }

  public void setPirncipalDiagnosis(String pirncipalDiagnosis) {
    this.pirncipalDiagnosis = pirncipalDiagnosis;
  }


  public String getCmDisName() {
    return cmDisName;
  }

  public void setCmDisName(String cmDisName) {
    this.cmDisName = cmDisName;
  }


  public String getCmDisCode() {
    return cmDisCode;
  }

  public void setCmDisCode(String cmDisCode) {
    this.cmDisCode = cmDisCode;
  }


  public String getWmDisName() {
    return wmDisName;
  }

  public void setWmDisName(String wmDisName) {
    this.wmDisName = wmDisName;
  }


  public String getAnalysisStatus() {
    return analysisStatus;
  }

  public void setAnalysisStatus(String analysisStatus) {
    this.analysisStatus = analysisStatus;
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


  public String getOpEmHpMark() {
    return opEmHpMark;
  }

  public void setOpEmHpMark(String opEmHpMark) {
    this.opEmHpMark = opEmHpMark;
  }

}
