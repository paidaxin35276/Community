package com.community.entity;

import lombok.Data;

@Data
public class Work_log_Entity {//工作日志
    private Integer id;//表id
    private Integer user_id;//用户id
    private String work_date;//工作日期（“yyyy-MM-dd”）
    private String work_loh;//工作日志
    private String create_time;//创建时间
    private String edit_time;//编辑时间
    private Integer isDelete;//是否已经删除（新增默认为0）

    @Override
    public String toString() {
        return "Work_log_Entity{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", work_date='" + work_date + '\'' +
                ", work_loh='" + work_loh + '\'' +
                ", create_time='" + create_time + '\'' +
                ", edit_time='" + edit_time + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }

    public Work_log_Entity() {
    }

    public Work_log_Entity(Integer user_id, String work_date, String work_loh, String create_time, String edit_time, Integer isDelete) {
        this.user_id = user_id;
        this.work_date = work_date;
        this.work_loh = work_loh;
        this.create_time = create_time;
        this.edit_time = edit_time;
        this.isDelete = isDelete;
    }

    public Work_log_Entity(Integer id, Integer user_id, String work_date, String work_loh, String create_time, String edit_time, Integer isDelete) {
        this.id = id;
        this.user_id = user_id;
        this.work_date = work_date;
        this.work_loh = work_loh;
        this.create_time = create_time;
        this.edit_time = edit_time;
        this.isDelete = isDelete;
    }
}
