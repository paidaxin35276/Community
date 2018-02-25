package com.community.entity;

import lombok.Data;

@Data
public class Option_log_Entity {//操作记录
    private Integer id;//表id
    private String option_contents;//操作内容
    private Integer option_type;//操作类型（增删改查）
    private String option_time;//记录创建时间
    private Integer option_who;//操作人
    private Integer isDelete;//是否已经删除（新增默认为0）

    @Override
    public String toString() {
        return "Option_log_Entity{" +
                "id=" + id +
                ", option_contents='" + option_contents + '\'' +
                ", option_type=" + option_type +
                ", option_time='" + option_time + '\'' +
                ", option_who=" + option_who +
                ", isDelete=" + isDelete +
                '}';
    }

    public Option_log_Entity() {
    }

    public Option_log_Entity(String option_contents, Integer option_type, String option_time, Integer option_who, Integer isDelete) {
        this.option_contents = option_contents;
        this.option_type = option_type;
        this.option_time = option_time;
        this.option_who = option_who;
        this.isDelete = isDelete;
    }

    public Option_log_Entity(Integer id, String option_contents, Integer option_type, String option_time, Integer option_who, Integer isDelete) {
        this.id = id;
        this.option_contents = option_contents;
        this.option_type = option_type;
        this.option_time = option_time;
        this.option_who = option_who;
        this.isDelete = isDelete;
    }
}
