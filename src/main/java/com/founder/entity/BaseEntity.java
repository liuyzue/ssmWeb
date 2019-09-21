package com.founder.entity;

import java.sql.Date;

/**
 * @author create by lyz
 * @version: v1.0
 * @description: com.founder.entity
 * @date:2019/9/19
 * @time:0:14
 */
public class BaseEntity {
    private String personId;
    private String ehrId;
    private java.sql.Date gatherDate;

    public Date getGatherDate() {
        return gatherDate;
    }

    public void setGatherDate(Date gatherDate) {
        this.gatherDate = gatherDate;
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
