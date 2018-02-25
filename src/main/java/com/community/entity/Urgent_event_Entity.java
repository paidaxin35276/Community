package com.community.entity;

import lombok.Data;

@Data
public class Urgent_event_Entity {//紧急事件
    private Integer id;//表id
    private Integer user_id;//用户id
    private String event_content;//事件说明、处理内容
    private String create_time;//创建时间
    private String user_feedback;//用户反馈
    private Integer user_score;//评分
    private Integer status;//状态（1创建、待指派；2已指派、待处理；3已处理、待反馈；4已完成；5反馈未完成、重新指派）

    public Urgent_event_Entity() {
    }

    public Urgent_event_Entity(Integer user_id, String event_content, String create_time, String user_feedback, Integer user_score, Integer status) {
        this.user_id = user_id;
        this.event_content = event_content;
        this.create_time = create_time;
        this.user_feedback = user_feedback;
        this.user_score = user_score;
        this.status = status;
    }

    public Urgent_event_Entity(Integer id, Integer user_id, String event_content, String create_time, String user_feedback, Integer user_score, Integer status) {
        this.id = id;
        this.user_id = user_id;
        this.event_content = event_content;
        this.create_time = create_time;
        this.user_feedback = user_feedback;
        this.user_score = user_score;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Urgent_event_Entity{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", event_content='" + event_content + '\'' +
                ", create_time='" + create_time + '\'' +
                ", user_feedback='" + user_feedback + '\'' +
                ", user_score=" + user_score +
                ", status=" + status +
                '}';
    }
}
