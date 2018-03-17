package com.community.entity;

import java.util.Date;

public class AttendanceEntity extends BaseEntity{
    private Integer id;

    private Integer userId;

    private String amAttendance;

    private String pmAttendance;

    private Integer times;

    private String marks;

    private Integer status;

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

    public String getAmAttendance() {
        return amAttendance;
    }

    public void setAmAttendance(String amAttendance) {
        this.amAttendance = amAttendance;
    }

    public String getPmAttendance() {
        return pmAttendance;
    }

    public void setPmAttendance(String pmAttendance) {
        this.pmAttendance = pmAttendance;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public AttendanceEntity() {
    }

    public AttendanceEntity(Integer userId, String amAttendance, String pmAttendance, Integer times, String marks, Integer status, String createTime, String editTime, Integer isdelete) {
        this.userId = userId;
        this.amAttendance = amAttendance;
        this.pmAttendance = pmAttendance;
        this.times = times;
        this.marks = marks;
        this.status = status;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    public AttendanceEntity(Integer id, Integer userId, String amAttendance, String pmAttendance, Integer times, String marks, Integer status, String createTime, String editTime, Integer isdelete) {
        this.id = id;
        this.userId = userId;
        this.amAttendance = amAttendance;
        this.pmAttendance = pmAttendance;
        this.times = times;
        this.marks = marks;
        this.status = status;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "AttendanceEntity{" +
                "id=" + id +
                ", userId=" + userId +
                ", amAttendance='" + amAttendance + '\'' +
                ", pmAttendance='" + pmAttendance + '\'' +
                ", times=" + times +
                ", marks='" + marks + '\'' +
                ", status=" + status +
                ", createTime='" + createTime + '\'' +
                ", editTime='" + editTime + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }
}