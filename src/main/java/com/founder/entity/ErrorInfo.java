package com.founder.entity;


import java.sql.Date;

public class ErrorInfo {

  private String id;
  private String sqlText;
  private String tableName;
  private String resultType;
  private java.sql.Date uploadDate;
  private java.sql.Date checkDate;
  private String personId;
  private String ehrId;

  public ErrorInfo() {
  }

  public ErrorInfo(String id, String sqlText, String tableName, String resultType, Date uploadDate, Date checkDate, String personId, String ehrId) {
    this.id = id;
    this.sqlText = sqlText;
    this.tableName = tableName;
    this.resultType = resultType;
    this.uploadDate = uploadDate;
    this.checkDate = checkDate;
    this.personId = personId;
    this.ehrId = ehrId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getSqlText() {
    return sqlText;
  }

  public void setSqlText(String sqlText) {
    this.sqlText = sqlText;
  }


  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  public String getResultType() {
    return resultType;
  }

  public void setResultType(String resultType) {
    this.resultType = resultType;
  }


  public java.sql.Date getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(java.sql.Date uploadDate) {
    this.uploadDate = uploadDate;
  }


  public java.sql.Date getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(java.sql.Date checkDate) {
    this.checkDate = checkDate;
  }


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }


  public String getEhrId() {
    return ehrId;
  }

  public void setEhrId(String ehrId) {
    this.ehrId = ehrId;
  }

}
