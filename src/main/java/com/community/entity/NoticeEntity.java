package com.community.entity;

import java.util.Date;

public class NoticeEntity {
    private Integer id;

    private String notice;

    private Integer rnoticeObject;

    private Date createTime;

    private Integer createWho;

    private Integer isdelete;

    public NoticeEntity(Integer id, String notice, Integer rnoticeObject, Date createTime, Integer createWho, Integer isdelete) {
        this.id = id;
        this.notice = notice;
        this.rnoticeObject = rnoticeObject;
        this.createTime = createTime;
        this.createWho = createWho;
        this.isdelete = isdelete;
    }

    public NoticeEntity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Integer getRnoticeObject() {
        return rnoticeObject;
    }

    public void setRnoticeObject(Integer rnoticeObject) {
        this.rnoticeObject = rnoticeObject;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateWho() {
        return createWho;
    }

    public void setCreateWho(Integer createWho) {
        this.createWho = createWho;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}