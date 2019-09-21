package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class MsOuthospitalSummary extends BaseEntity{

  private String id;
  private String ehrId;
  private String personId;
  private String recordNumber;
  private String admissionNo;
  private String medicalRecordNo;
  private String idcardHos;
  private String name;
  private String gender;
  private String age;
  private String hospitalCode;
  private String hospitalName;
  private String departmentCode;
  private String departmentName;
  private String sickAreaName;
  private String sickroomNo;
  private String sickbedNo;
  private java.sql.Timestamp inhosDate;
  private String inhosCondition;
  private String aeResult;
  private String treatmentProcessDesc;
  private String outhosState;
  private String outhosSymptomBodyFeature;
  private String outhosAdvice;
  private java.sql.Date outhosDate;
  private String actualAdmissionDayTimes;
  private java.sql.Timestamp signatureDate;
  private String isDelete;
  private String marriage;
  private String occupation;
  private String occupationName;
  private String inhosState;
  private String doctorSignature;
  private java.sql.Timestamp doctorSignatureDate;
  private String attendingDoctorSignature;
  private java.sql.Timestamp attendingSignatureDate;
  private String icdCode;
  private String othercardtype;
  private String othercardno;
  private String hpSNo;
  private String woundHeal;
  private String dptCode;
  private java.sql.Date rcdDt;
  private String hpCurPro;
  private String processStatus;
  private String isLimit;
  private java.sql.Date gatherDate;

  public MsOuthospitalSummary() {
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


  public String getAdmissionNo() {
    return admissionNo;
  }

  public void setAdmissionNo(String admissionNo) {
    this.admissionNo = admissionNo;
  }


  public String getMedicalRecordNo() {
    return medicalRecordNo;
  }

  public void setMedicalRecordNo(String medicalRecordNo) {
    this.medicalRecordNo = medicalRecordNo;
  }


  public String getIdcardHos() {
    return idcardHos;
  }

  public void setIdcardHos(String idcardHos) {
    this.idcardHos = idcardHos;
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


  public String getDepartmentCode() {
    return departmentCode;
  }

  public void setDepartmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
  }


  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
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


  public java.sql.Timestamp getInhosDate() {
    return inhosDate;
  }

  public void setInhosDate(java.sql.Timestamp inhosDate) {
    this.inhosDate = inhosDate;
  }


  public String getInhosCondition() {
    return inhosCondition;
  }

  public void setInhosCondition(String inhosCondition) {
    this.inhosCondition = inhosCondition;
  }


  public String getAeResult() {
    return aeResult;
  }

  public void setAeResult(String aeResult) {
    this.aeResult = aeResult;
  }


  public String getTreatmentProcessDesc() {
    return treatmentProcessDesc;
  }

  public void setTreatmentProcessDesc(String treatmentProcessDesc) {
    this.treatmentProcessDesc = treatmentProcessDesc;
  }


  public String getOuthosState() {
    return outhosState;
  }

  public void setOuthosState(String outhosState) {
    this.outhosState = outhosState;
  }


  public String getOuthosSymptomBodyFeature() {
    return outhosSymptomBodyFeature;
  }

  public void setOuthosSymptomBodyFeature(String outhosSymptomBodyFeature) {
    this.outhosSymptomBodyFeature = outhosSymptomBodyFeature;
  }


  public String getOuthosAdvice() {
    return outhosAdvice;
  }

  public void setOuthosAdvice(String outhosAdvice) {
    this.outhosAdvice = outhosAdvice;
  }


  public java.sql.Date getOuthosDate() {
    return outhosDate;
  }

  public void setOuthosDate(java.sql.Date outhosDate) {
    this.outhosDate = outhosDate;
  }


  public String getActualAdmissionDayTimes() {
    return actualAdmissionDayTimes;
  }

  public void setActualAdmissionDayTimes(String actualAdmissionDayTimes) {
    this.actualAdmissionDayTimes = actualAdmissionDayTimes;
  }


  public java.sql.Timestamp getSignatureDate() {
    return signatureDate;
  }

  public void setSignatureDate(java.sql.Timestamp signatureDate) {
    this.signatureDate = signatureDate;
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


  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }


  public String getOccupationName() {
    return occupationName;
  }

  public void setOccupationName(String occupationName) {
    this.occupationName = occupationName;
  }


  public String getInhosState() {
    return inhosState;
  }

  public void setInhosState(String inhosState) {
    this.inhosState = inhosState;
  }


  public String getDoctorSignature() {
    return doctorSignature;
  }

  public void setDoctorSignature(String doctorSignature) {
    this.doctorSignature = doctorSignature;
  }


  public java.sql.Timestamp getDoctorSignatureDate() {
    return doctorSignatureDate;
  }

  public void setDoctorSignatureDate(java.sql.Timestamp doctorSignatureDate) {
    this.doctorSignatureDate = doctorSignatureDate;
  }


  public String getAttendingDoctorSignature() {
    return attendingDoctorSignature;
  }

  public void setAttendingDoctorSignature(String attendingDoctorSignature) {
    this.attendingDoctorSignature = attendingDoctorSignature;
  }


  public java.sql.Timestamp getAttendingSignatureDate() {
    return attendingSignatureDate;
  }

  public void setAttendingSignatureDate(java.sql.Timestamp attendingSignatureDate) {
    this.attendingSignatureDate = attendingSignatureDate;
  }


  public String getIcdCode() {
    return icdCode;
  }

  public void setIcdCode(String icdCode) {
    this.icdCode = icdCode;
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


  public String getWoundHeal() {
    return woundHeal;
  }

  public void setWoundHeal(String woundHeal) {
    this.woundHeal = woundHeal;
  }


  public String getDptCode() {
    return dptCode;
  }

  public void setDptCode(String dptCode) {
    this.dptCode = dptCode;
  }


  public java.sql.Date getRcdDt() {
    return rcdDt;
  }

  public void setRcdDt(java.sql.Date rcdDt) {
    this.rcdDt = rcdDt;
  }


  public String getHpCurPro() {
    return hpCurPro;
  }

  public void setHpCurPro(String hpCurPro) {
    this.hpCurPro = hpCurPro;
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

}
