package com.community.entity;

import java.util.Date;

public class ComplainEntity {
    private Integer id;

    private Integer userId;

    private String content;

    private String createTime;

    private String userFeedback;

    private Integer userScore;

    private Integer status;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUserFeedback() {
        return userFeedback;
    }

    public void setUserFeedback(String userFeedback) {
        this.userFeedback = userFeedback;
    }

    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ComplainEntity() {
    }

    public ComplainEntity(Integer userId, String content, String createTime, String userFeedback, Integer userScore, Integer status) {
        this.userId = userId;
        this.content = content;
        this.createTime = createTime;
        this.userFeedback = userFeedback;
        this.userScore = userScore;
        this.status = status;
    }

    public ComplainEntity(Integer id, Integer userId, String content, String createTime, String userFeedback, Integer userScore, Integer status) {
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.createTime = createTime;
        this.userFeedback = userFeedback;
        this.userScore = userScore;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ComplainEntity{" +
                "id=" + id +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                ", userFeedback='" + userFeedback + '\'' +
                ", userScore=" + userScore +
                ", status=" + status +
                '}';
    }
}