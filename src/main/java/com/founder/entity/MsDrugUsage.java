package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class MsDrugUsage {

  private String id;
  private String ehrId;
  private String personId;
  private String admissionNo;
  private String referralHospitalCode;
  private String referralHospitalName;
  private String name;
  private String gender;
  private String age;
  private String cmType;
  private String drugType;
  private String drugDosage;
  private String drugUseDays;
  private String drugUseFrequency;
  private String drugUseDoseUnit;
  private String drugUseTotalDose;
  private String drugUseRouteCode;
  private java.sql.Timestamp startDate;
  private java.sql.Timestamp stopDate;
  private String drugGenericName;
  private String drugTradeName;
  private String drugSpecifications;
  private String doctorAdvice;
  private String productionUnitName;
  private String executeMark;
  private String executeFrequency;
  private String executeResult;
  private String unitPrice;
  private String subtotal;
  private String remarks;
  private String fillUserName;
  private String fillUserIdcard;
  private java.sql.Timestamp fillTime;
  private String updateName;
  private String updateIdcard;
  private java.sql.Timestamp updateDate;
  private String recordNumber;
  private String isDelete;
  private String marriage;
  private String medicationCompliance;
  private String medicationComplianceName;
  private String drugUseRouteName;
  private String baseDrugCode;
  private String internalDrugCode;
  private String drugMedicareCode;
  private String drugAgriculturalCode;
  private String quantityUnit;
  private String quantity;
  private String drugUseDose;
  private String drugUseState;
  private java.sql.Date clinicDate;
  private String doctorNo;
  private String doctorName;
  private String clinicMark;
  private String expenseType;
  private String batchNo;
  private String ifCharge;
  private java.sql.Date beginTime;
  private java.sql.Date odrisuDt;
  private String odrType;
  private java.sql.Date stopDt;
  private String stpdocIdcard;
  private String processStatus;
  private String isLimit;
  private String baseDrugFlag;
  private String antibioticFlag;
  private String antibacterialsFlag;
  private java.sql.Date gatherDate;
  private String narcoticFlag;
  private String toxicFlag;

  public MsDrugUsage() {
  }

  public MsDrugUsage(String id, String ehrId, String personId, String admissionNo, String referralHospitalCode, String referralHospitalName, String name, String gender, String age, String cmType, String drugType, String drugDosage, String drugUseDays, String drugUseFrequency, String drugUseDoseUnit, String drugUseTotalDose, String drugUseRouteCode, Timestamp startDate, Timestamp stopDate, String drugGenericName, String drugTradeName, String drugSpecifications, String doctorAdvice, String productionUnitName, String executeMark, String executeFrequency, String executeResult, String unitPrice, String subtotal, String remarks, String fillUserName, String fillUserIdcard, Timestamp fillTime, String updateName, String updateIdcard, Timestamp updateDate, String recordNumber, String isDelete, String marriage, String medicationCompliance, String medicationComplianceName, String drugUseRouteName, String baseDrugCode, String internalDrugCode, String drugMedicareCode, String drugAgriculturalCode, String quantityUnit, String quantity, String drugUseDose, String drugUseState, Date clinicDate, String doctorNo, String doctorName, String clinicMark, String expenseType, String batchNo, String ifCharge, Date beginTime, Date odrisuDt, String odrType, Date stopDt, String stpdocIdcard, String processStatus, String isLimit, String baseDrugFlag, String antibioticFlag, String antibacterialsFlag, Date gatherDate, String narcoticFlag, String toxicFlag) {
    this.id = id;
    this.ehrId = ehrId;
    this.personId = personId;
    this.admissionNo = admissionNo;
    this.referralHospitalCode = referralHospitalCode;
    this.referralHospitalName = referralHospitalName;
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.cmType = cmType;
    this.drugType = drugType;
    this.drugDosage = drugDosage;
    this.drugUseDays = drugUseDays;
    this.drugUseFrequency = drugUseFrequency;
    this.drugUseDoseUnit = drugUseDoseUnit;
    this.drugUseTotalDose = drugUseTotalDose;
    this.drugUseRouteCode = drugUseRouteCode;
    this.startDate = startDate;
    this.stopDate = stopDate;
    this.drugGenericName = drugGenericName;
    this.drugTradeName = drugTradeName;
    this.drugSpecifications = drugSpecifications;
    this.doctorAdvice = doctorAdvice;
    this.productionUnitName = productionUnitName;
    this.executeMark = executeMark;
    this.executeFrequency = executeFrequency;
    this.executeResult = executeResult;
    this.unitPrice = unitPrice;
    this.subtotal = subtotal;
    this.remarks = remarks;
    this.fillUserName = fillUserName;
    this.fillUserIdcard = fillUserIdcard;
    this.fillTime = fillTime;
    this.updateName = updateName;
    this.updateIdcard = updateIdcard;
    this.updateDate = updateDate;
    this.recordNumber = recordNumber;
    this.isDelete = isDelete;
    this.marriage = marriage;
    this.medicationCompliance = medicationCompliance;
    this.medicationComplianceName = medicationComplianceName;
    this.drugUseRouteName = drugUseRouteName;
    this.baseDrugCode = baseDrugCode;
    this.internalDrugCode = internalDrugCode;
    this.drugMedicareCode = drugMedicareCode;
    this.drugAgriculturalCode = drugAgriculturalCode;
    this.quantityUnit = quantityUnit;
    this.quantity = quantity;
    this.drugUseDose = drugUseDose;
    this.drugUseState = drugUseState;
    this.clinicDate = clinicDate;
    this.doctorNo = doctorNo;
    this.doctorName = doctorName;
    this.clinicMark = clinicMark;
    this.expenseType = expenseType;
    this.batchNo = batchNo;
    this.ifCharge = ifCharge;
    this.beginTime = beginTime;
    this.odrisuDt = odrisuDt;
    this.odrType = odrType;
    this.stopDt = stopDt;
    this.stpdocIdcard = stpdocIdcard;
    this.processStatus = processStatus;
    this.isLimit = isLimit;
    this.baseDrugFlag = baseDrugFlag;
    this.antibioticFlag = antibioticFlag;
    this.antibacterialsFlag = antibacterialsFlag;
    this.gatherDate = gatherDate;
    this.narcoticFlag = narcoticFlag;
    this.toxicFlag = toxicFlag;
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


  public String getAdmissionNo() {
    return admissionNo;
  }

  public void setAdmissionNo(String admissionNo) {
    this.admissionNo = admissionNo;
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


  public String getDrugDosage() {
    return drugDosage;
  }

  public void setDrugDosage(String drugDosage) {
    this.drugDosage = drugDosage;
  }


  public String getDrugUseDays() {
    return drugUseDays;
  }

  public void setDrugUseDays(String drugUseDays) {
    this.drugUseDays = drugUseDays;
  }


  public String getDrugUseFrequency() {
    return drugUseFrequency;
  }

  public void setDrugUseFrequency(String drugUseFrequency) {
    this.drugUseFrequency = drugUseFrequency;
  }


  public String getDrugUseDoseUnit() {
    return drugUseDoseUnit;
  }

  public void setDrugUseDoseUnit(String drugUseDoseUnit) {
    this.drugUseDoseUnit = drugUseDoseUnit;
  }


  public String getDrugUseTotalDose() {
    return drugUseTotalDose;
  }

  public void setDrugUseTotalDose(String drugUseTotalDose) {
    this.drugUseTotalDose = drugUseTotalDose;
  }


  public String getDrugUseRouteCode() {
    return drugUseRouteCode;
  }

  public void setDrugUseRouteCode(String drugUseRouteCode) {
    this.drugUseRouteCode = drugUseRouteCode;
  }


  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }


  public java.sql.Timestamp getStopDate() {
    return stopDate;
  }

  public void setStopDate(java.sql.Timestamp stopDate) {
    this.stopDate = stopDate;
  }


  public String getDrugGenericName() {
    return drugGenericName;
  }

  public void setDrugGenericName(String drugGenericName) {
    this.drugGenericName = drugGenericName;
  }


  public String getDrugTradeName() {
    return drugTradeName;
  }

  public void setDrugTradeName(String drugTradeName) {
    this.drugTradeName = drugTradeName;
  }


  public String getDrugSpecifications() {
    return drugSpecifications;
  }

  public void setDrugSpecifications(String drugSpecifications) {
    this.drugSpecifications = drugSpecifications;
  }


  public String getDoctorAdvice() {
    return doctorAdvice;
  }

  public void setDoctorAdvice(String doctorAdvice) {
    this.doctorAdvice = doctorAdvice;
  }


  public String getProductionUnitName() {
    return productionUnitName;
  }

  public void setProductionUnitName(String productionUnitName) {
    this.productionUnitName = productionUnitName;
  }


  public String getExecuteMark() {
    return executeMark;
  }

  public void setExecuteMark(String executeMark) {
    this.executeMark = executeMark;
  }


  public String getExecuteFrequency() {
    return executeFrequency;
  }

  public void setExecuteFrequency(String executeFrequency) {
    this.executeFrequency = executeFrequency;
  }


  public String getExecuteResult() {
    return executeResult;
  }

  public void setExecuteResult(String executeResult) {
    this.executeResult = executeResult;
  }


  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }


  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
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


  public String getRecordNumber() {
    return recordNumber;
  }

  public void setRecordNumber(String recordNumber) {
    this.recordNumber = recordNumber;
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


  public String getMedicationCompliance() {
    return medicationCompliance;
  }

  public void setMedicationCompliance(String medicationCompliance) {
    this.medicationCompliance = medicationCompliance;
  }


  public String getMedicationComplianceName() {
    return medicationComplianceName;
  }

  public void setMedicationComplianceName(String medicationComplianceName) {
    this.medicationComplianceName = medicationComplianceName;
  }


  public String getDrugUseRouteName() {
    return drugUseRouteName;
  }

  public void setDrugUseRouteName(String drugUseRouteName) {
    this.drugUseRouteName = drugUseRouteName;
  }


  public String getBaseDrugCode() {
    return baseDrugCode;
  }

  public void setBaseDrugCode(String baseDrugCode) {
    this.baseDrugCode = baseDrugCode;
  }


  public String getInternalDrugCode() {
    return internalDrugCode;
  }

  public void setInternalDrugCode(String internalDrugCode) {
    this.internalDrugCode = internalDrugCode;
  }


  public String getDrugMedicareCode() {
    return drugMedicareCode;
  }

  public void setDrugMedicareCode(String drugMedicareCode) {
    this.drugMedicareCode = drugMedicareCode;
  }


  public String getDrugAgriculturalCode() {
    return drugAgriculturalCode;
  }

  public void setDrugAgriculturalCode(String drugAgriculturalCode) {
    this.drugAgriculturalCode = drugAgriculturalCode;
  }


  public String getQuantityUnit() {
    return quantityUnit;
  }

  public void setQuantityUnit(String quantityUnit) {
    this.quantityUnit = quantityUnit;
  }


  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  public String getDrugUseDose() {
    return drugUseDose;
  }

  public void setDrugUseDose(String drugUseDose) {
    this.drugUseDose = drugUseDose;
  }


  public String getDrugUseState() {
    return drugUseState;
  }

  public void setDrugUseState(String drugUseState) {
    this.drugUseState = drugUseState;
  }


  public java.sql.Date getClinicDate() {
    return clinicDate;
  }

  public void setClinicDate(java.sql.Date clinicDate) {
    this.clinicDate = clinicDate;
  }


  public String getDoctorNo() {
    return doctorNo;
  }

  public void setDoctorNo(String doctorNo) {
    this.doctorNo = doctorNo;
  }


  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }


  public String getClinicMark() {
    return clinicMark;
  }

  public void setClinicMark(String clinicMark) {
    this.clinicMark = clinicMark;
  }


  public String getExpenseType() {
    return expenseType;
  }

  public void setExpenseType(String expenseType) {
    this.expenseType = expenseType;
  }


  public String getBatchNo() {
    return batchNo;
  }

  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public String getIfCharge() {
    return ifCharge;
  }

  public void setIfCharge(String ifCharge) {
    this.ifCharge = ifCharge;
  }


  public java.sql.Date getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(java.sql.Date beginTime) {
    this.beginTime = beginTime;
  }


  public java.sql.Date getOdrisuDt() {
    return odrisuDt;
  }

  public void setOdrisuDt(java.sql.Date odrisuDt) {
    this.odrisuDt = odrisuDt;
  }


  public String getOdrType() {
    return odrType;
  }

  public void setOdrType(String odrType) {
    this.odrType = odrType;
  }


  public java.sql.Date getStopDt() {
    return stopDt;
  }

  public void setStopDt(java.sql.Date stopDt) {
    this.stopDt = stopDt;
  }


  public String getStpdocIdcard() {
    return stpdocIdcard;
  }

  public void setStpdocIdcard(String stpdocIdcard) {
    this.stpdocIdcard = stpdocIdcard;
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


  public String getBaseDrugFlag() {
    return baseDrugFlag;
  }

  public void setBaseDrugFlag(String baseDrugFlag) {
    this.baseDrugFlag = baseDrugFlag;
  }


  public String getAntibioticFlag() {
    return antibioticFlag;
  }

  public void setAntibioticFlag(String antibioticFlag) {
    this.antibioticFlag = antibioticFlag;
  }


  public String getAntibacterialsFlag() {
    return antibacterialsFlag;
  }

  public void setAntibacterialsFlag(String antibacterialsFlag) {
    this.antibacterialsFlag = antibacterialsFlag;
  }


  public java.sql.Date getGatherDate() {
    return gatherDate;
  }

  public void setGatherDate(java.sql.Date gatherDate) {
    this.gatherDate = gatherDate;
  }


  public String getNarcoticFlag() {
    return narcoticFlag;
  }

  public void setNarcoticFlag(String narcoticFlag) {
    this.narcoticFlag = narcoticFlag;
  }


  public String getToxicFlag() {
    return toxicFlag;
  }

  public void setToxicFlag(String toxicFlag) {
    this.toxicFlag = toxicFlag;
  }

}
