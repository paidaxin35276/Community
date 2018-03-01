package com.community.entity;

import java.util.Date;

public class Option_logEntity {
    private Integer id;

    private String optionContents;

    private Integer optionType;

    private Date optionTime;

    private Integer optionWho;

    private Integer isdelete;

    public Option_logEntity(Integer id, String optionContents, Integer optionType, Date optionTime, Integer optionWho, Integer isdelete) {
        this.id = id;
        this.optionContents = optionContents;
        this.optionType = optionType;
        this.optionTime = optionTime;
        this.optionWho = optionWho;
        this.isdelete = isdelete;
    }

    public Option_logEntity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptionContents() {
        return optionContents;
    }

    public void setOptionContents(String optionContents) {
        this.optionContents = optionContents;
    }

    public Integer getOptionType() {
        return optionType;
    }

    public void setOptionType(Integer optionType) {
        this.optionType = optionType;
    }

    public Date getOptionTime() {
        return optionTime;
    }

    public void setOptionTime(Date optionTime) {
        this.optionTime = optionTime;
    }

    public Integer getOptionWho() {
        return optionWho;
    }

    public void setOptionWho(Integer optionWho) {
        this.optionWho = optionWho;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}