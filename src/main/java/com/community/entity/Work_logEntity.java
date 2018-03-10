package com.community.entity;

import java.util.Date;

public class Work_logEntity {
    private Integer id;

    private Integer userId;

    private String workDate;

    private String workLoh;

    private String createTime;

    private String editTime;

    private Integer isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getWorkLoh() {
        return workLoh;
    }

    public void setWorkLoh(String workLoh) {
        this.workLoh = workLoh;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Work_logEntity() {
    }

    public Work_logEntity(Integer userId, String workDate, String workLoh, String createTime, String editTime, Integer isdelete) {
        this.userId = userId;
        this.workDate = workDate;
        this.workLoh = workLoh;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    public Work_logEntity(Integer id, Integer userId, String workDate, String workLoh, String createTime, String editTime, Integer isdelete) {
        this.id = id;
        this.userId = userId;
        this.workDate = workDate;
        this.workLoh = workLoh;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "Work_logEntity{" +
                "id=" + id +
                ", userId=" + userId +
                ", workDate='" + workDate + '\'' +
                ", workLoh='" + workLoh + '\'' +
                ", createTime='" + createTime + '\'' +
                ", editTime='" + editTime + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }
}