package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class MsOutpatientInfo  extends BaseEntity{

  private String id;
  private String ehrId;
  private String personId;
  private String outpatientNo;
  private String healthFileNo;
  private String clinicRecordNo;
  private String reportCardTypeCode;
  private String recordNumber;
  private String clinicOrganCode;
  private String clinicOrganName;
  private String medicalRoomCode;
  private String medicalRoomName;
  private java.sql.Date clinicDate;
  private String clinicPeopleName;
  private String gender;
  private String age;
  private java.sql.Date birthday;
  private String marriage;
  private String chiefComplaint;
  private String consultationQuestion;
  private String healthServicesRequires;
  private java.sql.Timestamp pathogenesisDate;
  private String otherMedicalTreatment;
  private String medicalCostPayWay;
  private String outpatientCostAccountsWay;
  private String outpatientCostTypeCode;
  private String outpatientCostTypeName;
  private String outpatientCostSum;
  private String personalExpenses;
  private String medicalInsuranceCostSum;
  private String otherSubsidiesCostSum;
  private String manaDoctorNo;
  private String manaDoctorName;
  private String manaDoctorIdcard;
  private String fillUserName;
  private String fillUserIdcard;
  private java.sql.Timestamp fillTime;
  private String updateName;
  private String updateIdcard;
  private java.sql.Timestamp updateDate;
  private String isDelete;
  private String outpatientType;
  private String mainSymptoms;
  private String processStatus;
  private String visitStatus;
  private String isLimit;
  private String observedPatientFlag;
  private String prescriptionCount;
  private String prescriptionRouteCount;
  private java.sql.Date gatherDate;

  public MsOutpatientInfo() {
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


  public String getOutpatientNo() {
    return outpatientNo;
  }

  public void setOutpatientNo(String outpatientNo) {
    this.outpatientNo = outpatientNo;
  }


  public String getHealthFileNo() {
    return healthFileNo;
  }

  public void setHealthFileNo(String healthFileNo) {
    this.healthFileNo = healthFileNo;
  }


  public String getClinicRecordNo() {
    return clinicRecordNo;
  }

  public void setClinicRecordNo(String clinicRecordNo) {
    this.clinicRecordNo = clinicRecordNo;
  }


  public String getReportCardTypeCode() {
    return reportCardTypeCode;
  }

  public void setReportCardTypeCode(String reportCardTypeCode) {
    this.reportCardTypeCode = reportCardTypeCode;
  }


  public String getRecordNumber() {
    return recordNumber;
  }

  public void setRecordNumber(String recordNumber) {
    this.recordNumber = recordNumber;
  }


  public String getClinicOrganCode() {
    return clinicOrganCode;
  }

  public void setClinicOrganCode(String clinicOrganCode) {
    this.clinicOrganCode = clinicOrganCode;
  }


  public String getClinicOrganName() {
    return clinicOrganName;
  }

  public void setClinicOrganName(String clinicOrganName) {
    this.clinicOrganName = clinicOrganName;
  }


  public String getMedicalRoomCode() {
    return medicalRoomCode;
  }

  public void setMedicalRoomCode(String medicalRoomCode) {
    this.medicalRoomCode = medicalRoomCode;
  }


  public String getMedicalRoomName() {
    return medicalRoomName;
  }

  public void setMedicalRoomName(String medicalRoomName) {
    this.medicalRoomName = medicalRoomName;
  }


  public java.sql.Date getClinicDate() {
    return clinicDate;
  }

  public void setClinicDate(java.sql.Date clinicDate) {
    this.clinicDate = clinicDate;
  }


  public String getClinicPeopleName() {
    return clinicPeopleName;
  }

  public void setClinicPeopleName(String clinicPeopleName) {
    this.clinicPeopleName = clinicPeopleName;
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


  public String getChiefComplaint() {
    return chiefComplaint;
  }

  public void setChiefComplaint(String chiefComplaint) {
    this.chiefComplaint = chiefComplaint;
  }


  public String getConsultationQuestion() {
    return consultationQuestion;
  }

  public void setConsultationQuestion(String consultationQuestion) {
    this.consultationQuestion = consultationQuestion;
  }


  public String getHealthServicesRequires() {
    return healthServicesRequires;
  }

  public void setHealthServicesRequires(String healthServicesRequires) {
    this.healthServicesRequires = healthServicesRequires;
  }


  public java.sql.Timestamp getPathogenesisDate() {
    return pathogenesisDate;
  }

  public void setPathogenesisDate(java.sql.Timestamp pathogenesisDate) {
    this.pathogenesisDate = pathogenesisDate;
  }


  public String getOtherMedicalTreatment() {
    return otherMedicalTreatment;
  }

  public void setOtherMedicalTreatment(String otherMedicalTreatment) {
    this.otherMedicalTreatment = otherMedicalTreatment;
  }


  public String getMedicalCostPayWay() {
    return medicalCostPayWay;
  }

  public void setMedicalCostPayWay(String medicalCostPayWay) {
    this.medicalCostPayWay = medicalCostPayWay;
  }


  public String getOutpatientCostAccountsWay() {
    return outpatientCostAccountsWay;
  }

  public void setOutpatientCostAccountsWay(String outpatientCostAccountsWay) {
    this.outpatientCostAccountsWay = outpatientCostAccountsWay;
  }


  public String getOutpatientCostTypeCode() {
    return outpatientCostTypeCode;
  }

  public void setOutpatientCostTypeCode(String outpatientCostTypeCode) {
    this.outpatientCostTypeCode = outpatientCostTypeCode;
  }


  public String getOutpatientCostTypeName() {
    return outpatientCostTypeName;
  }

  public void setOutpatientCostTypeName(String outpatientCostTypeName) {
    this.outpatientCostTypeName = outpatientCostTypeName;
  }


  public String getOutpatientCostSum() {
    return outpatientCostSum;
  }

  public void setOutpatientCostSum(String outpatientCostSum) {
    this.outpatientCostSum = outpatientCostSum;
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


  public String getManaDoctorNo() {
    return manaDoctorNo;
  }

  public void setManaDoctorNo(String manaDoctorNo) {
    this.manaDoctorNo = manaDoctorNo;
  }


  public String getManaDoctorName() {
    return manaDoctorName;
  }

  public void setManaDoctorName(String manaDoctorName) {
    this.manaDoctorName = manaDoctorName;
  }


  public String getManaDoctorIdcard() {
    return manaDoctorIdcard;
  }

  public void setManaDoctorIdcard(String manaDoctorIdcard) {
    this.manaDoctorIdcard = manaDoctorIdcard;
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


  public String getOutpatientType() {
    return outpatientType;
  }

  public void setOutpatientType(String outpatientType) {
    this.outpatientType = outpatientType;
  }


  public String getMainSymptoms() {
    return mainSymptoms;
  }

  public void setMainSymptoms(String mainSymptoms) {
    this.mainSymptoms = mainSymptoms;
  }


  public String getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(String processStatus) {
    this.processStatus = processStatus;
  }


  public String getVisitStatus() {
    return visitStatus;
  }

  public void setVisitStatus(String visitStatus) {
    this.visitStatus = visitStatus;
  }


  public String getIsLimit() {
    return isLimit;
  }

  public void setIsLimit(String isLimit) {
    this.isLimit = isLimit;
  }


  public String getObservedPatientFlag() {
    return observedPatientFlag;
  }

  public void setObservedPatientFlag(String observedPatientFlag) {
    this.observedPatientFlag = observedPatientFlag;
  }


  public String getPrescriptionCount() {
    return prescriptionCount;
  }

  public void setPrescriptionCount(String prescriptionCount) {
    this.prescriptionCount = prescriptionCount;
  }


  public String getPrescriptionRouteCount() {
    return prescriptionRouteCount;
  }

  public void setPrescriptionRouteCount(String prescriptionRouteCount) {
    this.prescriptionRouteCount = prescriptionRouteCount;
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
