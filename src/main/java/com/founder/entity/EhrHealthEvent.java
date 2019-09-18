package com.founder.entity;


import java.sql.Date;

/**
 * @author lyz
 */

public class EhrHealthEvent {

  private String id;
  private String ehrId;
  private String ehrName;
  private String physicalExamType;
  private String personId;
  private String name;
  private String age;
  private String marriage;
  private String ehrType;
  private String diseaseCode;
  private String diseaseName;
  private String clinicYear;
  private String clinicMonth;
  private java.sql.Date clinicDate;
  private String createOrganCode;
  private String createOrganName;
  private String createRoomCode;
  private String createRoomName;
  private java.sql.Date createDate;
  private String createPerson;
  private String createIdcard;
  private String updateOrganCode;
  private String updateOrganName;
  private String updateRoomCode;
  private String updateRoomName;
  private java.sql.Date updateDate;
  private String updateName;
  private String updateIdcard;
  private String clinicOrganCode;
  private String clinicOrganName;
  private String clinicRoomCode;
  private String clinicRoomName;
  private String isDelete;
  private String gender;
  private String dataSource;
  private String ehrOldPepoleFlag;
  private String isLimit;
  private java.sql.Date gatherDate;
  private String idCard;

  public EhrHealthEvent(){

  }

  public EhrHealthEvent(String id, String ehrId, String ehrName, String physicalExamType, String personId, String name, String age, String marriage, String ehrType, String diseaseCode, String diseaseName, String clinicYear, String clinicMonth, Date clinicDate, String createOrganCode, String createOrganName, String createRoomCode, String createRoomName, Date createDate, String createPerson, String createIdcard, String updateOrganCode, String updateOrganName, String updateRoomCode, String updateRoomName, Date updateDate, String updateName, String updateIdcard, String clinicOrganCode, String clinicOrganName, String clinicRoomCode, String clinicRoomName, String isDelete, String gender, String dataSource, String ehrOldPepoleFlag, String isLimit, Date gatherDate, String idCard) {
    this.id = id;
    this.ehrId = ehrId;
    this.ehrName = ehrName;
    this.physicalExamType = physicalExamType;
    this.personId = personId;
    this.name = name;
    this.age = age;
    this.marriage = marriage;
    this.ehrType = ehrType;
    this.diseaseCode = diseaseCode;
    this.diseaseName = diseaseName;
    this.clinicYear = clinicYear;
    this.clinicMonth = clinicMonth;
    this.clinicDate = clinicDate;
    this.createOrganCode = createOrganCode;
    this.createOrganName = createOrganName;
    this.createRoomCode = createRoomCode;
    this.createRoomName = createRoomName;
    this.createDate = createDate;
    this.createPerson = createPerson;
    this.createIdcard = createIdcard;
    this.updateOrganCode = updateOrganCode;
    this.updateOrganName = updateOrganName;
    this.updateRoomCode = updateRoomCode;
    this.updateRoomName = updateRoomName;
    this.updateDate = updateDate;
    this.updateName = updateName;
    this.updateIdcard = updateIdcard;
    this.clinicOrganCode = clinicOrganCode;
    this.clinicOrganName = clinicOrganName;
    this.clinicRoomCode = clinicRoomCode;
    this.clinicRoomName = clinicRoomName;
    this.isDelete = isDelete;
    this.gender = gender;
    this.dataSource = dataSource;
    this.ehrOldPepoleFlag = ehrOldPepoleFlag;
    this.isLimit = isLimit;
    this.gatherDate = gatherDate;
    this.idCard = idCard;
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


  public String getEhrName() {
    return ehrName;
  }

  public void setEhrName(String ehrName) {
    this.ehrName = ehrName;
  }


  public String getPhysicalExamType() {
    return physicalExamType;
  }

  public void setPhysicalExamType(String physicalExamType) {
    this.physicalExamType = physicalExamType;
  }


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
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


  public String getMarriage() {
    return marriage;
  }

  public void setMarriage(String marriage) {
    this.marriage = marriage;
  }


  public String getEhrType() {
    return ehrType;
  }

  public void setEhrType(String ehrType) {
    this.ehrType = ehrType;
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


  public String getClinicYear() {
    return clinicYear;
  }

  public void setClinicYear(String clinicYear) {
    this.clinicYear = clinicYear;
  }


  public String getClinicMonth() {
    return clinicMonth;
  }

  public void setClinicMonth(String clinicMonth) {
    this.clinicMonth = clinicMonth;
  }


  public java.sql.Date getClinicDate() {
    return clinicDate;
  }

  public void setClinicDate(java.sql.Date clinicDate) {
    this.clinicDate = clinicDate;
  }


  public String getCreateOrganCode() {
    return createOrganCode;
  }

  public void setCreateOrganCode(String createOrganCode) {
    this.createOrganCode = createOrganCode;
  }


  public String getCreateOrganName() {
    return createOrganName;
  }

  public void setCreateOrganName(String createOrganName) {
    this.createOrganName = createOrganName;
  }


  public String getCreateRoomCode() {
    return createRoomCode;
  }

  public void setCreateRoomCode(String createRoomCode) {
    this.createRoomCode = createRoomCode;
  }


  public String getCreateRoomName() {
    return createRoomName;
  }

  public void setCreateRoomName(String createRoomName) {
    this.createRoomName = createRoomName;
  }


  public java.sql.Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Date createDate) {
    this.createDate = createDate;
  }


  public String getCreatePerson() {
    return createPerson;
  }

  public void setCreatePerson(String createPerson) {
    this.createPerson = createPerson;
  }


  public String getCreateIdcard() {
    return createIdcard;
  }

  public void setCreateIdcard(String createIdcard) {
    this.createIdcard = createIdcard;
  }


  public String getUpdateOrganCode() {
    return updateOrganCode;
  }

  public void setUpdateOrganCode(String updateOrganCode) {
    this.updateOrganCode = updateOrganCode;
  }


  public String getUpdateOrganName() {
    return updateOrganName;
  }

  public void setUpdateOrganName(String updateOrganName) {
    this.updateOrganName = updateOrganName;
  }


  public String getUpdateRoomCode() {
    return updateRoomCode;
  }

  public void setUpdateRoomCode(String updateRoomCode) {
    this.updateRoomCode = updateRoomCode;
  }


  public String getUpdateRoomName() {
    return updateRoomName;
  }

  public void setUpdateRoomName(String updateRoomName) {
    this.updateRoomName = updateRoomName;
  }


  public java.sql.Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(java.sql.Date updateDate) {
    this.updateDate = updateDate;
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


  public String getClinicRoomCode() {
    return clinicRoomCode;
  }

  public void setClinicRoomCode(String clinicRoomCode) {
    this.clinicRoomCode = clinicRoomCode;
  }


  public String getClinicRoomName() {
    return clinicRoomName;
  }

  public void setClinicRoomName(String clinicRoomName) {
    this.clinicRoomName = clinicRoomName;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }


  public String getEhrOldPepoleFlag() {
    return ehrOldPepoleFlag;
  }

  public void setEhrOldPepoleFlag(String ehrOldPepoleFlag) {
    this.ehrOldPepoleFlag = ehrOldPepoleFlag;
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


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  @Override
  public String toString() {
    return "EhrHealthEvent{" +
            "id='" + id + '\'' +
            ", ehrId='" + ehrId + '\'' +
            ", ehrName='" + ehrName + '\'' +
            ", physicalExamType='" + physicalExamType + '\'' +
            ", personId='" + personId + '\'' +
            ", name='" + name + '\'' +
            ", age='" + age + '\'' +
            ", marriage='" + marriage + '\'' +
            ", ehrType='" + ehrType + '\'' +
            ", diseaseCode='" + diseaseCode + '\'' +
            ", diseaseName='" + diseaseName + '\'' +
            ", clinicYear='" + clinicYear + '\'' +
            ", clinicMonth='" + clinicMonth + '\'' +
            ", clinicDate=" + clinicDate +
            ", createOrganCode='" + createOrganCode + '\'' +
            ", createOrganName='" + createOrganName + '\'' +
            ", createRoomCode='" + createRoomCode + '\'' +
            ", createRoomName='" + createRoomName + '\'' +
            ", createDate=" + createDate +
            ", createPerson='" + createPerson + '\'' +
            ", createIdcard='" + createIdcard + '\'' +
            ", updateOrganCode='" + updateOrganCode + '\'' +
            ", updateOrganName='" + updateOrganName + '\'' +
            ", updateRoomCode='" + updateRoomCode + '\'' +
            ", updateRoomName='" + updateRoomName + '\'' +
            ", updateDate=" + updateDate +
            ", updateName='" + updateName + '\'' +
            ", updateIdcard='" + updateIdcard + '\'' +
            ", clinicOrganCode='" + clinicOrganCode + '\'' +
            ", clinicOrganName='" + clinicOrganName + '\'' +
            ", clinicRoomCode='" + clinicRoomCode + '\'' +
            ", clinicRoomName='" + clinicRoomName + '\'' +
            ", isDelete='" + isDelete + '\'' +
            ", gender='" + gender + '\'' +
            ", dataSource='" + dataSource + '\'' +
            ", ehrOldPepoleFlag='" + ehrOldPepoleFlag + '\'' +
            ", isLimit='" + isLimit + '\'' +
            ", gatherDate=" + gatherDate +
            ", idCard='" + idCard + '\'' +
            '}';
  }
}