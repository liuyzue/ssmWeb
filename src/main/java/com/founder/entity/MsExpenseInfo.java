package com.founder.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class MsExpenseInfo {

  private String id;
  private String ehrId;
  private String personId;
  private String recordNumber;
  private String payBarCode;
  private String hospitalCode;
  private String hospitalName;
  private String costTypeCode;
  private String costTypeName;
  private String medicalPayWay;
  private String medicalPayWayName;
  private String otherDesc;
  private String medicalSettlementWayCode;
  private String medicalSettlementWayName;
  private String totalCost;
  private String personalExpenses;
  private String medicalInsuranceCostSum;
  private String otherSubsidiesCostSum;
  private java.sql.Timestamp settlementDate;
  private String isDelete;
  private String name;
  private String age;
  private String gender;
  private String marriage;
  private String costNumber;
  private String othercardtype;
  private String othercardno;
  private String opEmHpMark;
  private String opEmHpNo;
  private String rcdIdcard;
  private String invoiceNo;
  private String accountNo;
  private String processStatus;
  private String isLimit;
  private java.sql.Date gatherDate;

  public MsExpenseInfo() {
  }

  public MsExpenseInfo(String id, String ehrId, String personId, String recordNumber, String payBarCode, String hospitalCode, String hospitalName, String costTypeCode, String costTypeName, String medicalPayWay, String medicalPayWayName, String otherDesc, String medicalSettlementWayCode, String medicalSettlementWayName, String totalCost, String personalExpenses, String medicalInsuranceCostSum, String otherSubsidiesCostSum, Timestamp settlementDate, String isDelete, String name, String age, String gender, String marriage, String costNumber, String othercardtype, String othercardno, String opEmHpMark, String opEmHpNo, String rcdIdcard, String invoiceNo, String accountNo, String processStatus, String isLimit, Date gatherDate) {
    this.id = id;
    this.ehrId = ehrId;
    this.personId = personId;
    this.recordNumber = recordNumber;
    this.payBarCode = payBarCode;
    this.hospitalCode = hospitalCode;
    this.hospitalName = hospitalName;
    this.costTypeCode = costTypeCode;
    this.costTypeName = costTypeName;
    this.medicalPayWay = medicalPayWay;
    this.medicalPayWayName = medicalPayWayName;
    this.otherDesc = otherDesc;
    this.medicalSettlementWayCode = medicalSettlementWayCode;
    this.medicalSettlementWayName = medicalSettlementWayName;
    this.totalCost = totalCost;
    this.personalExpenses = personalExpenses;
    this.medicalInsuranceCostSum = medicalInsuranceCostSum;
    this.otherSubsidiesCostSum = otherSubsidiesCostSum;
    this.settlementDate = settlementDate;
    this.isDelete = isDelete;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.marriage = marriage;
    this.costNumber = costNumber;
    this.othercardtype = othercardtype;
    this.othercardno = othercardno;
    this.opEmHpMark = opEmHpMark;
    this.opEmHpNo = opEmHpNo;
    this.rcdIdcard = rcdIdcard;
    this.invoiceNo = invoiceNo;
    this.accountNo = accountNo;
    this.processStatus = processStatus;
    this.isLimit = isLimit;
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


  public String getRecordNumber() {
    return recordNumber;
  }

  public void setRecordNumber(String recordNumber) {
    this.recordNumber = recordNumber;
  }


  public String getPayBarCode() {
    return payBarCode;
  }

  public void setPayBarCode(String payBarCode) {
    this.payBarCode = payBarCode;
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


  public String getCostTypeCode() {
    return costTypeCode;
  }

  public void setCostTypeCode(String costTypeCode) {
    this.costTypeCode = costTypeCode;
  }


  public String getCostTypeName() {
    return costTypeName;
  }

  public void setCostTypeName(String costTypeName) {
    this.costTypeName = costTypeName;
  }


  public String getMedicalPayWay() {
    return medicalPayWay;
  }

  public void setMedicalPayWay(String medicalPayWay) {
    this.medicalPayWay = medicalPayWay;
  }


  public String getMedicalPayWayName() {
    return medicalPayWayName;
  }

  public void setMedicalPayWayName(String medicalPayWayName) {
    this.medicalPayWayName = medicalPayWayName;
  }


  public String getOtherDesc() {
    return otherDesc;
  }

  public void setOtherDesc(String otherDesc) {
    this.otherDesc = otherDesc;
  }


  public String getMedicalSettlementWayCode() {
    return medicalSettlementWayCode;
  }

  public void setMedicalSettlementWayCode(String medicalSettlementWayCode) {
    this.medicalSettlementWayCode = medicalSettlementWayCode;
  }


  public String getMedicalSettlementWayName() {
    return medicalSettlementWayName;
  }

  public void setMedicalSettlementWayName(String medicalSettlementWayName) {
    this.medicalSettlementWayName = medicalSettlementWayName;
  }


  public String getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(String totalCost) {
    this.totalCost = totalCost;
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


  public java.sql.Timestamp getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(java.sql.Timestamp settlementDate) {
    this.settlementDate = settlementDate;
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


  public String getCostNumber() {
    return costNumber;
  }

  public void setCostNumber(String costNumber) {
    this.costNumber = costNumber;
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


  public String getOpEmHpNo() {
    return opEmHpNo;
  }

  public void setOpEmHpNo(String opEmHpNo) {
    this.opEmHpNo = opEmHpNo;
  }


  public String getRcdIdcard() {
    return rcdIdcard;
  }

  public void setRcdIdcard(String rcdIdcard) {
    this.rcdIdcard = rcdIdcard;
  }


  public String getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
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

}
