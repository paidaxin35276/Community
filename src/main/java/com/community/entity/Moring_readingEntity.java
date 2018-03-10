package com.community.entity;

import java.util.Date;

public class Moring_readingEntity {
    private Integer id;

    private Integer userId;

    private String readingTime;

    private String readingContent;

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

    public String getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(String readingTime) {
        this.readingTime = readingTime;
    }

    public String getReadingContent() {
        return readingContent;
    }

    public void setReadingContent(String readingContent) {
        this.readingContent = readingContent;
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

    public Moring_readingEntity() {
    }

    public Moring_readingEntity(Integer userId, String readingTime, String readingContent, String createTime, String editTime, Integer isdelete) {
        this.userId = userId;
        this.readingTime = readingTime;
        this.readingContent = readingContent;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    public Moring_readingEntity(Integer id, Integer userId, String readingTime, String readingContent, String createTime, String editTime, Integer isdelete) {
        this.id = id;
        this.userId = userId;
        this.readingTime = readingTime;
        this.readingContent = readingContent;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "Moring_readingEntity{" +
                "id=" + id +
                ", userId=" + userId +
                ", readingTime='" + readingTime + '\'' +
                ", readingContent='" + readingContent + '\'' +
                ", createTime='" + createTime + '\'' +
                ", editTime='" + editTime + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }
}