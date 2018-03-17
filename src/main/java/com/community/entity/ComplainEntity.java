package com.community.entity;

import java.util.Date;

public class ComplainEntity extends BaseEntity{
    private Integer id;

    private Integer user_id;

    private String content;

    private String create_time;

    private String user_feedback;

    private Integer user_score;

    private Integer status;

    public ComplainEntity() {
    }

    public ComplainEntity(Integer user_id, String content, String create_time, String user_feedback, Integer user_score, Integer status) {
        this.user_id = user_id;
        this.content = content;
        this.create_time = create_time;
        this.user_feedback = user_feedback;
        this.user_score = user_score;
        this.status = status;
    }

    public ComplainEntity(Integer id, Integer user_id, String content, String create_time, String user_feedback, Integer user_score, Integer status) {
        this.id = id;
        this.user_id = user_id;
        this.content = content;
        this.create_time = create_time;
        this.user_feedback = user_feedback;
        this.user_score = user_score;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUser_feedback() {
        return user_feedback;
    }

    public void setUser_feedback(String user_feedback) {
        this.user_feedback = user_feedback;
    }

    public Integer getUser_score() {
        return user_score;
    }

    public void setUser_score(Integer user_score) {
        this.user_score = user_score;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ComplainEntity{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", content='" + content + '\'' +
                ", create_time='" + create_time + '\'' +
                ", user_feedback='" + user_feedback + '\'' +
                ", user_score=" + user_score +
                ", status=" + status +
                '}';
    }
}