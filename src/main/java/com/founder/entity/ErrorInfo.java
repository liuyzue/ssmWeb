package com.founder.entity;


import java.util.Date;

/**
 * @author F
 */
public class ErrorInfo {

  private String id;
  private String sqlText;
  private String tableName;
  /**
   * 错误类型 1：关联性错误  2：
   */
  private String resultType;
  private Date uploadDate;
  private Date checkDate;
  private String personId;
  private String ehrId;

  public ErrorInfo() {
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


  public Date getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(Date uploadDate) {
    this.uploadDate = uploadDate;
  }


  public Date getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(Date checkDate) {
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

  @Override
  public String toString() {
    return "ErrorInfo{" +
            "id='" + id + '\'' +
            ", sqlText='" + sqlText + '\'' +
            ", tableName='" + tableName + '\'' +
            ", resultType='" + resultType + '\'' +
            ", uploadDate=" + uploadDate +
            ", checkDate=" + checkDate +
            ", personId='" + personId + '\'' +
            ", ehrId='" + ehrId + '\'' +
            '}';
  }
}
