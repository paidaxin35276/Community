package com.community.entity;

import java.util.Date;

public class Work_logEntity {
    private Integer id;

    private Integer userId;

    private String workDate;

    private String workLoh;

    private Date createTime;

    private Date editTime;

    private Integer isdelete;

    public Work_logEntity(Integer id, Integer userId, String workDate, String workLoh, Date createTime, Date editTime, Integer isdelete) {
        this.id = id;
        this.userId = userId;
        this.workDate = workDate;
        this.workLoh = workLoh;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    public Work_logEntity() {
        super();
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}