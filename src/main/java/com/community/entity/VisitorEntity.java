package com.community.entity;

import java.util.Date;

public class VisitorEntity extends BaseEntity{
    private Integer id;

    private String visitorname;

    private String nickname;

    private String mobile;

    private String image;

    private Integer visitObject;

    private String reason;

    private String visitTimeStart;

    private String visitTimeEnd;

    private Integer type;

    private String createTime;

    private Integer createWho;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisitorname() {
        return visitorname;
    }

    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getVisitObject() {
        return visitObject;
    }

    public void setVisitObject(Integer visitObject) {
        this.visitObject = visitObject;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getVisitTimeStart() {
        return visitTimeStart;
    }

    public void setVisitTimeStart(String visitTimeStart) {
        this.visitTimeStart = visitTimeStart;
    }

    public String getVisitTimeEnd() {
        return visitTimeEnd;
    }

    public void setVisitTimeEnd(String visitTimeEnd) {
        this.visitTimeEnd = visitTimeEnd;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateWho() {
        return createWho;
    }

    public void setCreateWho(Integer createWho) {
        this.createWho = createWho;
    }

    public VisitorEntity() {
    }

    public VisitorEntity(String visitorname, String nickname, String mobile, String image, Integer visitObject, String reason, String visitTimeStart, String visitTimeEnd, Integer type, String createTime, Integer createWho) {
        this.visitorname = visitorname;
        this.nickname = nickname;
        this.mobile = mobile;
        this.image = image;
        this.visitObject = visitObject;
        this.reason = reason;
        this.visitTimeStart = visitTimeStart;
        this.visitTimeEnd = visitTimeEnd;
        this.type = type;
        this.createTime = createTime;
        this.createWho = createWho;
    }

    public VisitorEntity(Integer id, String visitorname, String nickname, String mobile, String image, Integer visitObject, String reason, String visitTimeStart, String visitTimeEnd, Integer type, String createTime, Integer createWho) {
        this.id = id;
        this.visitorname = visitorname;
        this.nickname = nickname;
        this.mobile = mobile;
        this.image = image;
        this.visitObject = visitObject;
        this.reason = reason;
        this.visitTimeStart = visitTimeStart;
        this.visitTimeEnd = visitTimeEnd;
        this.type = type;
        this.createTime = createTime;
        this.createWho = createWho;
    }

    @Override
    public String toString() {
        return "VisitorEntity{" +
                "id=" + id +
                ", visitorname='" + visitorname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", image='" + image + '\'' +
                ", visitObject=" + visitObject +
                ", reason='" + reason + '\'' +
                ", visitTimeStart='" + visitTimeStart + '\'' +
                ", visitTimeEnd='" + visitTimeEnd + '\'' +
                ", type=" + type +
                ", createTime='" + createTime + '\'' +
                ", createWho=" + createWho +
                '}';
    }
}