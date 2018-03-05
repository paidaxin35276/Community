package com.community.entity;

import java.util.Date;

public class Moring_readingEntity {
    private Integer id;

    private Integer userId;

    private Date readingTime;

    private String readingContent;

    private Date createTime;

    private Date editTime;

    private Integer isdelete;

    public Moring_readingEntity(Integer id, Integer userId, Date readingTime, String readingContent, Date createTime, Date editTime, Integer isdelete) {
        this.id = id;
        this.userId = userId;
        this.readingTime = readingTime;
        this.readingContent = readingContent;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    public Moring_readingEntity() {
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

    public Date getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(Date readingTime) {
        this.readingTime = readingTime;
    }

    public String getReadingContent() {
        return readingContent;
    }

    public void setReadingContent(String readingContent) {
        this.readingContent = readingContent;
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