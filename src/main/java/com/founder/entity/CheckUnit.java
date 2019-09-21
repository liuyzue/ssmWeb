package com.founder.entity;

import java.sql.Date;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.entity
 * @date:2019/9/19
 * @time:15:50
 */
public class CheckUnit {
    private String ehrId;
    private String personId;
    private java.sql.Date gatherDate;
    private String baseTableName;
    private String targetTableName;

    public CheckUnit() {
    }

    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
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

    public Date getGatherDate() {
        return gatherDate;
    }

    public void setGatherDate(Date gatherDate) {
        this.gatherDate = gatherDate;
    }

    public String getBaseTableName() {
        return baseTableName;
    }

    public void setBaseTableName(String baseTableName) {
        this.baseTableName = baseTableName;
    }
}
