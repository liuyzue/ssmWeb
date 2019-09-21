package com.founder.entity;


import java.sql.Date;

/**
 * @author F
 */
public class MsExpenseDetail extends BaseEntity{

  private String id;
  private String ehrId;
  private String personId;
  private String recordNumber;
  private String hospitalCode;
  private String hospitalName;
  private String chargeCode;
  private String detailItemCode;
  private String detailItemName;
  private String detailItemUnit;
  private String detailItemPrice;
  private String detailItemQuantity;
  private String detailItemAmount;
  private String medicalInsuranceCostSum;
  private String personalExpenses;
  private String isDelete;
  private String costNumber;
  private String totalCost;
  private String admissionNo;
  private String medicareCode;
  private java.sql.Date clinicDate;
  private String clinicMark;
  private String expenseType;
  private String batchNo;
  private java.sql.Date createDate;
  private String isClose;
  private java.sql.Date gatherDate;

  public MsExpenseDetail() {
  }

  public MsExpenseDetail(String id, String ehrId, String personId, String recordNumber, String hospitalCode, String hospitalName, String chargeCode, String detailItemCode, String detailItemName, String detailItemUnit, String detailItemPrice, String detailItemQuantity, String detailItemAmount, String medicalInsuranceCostSum, String personalExpenses, String isDelete, String costNumber, String totalCost, String admissionNo, String medicareCode, Date clinicDate, String clinicMark, String expenseType, String batchNo, Date createDate, String isClose, Date gatherDate) {
    this.id = id;
    this.ehrId = ehrId;
    this.personId = personId;
    this.recordNumber = recordNumber;
    this.hospitalCode = hospitalCode;
    this.hospitalName = hospitalName;
    this.chargeCode = chargeCode;
    this.detailItemCode = detailItemCode;
    this.detailItemName = detailItemName;
    this.detailItemUnit = detailItemUnit;
    this.detailItemPrice = detailItemPrice;
    this.detailItemQuantity = detailItemQuantity;
    this.detailItemAmount = detailItemAmount;
    this.medicalInsuranceCostSum = medicalInsuranceCostSum;
    this.personalExpenses = personalExpenses;
    this.isDelete = isDelete;
    this.costNumber = costNumber;
    this.totalCost = totalCost;
    this.admissionNo = admissionNo;
    this.medicareCode = medicareCode;
    this.clinicDate = clinicDate;
    this.clinicMark = clinicMark;
    this.expenseType = expenseType;
    this.batchNo = batchNo;
    this.createDate = createDate;
    this.isClose = isClose;
    this.gatherDate = gatherDate;
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


  public String getChargeCode() {
    return chargeCode;
  }

  public void setChargeCode(String chargeCode) {
    this.chargeCode = chargeCode;
  }


  public String getDetailItemCode() {
    return detailItemCode;
  }

  public void setDetailItemCode(String detailItemCode) {
    this.detailItemCode = detailItemCode;
  }


  public String getDetailItemName() {
    return detailItemName;
  }

  public void setDetailItemName(String detailItemName) {
    this.detailItemName = detailItemName;
  }


  public String getDetailItemUnit() {
    return detailItemUnit;
  }

  public void setDetailItemUnit(String detailItemUnit) {
    this.detailItemUnit = detailItemUnit;
  }


  public String getDetailItemPrice() {
    return detailItemPrice;
  }

  public void setDetailItemPrice(String detailItemPrice) {
    this.detailItemPrice = detailItemPrice;
  }


  public String getDetailItemQuantity() {
    return detailItemQuantity;
  }

  public void setDetailItemQuantity(String detailItemQuantity) {
    this.detailItemQuantity = detailItemQuantity;
  }


  public String getDetailItemAmount() {
    return detailItemAmount;
  }

  public void setDetailItemAmount(String detailItemAmount) {
    this.detailItemAmount = detailItemAmount;
  }


  public String getMedicalInsuranceCostSum() {
    return medicalInsuranceCostSum;
  }

  public void setMedicalInsuranceCostSum(String medicalInsuranceCostSum) {
    this.medicalInsuranceCostSum = medicalInsuranceCostSum;
  }


  public String getPersonalExpenses() {
    return personalExpenses;
  }

  public void setPersonalExpenses(String personalExpenses) {
    this.personalExpenses = personalExpenses;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }


  public String getCostNumber() {
    return costNumber;
  }

  public void setCostNumber(String costNumber) {
    this.costNumber = costNumber;
  }


  public String getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(String totalCost) {
    this.totalCost = totalCost;
  }


  public String getAdmissionNo() {
    return admissionNo;
  }

  public void setAdmissionNo(String admissionNo) {
    this.admissionNo = admissionNo;
  }


  public String getMedicareCode() {
    return medicareCode;
  }

  public void setMedicareCode(String medicareCode) {
    this.medicareCode = medicareCode;
  }


  public java.sql.Date getClinicDate() {
    return clinicDate;
  }

  public void setClinicDate(java.sql.Date clinicDate) {
    this.clinicDate = clinicDate;
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


  public java.sql.Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Date createDate) {
    this.createDate = createDate;
  }


  public String getIsClose() {
    return isClose;
  }

  public void setIsClose(String isClose) {
    this.isClose = isClose;
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
