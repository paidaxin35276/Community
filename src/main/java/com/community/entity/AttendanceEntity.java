package com.community.entity;

import java.util.Date;

public class AttendanceEntity {
    private Integer id;

    private Integer userId;

    private Date amAttendance;

    private Date pmAttendance;

    private Integer times;

    private String marks;

    private Integer status;

    private Date createTime;

    private Date editTime;

    private Integer isdelete;

    public AttendanceEntity(Integer id, Integer userId, Date amAttendance, Date pmAttendance, Integer times, String marks, Integer status, Date createTime, Date editTime, Integer isdelete) {
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

    public Date getAmAttendance() {
        return amAttendance;
    }

    public void setAmAttendance(Date amAttendance) {
        this.amAttendance = amAttendance;
    }

    public Date getPmAttendance() {
        return pmAttendance;
    }

    public void setPmAttendance(Date pmAttendance) {
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