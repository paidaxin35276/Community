package com.community.entity;

import java.util.Date;

public class Urgent_eventEntity {
    private Integer id;

    private Integer userId;

    private String eventContent;

    private Date createTime;

    private String userFeedback;

    private Integer userScore;

    private Integer status;

    public Urgent_eventEntity(Integer id, Integer userId, String eventContent, Date createTime, String userFeedback, Integer userScore, Integer status) {
        this.id = id;
        this.userId = userId;
        this.eventContent = eventContent;
        this.createTime = createTime;
        this.userFeedback = userFeedback;
        this.userScore = userScore;
        this.status = status;
    }

    public Urgent_eventEntity() {
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

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
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
}