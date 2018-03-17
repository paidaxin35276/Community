package com.community.entity;

import java.util.Date;

public class Moring_reading_commentEntity extends BaseEntity{
    private Integer id;

    private Integer readingId;

    private String commentTime;

    private String commentContent;

    private Integer commentType;

    private Integer commentId;

    private String createTime;

    private Integer isdelete;

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

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Moring_reading_commentEntity() {
    }

    public Moring_reading_commentEntity(Integer readingId, String commentTime, String commentContent, Integer commentType, Integer commentId, String createTime, Integer isdelete) {
        this.readingId = readingId;
        this.commentTime = commentTime;
        this.commentContent = commentContent;
        this.commentType = commentType;
        this.commentId = commentId;
        this.createTime = createTime;
        this.isdelete = isdelete;
    }

    public Moring_reading_commentEntity(Integer id, Integer readingId, String commentTime, String commentContent, Integer commentType, Integer commentId, String createTime, Integer isdelete) {
        this.id = id;
        this.readingId = readingId;
        this.commentTime = commentTime;
        this.commentContent = commentContent;
        this.commentType = commentType;
        this.commentId = commentId;
        this.createTime = createTime;
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "Moring_reading_commentEntity{" +
                "id=" + id +
                ", readingId=" + readingId +
                ", commentTime='" + commentTime + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", commentType=" + commentType +
                ", commentId=" + commentId +
                ", createTime='" + createTime + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }
}