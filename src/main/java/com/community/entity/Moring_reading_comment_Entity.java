package com.community.entity;

import lombok.Data;

@Data
public class Moring_reading_comment_Entity {//晨报评论表
    private Integer id;//表id
    private Integer reading_id;//晨报编号
    private String comment_time;//评论时间
    private String comment_content;//评论内容
    private Integer comment_Type;//评论类型（0晨报评论；1评论的评论；）
    private Integer comment_id;//评论的评论
    private String create_time;//创建时间
    private Integer isDelete;//是否已经删除（新增默认为0）

    public Moring_reading_comment_Entity() {
    }

    public Moring_reading_comment_Entity(Integer reading_id, String comment_time, String comment_content, Integer comment_Type, Integer comment_id, String create_time, Integer isDelete) {
        this.reading_id = reading_id;
        this.comment_time = comment_time;
        this.comment_content = comment_content;
        this.comment_Type = comment_Type;
        this.comment_id = comment_id;
        this.create_time = create_time;
        this.isDelete = isDelete;
    }

    public Moring_reading_comment_Entity(Integer id, Integer reading_id, String comment_time, String comment_content, Integer comment_Type, Integer comment_id, String create_time, Integer isDelete) {
        this.id = id;
        this.reading_id = reading_id;
        this.comment_time = comment_time;
        this.comment_content = comment_content;
        this.comment_Type = comment_Type;
        this.comment_id = comment_id;
        this.create_time = create_time;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Moring_reading_comment_Entity{" +
                "id=" + id +
                ", reading_id=" + reading_id +
                ", comment_time='" + comment_time + '\'' +
                ", comment_content='" + comment_content + '\'' +
                ", comment_Type=" + comment_Type +
                ", comment_id=" + comment_id +
                ", create_time='" + create_time + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
