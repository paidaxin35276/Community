package com.community.entity;

import java.util.Date;

public class Moring_reading_commentEntity {
    private Integer id;

    private Integer readingId;

    private Date commentTime;

    private String commentContent;

    private Integer commentType;

    private Integer commentId;

    private Date createTime;

    private Integer isdelete;

    public Moring_reading_commentEntity(Integer id, Integer readingId, Date commentTime, String commentContent, Integer commentType, Integer commentId, Date createTime, Integer isdelete) {
        this.id = id;
        this.readingId = readingId;
        this.commentTime = commentTime;
        this.commentContent = commentContent;
        this.commentType = commentType;
        this.commentId = commentId;
        this.createTime = createTime;
        this.isdelete = isdelete;
    }

    public Moring_reading_commentEntity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReadingId() {
        return readingId;
    }

    public void setReadingId(Integer readingId) {
        this.readingId = readingId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}