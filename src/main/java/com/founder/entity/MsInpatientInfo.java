package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class MsInpatientInfo extends BaseEntity{

  private String id;
  private String ehrId;
  private String personId;
  private String admissionNo;
  private String healthFileNo;
  private String medicalRecordNo;
  private String inhosCondition;
  private String inhosCount;
  private String inhosStateCode;
  private String inhosDays;
  private String inhosRescueTimes;
  private String inhosRescueSuccessTimes;
  private String inhosConditionCode;
  private String destDeptCode;
  private String destDeptName;
  private String destRoomCode;
  private String destRoomName;
  private String referralHospitalCode;
  private String referralHospitalName;
  private String referralDeptCode;
  private String referralDeptName;
  private String inhosReason;
  private java.sql.Timestamp inhosDate;
  private String name;
  private String gender;
  private String age;
  private java.sql.Date birthday;
  private String marriage;
  private String inhosInfectivityFlag;
  private String inhosCostVisitFlag;
  private String inhosAutopsyFlag;
  private String inhosTeachCaseFlag;
  private String otherMedicalTreatment;
  private String underlyingDeathCode;
  private java.sql.Timestamp deathDate;
  private String sickAreaName;
  private String sickroomNo;
  private String sickbedNo;
  private java.sql.Timestamp pathogenesisDate;
  private String treatmentResultsCode;
  private String relatedPhysicianRoleName;
  private String relatedPhysicianName;
  private String attendingPhysicianNo;
  private String attendingPhysicianName;
  private String attendingPhysicianIdcard;
  private String inhosCostPayCode;
  private String inhosSettlementCode;
  private String personalExpenses;
  private String medicalInsuranceCostSum;
  private String otherSubsidiesCostSum;
  private String inhosCostSum;
  private java.sql.Date outHospitalDate;
  private String fillUserName;
  private String fillUserIdcard;
  private java.sql.Timestamp fillTime;
  private String updateName;
  private String updateIdcard;
  private java.sql.Timestamp updateDate;
  private String isDelete;
  private String othercardtype;
  private String othercardno;
  private String hpSNo;
  private String sourceCode;
  private String providehxName;
  private String relaCode;
  private String ifallerMark;
  private String dialectical;
  private java.sql.Date rcdDt;
  private String processStatus;
  private String isLimit;
  private String isAnalyse;
  private java.sql.Date gatherDate;

  public MsInpatientInfo() {
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


  public String getAdmissionNo() {
    return admissionNo;
  }

  public void setAdmissionNo(String admissionNo) {
    this.admissionNo = admissionNo;
  }


  public String getHealthFileNo() {
    return healthFileNo;
  }

  public void setHealthFileNo(String healthFileNo) {
    this.healthFileNo = healthFileNo;
  }


  public String getMedicalRecordNo() {
    return medicalRecordNo;
  }

  public void setMedicalRecordNo(String medicalRecordNo) {
    this.medicalRecordNo = medicalRecordNo;
  }


  public String getInhosCondition() {
    return inhosCondition;
  }

  public void setInhosCondition(String inhosCondition) {
    this.inhosCondition = inhosCondition;
  }


  public String getInhosCount() {
    return inhosCount;
  }

  public void setInhosCount(String inhosCount) {
    this.inhosCount = inhosCount;
  }


  public String getInhosStateCode() {
    return inhosStateCode;
  }

  public void setInhosStateCode(String inhosStateCode) {
    this.inhosStateCode = inhosStateCode;
  }


  public String getInhosDays() {
    return inhosDays;
  }

  public void setInhosDays(String inhosDays) {
    this.inhosDays = inhosDays;
  }


  public String getInhosRescueTimes() {
    return inhosRescueTimes;
  }

  public void setInhosRescueTimes(String inhosRescueTimes) {
    this.inhosRescueTimes = inhosRescueTimes;
  }


  public String getInhosRescueSuccessTimes() {
    return inhosRescueSuccessTimes;
  }

  public void setInhosRescueSuccessTimes(String inhosRescueSuccessTimes) {
    this.inhosRescueSuccessTimes = inhosRescueSuccessTimes;
  }


  public String getInhosConditionCode() {
    return inhosConditionCode;
  }

  public void setInhosConditionCode(String inhosConditionCode) {
    this.inhosConditionCode = inhosConditionCode;
  }


  public String getDestDeptCode() {
    return destDeptCode;
  }

  public void setDestDeptCode(String destDeptCode) {
    this.destDeptCode = destDeptCode;
  }


  public String getDestDeptName() {
    return destDeptName;
  }

  public void setDestDeptName(String destDeptName) {
    this.destDeptName = destDeptName;
  }


  public String getDestRoomCode() {
    return destRoomCode;
  }

  public void setDestRoomCode(String destRoomCode) {
    this.destRoomCode = destRoomCode;
  }


  public String getDestRoomName() {
    return destRoomName;
  }

  public void setDestRoomName(String destRoomName) {
    this.destRoomName = destRoomName;
  }


  public String getReferralHospitalCode() {
    return referralHospitalCode;
  }

  public void setReferralHospitalCode(String referralHospitalCode) {
    this.referralHospitalCode = referralHospitalCode;
  }


  public String getReferralHospitalName() {
    return referralHospitalName;
  }

  public void setReferralHospitalName(String referralHospitalName) {
    this.referralHospitalName = referralHospitalName;
  }


  public String getReferralDeptCode() {
    return referralDeptCode;
  }

  public void setReferralDeptCode(String referralDeptCode) {
    this.referralDeptCode = referralDeptCode;
  }


  public String getReferralDeptName() {
    return referralDeptName;
  }

  public void setReferralDeptName(String referralDeptName) {
    this.referralDeptName = referralDeptName;
  }


  public String getInhosReason() {
    return inhosReason;
  }

  public void setInhosReason(String inhosReason) {
    this.inhosReason = inhosReason;
  }


  public java.sql.Timestamp getInhosDate() {
    return inhosDate;
  }

  public void setInhosDate(java.sql.Timestamp inhosDate) {
    this.inhosDate = inhosDate;
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


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public String getMarriage() {
    return marriage;
  }

  public void setMarriage(String marriage) {
    this.marriage = marriage;
  }


  public String getInhosInfectivityFlag() {
    return inhosInfectivityFlag;
  }

  public void setInhosInfectivityFlag(String inhosInfectivityFlag) {
    this.inhosInfectivityFlag = inhosInfectivityFlag;
  }


  public String getInhosCostVisitFlag() {
    return inhosCostVisitFlag;
  }

  public void setInhosCostVisitFlag(String inhosCostVisitFlag) {
    this.inhosCostVisitFlag = inhosCostVisitFlag;
  }


  public String getInhosAutopsyFlag() {
    return inhosAutopsyFlag;
  }

  public void setInhosAutopsyFlag(String inhosAutopsyFlag) {
    this.inhosAutopsyFlag = inhosAutopsyFlag;
  }


  public String getInhosTeachCaseFlag() {
    return inhosTeachCaseFlag;
  }

  public void setInhosTeachCaseFlag(String inhosTeachCaseFlag) {
    this.inhosTeachCaseFlag = inhosTeachCaseFlag;
  }


  public String getOtherMedicalTreatment() {
    return otherMedicalTreatment;
  }

  public void setOtherMedicalTreatment(String otherMedicalTreatment) {
    this.otherMedicalTreatment = otherMedicalTreatment;
  }


  public String getUnderlyingDeathCode() {
    return underlyingDeathCode;
  }

  public void setUnderlyingDeathCode(String underlyingDeathCode) {
    this.underlyingDeathCode = underlyingDeathCode;
  }


  public java.sql.Timestamp getDeathDate() {
    return deathDate;
  }

  public void setDeathDate(java.sql.Timestamp deathDate) {
    this.deathDate = deathDate;
  }


  public String getSickAreaName() {
    return sickAreaName;
  }

  public void setSickAreaName(String sickAreaName) {
    this.sickAreaName = sickAreaName;
  }


  public String getSickroomNo() {
    return sickroomNo;
  }

  public void setSickroomNo(String sickroomNo) {
    this.sickroomNo = sickroomNo;
  }


  public String getSickbedNo() {
    return sickbedNo;
  }

  public void setSickbedNo(String sickbedNo) {
    this.sickbedNo = sickbedNo;
  }


  public java.sql.Timestamp getPathogenesisDate() {
    return pathogenesisDate;
  }

  public void setPathogenesisDate(java.sql.Timestamp pathogenesisDate) {
    this.pathogenesisDate = pathogenesisDate;
  }


  public String getTreatmentResultsCode() {
    return treatmentResultsCode;
  }

  public void setTreatmentResultsCode(String treatmentResultsCode) {
    this.treatmentResultsCode = treatmentResultsCode;
  }


  public String getRelatedPhysicianRoleName() {
    return relatedPhysicianRoleName;
  }

  public void setRelatedPhysicianRoleName(String relatedPhysicianRoleName) {
    this.relatedPhysicianRoleName = relatedPhysicianRoleName;
  }


  public String getRelatedPhysicianName() {
    return relatedPhysicianName;
  }

  public void setRelatedPhysicianName(String relatedPhysicianName) {
    this.relatedPhysicianName = relatedPhysicianName;
  }


  public String getAttendingPhysicianNo() {
    return attendingPhysicianNo;
  }

  public void setAttendingPhysicianNo(String attendingPhysicianNo) {
    this.attendingPhysicianNo = attendingPhysicianNo;
  }


  public String getAttendingPhysicianName() {
    return attendingPhysicianName;
  }

  public void setAttendingPhysicianName(String attendingPhysicianName) {
    this.attendingPhysicianName = attendingPhysicianName;
  }


  public String getAttendingPhysicianIdcard() {
    return attendingPhysicianIdcard;
  }

  public void setAttendingPhysicianIdcard(String attendingPhysicianIdcard) {
    this.attendingPhysicianIdcard = attendingPhysicianIdcard;
  }


  public String getInhosCostPayCode() {
    return inhosCostPayCode;
  }

  public void setInhosCostPayCode(String inhosCostPayCode) {
    this.inhosCostPayCode = inhosCostPayCode;
  }


  public String getInhosSettlementCode() {
    return inhosSettlementCode;
  }

  public void setInhosSettlementCode(String inhosSettlementCode) {
    this.inhosSettlementCode = inhosSettlementCode;
  }


  public String getPersonalExpenses() {
    return personalExpenses;
  }

  public void setPersonalExpenses(String personalExpenses) {
    this.personalExpenses = personalExpenses;
  }


  public String getMedicalInsuranceCostSum() {
    return medicalInsuranceCostSum;
  }

  public void setMedicalInsuranceCostSum(String medicalInsuranceCostSum) {
    this.medicalInsuranceCostSum = medicalInsuranceCostSum;
  }


  public String getOtherSubsidiesCostSum() {
    return otherSubsidiesCostSum;
  }

  public void setOtherSubsidiesCostSum(String otherSubsidiesCostSum) {
    this.otherSubsidiesCostSum = otherSubsidiesCostSum;
  }


  public String getInhosCostSum() {
    return inhosCostSum;
  }

  public void setInhosCostSum(String inhosCostSum) {
    this.inhosCostSum = inhosCostSum;
  }


  public java.sql.Date getOutHospitalDate() {
    return outHospitalDate;
  }

  public void setOutHospitalDate(java.sql.Date outHospitalDate) {
    this.outHospitalDate = outHospitalDate;
  }


  public String getFillUserName() {
    return fillUserName;
  }

  public void setFillUserName(String fillUserName) {
    this.fillUserName = fillUserName;
  }


  public String getFillUserIdcard() {
    return fillUserIdcard;
  }

  public void setFillUserIdcard(String fillUserIdcard) {
    this.fillUserIdcard = fillUserIdcard;
  }


  public java.sql.Timestamp getFillTime() {
    return fillTime;
  }

  public void setFillTime(java.sql.Timestamp fillTime) {
    this.fillTime = fillTime;
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


  public String getHpSNo() {
    return hpSNo;
  }

  public void setHpSNo(String hpSNo) {
    this.hpSNo = hpSNo;
  }


  public String getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }


  public String getProvidehxName() {
    return providehxName;
  }

  public void setProvidehxName(String providehxName) {
    this.providehxName = providehxName;
  }


  public String getRelaCode() {
    return relaCode;
  }

  public void setRelaCode(String relaCode) {
    this.relaCode = relaCode;
  }


  public String getIfallerMark() {
    return ifallerMark;
  }

  public void setIfallerMark(String ifallerMark) {
    this.ifallerMark = ifallerMark;
  }


  public String getDialectical() {
    return dialectical;
  }

  public void setDialectical(String dialectical) {
    this.dialectical = dialectical;
  }


  public java.sql.Date getRcdDt() {
    return rcdDt;
  }

  public void setRcdDt(java.sql.Date rcdDt) {
    this.rcdDt = rcdDt;
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
