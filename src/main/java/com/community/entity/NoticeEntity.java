package com.community.entity;

import java.util.Date;

public class NoticeEntity extends BaseEntity{
    private Integer id;

    private String notice;

    private Integer rnoticeObject;

    private String createTime;

    private Integer createWho;

    private Integer isdelete;

    public NoticeEntity(Integer id, String notice, Integer rnoticeObject, String createTime, Integer createWho, Integer isdelete) {
        this.id = id;
        this.notice = notice;
        this.rnoticeObject = rnoticeObject;
        this.createTime = createTime;
        this.createWho = createWho;
        this.isdelete = isdelete;
    }

    public NoticeEntity(String notice, Integer rnoticeObject, String createTime, Integer createWho, Integer isdelete) {
        this.notice = notice;
        this.rnoticeObject = rnoticeObject;
        this.createTime = createTime;
        this.createWho = createWho;
        this.isdelete = isdelete;
    }

    public NoticeEntity() {
    }

    @Override
    public String toString() {
        return "NoticeEntity{" +
                "id=" + id +
                ", notice='" + notice + '\'' +
                ", rnoticeObject=" + rnoticeObject +
                ", createTime='" + createTime + '\'' +
                ", createWho=" + createWho +
                ", isdelete=" + isdelete +
                '}';
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
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