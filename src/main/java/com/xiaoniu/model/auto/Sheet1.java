package com.xiaoniu.model.auto;

import javax.persistence.*;

public class Sheet1 {
    @Column(name = "industryDisplayName")
    private String industrydisplayname;

    @Column(name = "dimType")
    private String dimtype;

    private String count;

    @Column(name = "ruleId")
    private String ruleid;

    /**
     * @return industryDisplayName
     */
    public String getIndustrydisplayname() {
        return industrydisplayname;
    }

    /**
     * @param industrydisplayname
     */
    public void setIndustrydisplayname(String industrydisplayname) {
        this.industrydisplayname = industrydisplayname;
    }

    /**
     * @return dimType
     */
    public String getDimtype() {
        return dimtype;
    }

    /**
     * @param dimtype
     */
    public void setDimtype(String dimtype) {
        this.dimtype = dimtype;
    }

    /**
     * @return count
     */
    public String getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * @return ruleId
     */
    public String getRuleid() {
        return ruleid;
    }

    /**
     * @param ruleid
     */
    public void setRuleid(String ruleid) {
        this.ruleid = ruleid;
    }
}