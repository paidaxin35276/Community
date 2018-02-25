package com.community.entity;

import lombok.Data;

@Data
public class AttendanceEntity {//考勤
    private Integer id;//表id
    private Integer user_id;//用户id
    private String am_attendance;//考勤时间（打卡上班）
    private String pm_attendance;//考勤时间（打卡下班）
    private Integer times;//上班时间统计
    private String marks;//考勤异常情况说明
    private Integer status;//考勤状态（0:不正常；1正常）
    private String create_time;//创建时间
    private String edit_time;//编辑时间
    private Integer isDelete;//是否已经删除（新增默认为0）

    @Override
    public String toString() {
        return "AttendanceEntity{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", am_attendance='" + am_attendance + '\'' +
                ", pm_attendance='" + pm_attendance + '\'' +
                ", times=" + times +
                ", marks='" + marks + '\'' +
                ", status=" + status +
                ", create_time='" + create_time + '\'' +
                ", edit_time='" + edit_time + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }

    public AttendanceEntity() {
    }

    public AttendanceEntity(Integer user_id, String am_attendance, String pm_attendance, Integer times, String marks, Integer status, String create_time, String edit_time, Integer isDelete) {
        this.user_id = user_id;
        this.am_attendance = am_attendance;
        this.pm_attendance = pm_attendance;
        this.times = times;
        this.marks = marks;
        this.status = status;
        this.create_time = create_time;
        this.edit_time = edit_time;
        this.isDelete = isDelete;
    }

    public AttendanceEntity(Integer id, Integer user_id, String am_attendance, String pm_attendance, Integer times, String marks, Integer status, String create_time, String edit_time, Integer isDelete) {
        this.id = id;
        this.user_id = user_id;
        this.am_attendance = am_attendance;
        this.pm_attendance = pm_attendance;
        this.times = times;
        this.marks = marks;
        this.status = status;
        this.create_time = create_time;
        this.edit_time = edit_time;
        this.isDelete = isDelete;
    }
}
