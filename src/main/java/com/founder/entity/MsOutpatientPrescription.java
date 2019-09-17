package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class MsOutpatientPrescription {

  private String id;
  private String ehrId;
  private String personId;
  private String outpatientNo;
  private String recordNumber;
  private String name;
  private String gender;
  private String age;
  private String hospitalCode;
  private String hospitalName;
  private String prescribeRoomCode;
  private String prescribeRoomName;
  private String cmType;
  private String drugType;
  private String drugTypeName;
  private String prescriptionNote;
  private String prescriptionTotalCost;
  private String prescribeDoctorNo;
  private String prescribeDoctorName;
  private String prescribeDoctorIdcard;
  private java.sql.Timestamp prescribeDate;
  private String fillUserName;
  private String fillUserIdcard;
  private java.sql.Timestamp fillTime;
  private String updateName;
  private String updateIdcard;
  private java.sql.Timestamp updateDate;
  private String isDelete;
  private String marriage;
  private String othercardtype;
  private String othercardno;
  private String opEmHpMark;
  private String ifCharge;
  private String ifDispense;
  private String tcmDecoct;
  private String tcmUse;
  private String tcmOdrno;
  private String processStatus;
  private String isLimit;
  private String antibioticFlag;
  private java.sql.Date gatherDate;

  public MsOutpatientPrescription() {
  }

  public MsOutpatientPrescription(String id, String ehrId, String personId, String outpatientNo, String recordNumber, String name, String gender, String age, String hospitalCode, String hospitalName, String prescribeRoomCode, String prescribeRoomName, String cmType, String drugType, String drugTypeName, String prescriptionNote, String prescriptionTotalCost, String prescribeDoctorNo, String prescribeDoctorName, String prescribeDoctorIdcard, Timestamp prescribeDate, String fillUserName, String fillUserIdcard, Timestamp fillTime, String updateName, String updateIdcard, Timestamp updateDate, String isDelete, String marriage, String othercardtype, String othercardno, String opEmHpMark, String ifCharge, String ifDispense, String tcmDecoct, String tcmUse, String tcmOdrno, String processStatus, String isLimit, String antibioticFlag, Date gatherDate) {
    this.id = id;
    this.ehrId = ehrId;
    this.personId = personId;
    this.outpatientNo = outpatientNo;
    this.recordNumber = recordNumber;
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.hospitalCode = hospitalCode;
    this.hospitalName = hospitalName;
    this.prescribeRoomCode = prescribeRoomCode;
    this.prescribeRoomName = prescribeRoomName;
    this.cmType = cmType;
    this.drugType = drugType;
    this.drugTypeName = drugTypeName;
    this.prescriptionNote = prescriptionNote;
    this.prescriptionTotalCost = prescriptionTotalCost;
    this.prescribeDoctorNo = prescribeDoctorNo;
    this.prescribeDoctorName = prescribeDoctorName;
    this.prescribeDoctorIdcard = prescribeDoctorIdcard;
    this.prescribeDate = prescribeDate;
    this.fillUserName = fillUserName;
    this.fillUserIdcard = fillUserIdcard;
    this.fillTime = fillTime;
    this.updateName = updateName;
    this.updateIdcard = updateIdcard;
    this.updateDate = updateDate;
    this.isDelete = isDelete;
    this.marriage = marriage;
    this.othercardtype = othercardtype;
    this.othercardno = othercardno;
    this.opEmHpMark = opEmHpMark;
    this.ifCharge = ifCharge;
    this.ifDispense = ifDispense;
    this.tcmDecoct = tcmDecoct;
    this.tcmUse = tcmUse;
    this.tcmOdrno = tcmOdrno;
    this.processStatus = processStatus;
    this.isLimit = isLimit;
    this.antibioticFlag = antibioticFlag;
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


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }


  public String getOutpatientNo() {
    return outpatientNo;
  }

  public void setOutpatientNo(String outpatientNo) {
    this.outpatientNo = outpatientNo;
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


  public String getPrescribeRoomCode() {
    return prescribeRoomCode;
  }

  public void setPrescribeRoomCode(String prescribeRoomCode) {
    this.prescribeRoomCode = prescribeRoomCode;
  }


  public String getPrescribeRoomName() {
    return prescribeRoomName;
  }

  public void setPrescribeRoomName(String prescribeRoomName) {
    this.prescribeRoomName = prescribeRoomName;
  }


  public String getCmType() {
    return cmType;
  }

  public void setCmType(String cmType) {
    this.cmType = cmType;
  }


  public String getDrugType() {
    return drugType;
  }

  public void setDrugType(String drugType) {
    this.drugType = drugType;
  }


  public String getDrugTypeName() {
    return drugTypeName;
  }

  public void setDrugTypeName(String drugTypeName) {
    this.drugTypeName = drugTypeName;
  }


  public String getPrescriptionNote() {
    return prescriptionNote;
  }

  public void setPrescriptionNote(String prescriptionNote) {
    this.prescriptionNote = prescriptionNote;
  }


  public String getPrescriptionTotalCost() {
    return prescriptionTotalCost;
  }

  public void setPrescriptionTotalCost(String prescriptionTotalCost) {
    this.prescriptionTotalCost = prescriptionTotalCost;
  }


  public String getPrescribeDoctorNo() {
    return prescribeDoctorNo;
  }

  public void setPrescribeDoctorNo(String prescribeDoctorNo) {
    this.prescribeDoctorNo = prescribeDoctorNo;
  }


  public String getPrescribeDoctorName() {
    return prescribeDoctorName;
  }

  public void setPrescribeDoctorName(String prescribeDoctorName) {
    this.prescribeDoctorName = prescribeDoctorName;
  }


  public String getPrescribeDoctorIdcard() {
    return prescribeDoctorIdcard;
  }

  public void setPrescribeDoctorIdcard(String prescribeDoctorIdcard) {
    this.prescribeDoctorIdcard = prescribeDoctorIdcard;
  }


  public java.sql.Timestamp getPrescribeDate() {
    return prescribeDate;
  }

  public void setPrescribeDate(java.sql.Timestamp prescribeDate) {
    this.prescribeDate = prescribeDate;
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


  public String getMarriage() {
    return marriage;
  }

  public void setMarriage(String marriage) {
    this.marriage = marriage;
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


  public String getOpEmHpMark() {
    return opEmHpMark;
  }

  public void setOpEmHpMark(String opEmHpMark) {
    this.opEmHpMark = opEmHpMark;
  }


  public String getIfCharge() {
    return ifCharge;
  }

  public void setIfCharge(String ifCharge) {
    this.ifCharge = ifCharge;
  }


  public String getIfDispense() {
    return ifDispense;
  }

  public void setIfDispense(String ifDispense) {
    this.ifDispense = ifDispense;
  }


  public String getTcmDecoct() {
    return tcmDecoct;
  }

  public void setTcmDecoct(String tcmDecoct) {
    this.tcmDecoct = tcmDecoct;
  }


  public String getTcmUse() {
    return tcmUse;
  }

  public void setTcmUse(String tcmUse) {
    this.tcmUse = tcmUse;
  }


  public String getTcmOdrno() {
    return tcmOdrno;
  }

  public void setTcmOdrno(String tcmOdrno) {
    this.tcmOdrno = tcmOdrno;
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


  public String getAntibioticFlag() {
    return antibioticFlag;
  }

  public void setAntibioticFlag(String antibioticFlag) {
    this.antibioticFlag = antibioticFlag;
  }


  public java.sql.Date getGatherDate() {
    return gatherDate;
  }

  public void setGatherDate(java.sql.Date gatherDate) {
    this.gatherDate = gatherDate;
  }

}
