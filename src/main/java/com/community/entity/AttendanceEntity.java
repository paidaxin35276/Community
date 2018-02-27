package com.community.entity;

import java.util.Date;

public class AttendanceEntity {
    private Integer id;

    private Integer userId;

    private String amAttendance;

    private String pmAttendance;

    private Date times;

    private String marks;

    private Integer status;

    private Date createTime;

    private Date editTime;

    private Integer isdelete;

    public AttendanceEntity(Integer id, Integer userId, String amAttendance, String pmAttendance, Date times, String marks, Integer status, Date createTime, Date editTime, Integer isdelete) {
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

    public AttendanceEntity() {
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

    public Date getTimes() {
        return times;
    }

    public void setTimes(Date times) {
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