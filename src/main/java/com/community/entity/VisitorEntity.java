package com.community.entity;

import java.util.Date;

public class VisitorEntity {
    private Integer id;

    private String visitorname;

    private String nickname;

    private String mobile;

    private String image;

    private Integer visitObject;

    private String reason;

    private Date visitTimeStart;

    private Date visitTimeEnd;

    private Integer type;

    private Date createTime;

    private Integer createWho;

    public VisitorEntity(Integer id, String visitorname, String nickname, String mobile, String image, Integer visitObject, String reason, Date visitTimeStart, Date visitTimeEnd, Integer type, Date createTime, Integer createWho) {
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

    public VisitorEntity() {
        super();
    }

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

    public Date getVisitTimeStart() {
        return visitTimeStart;
    }

    public void setVisitTimeStart(Date visitTimeStart) {
        this.visitTimeStart = visitTimeStart;
    }

    public Date getVisitTimeEnd() {
        return visitTimeEnd;
    }

    public void setVisitTimeEnd(Date visitTimeEnd) {
        this.visitTimeEnd = visitTimeEnd;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateWho() {
        return createWho;
    }

    public void setCreateWho(Integer createWho) {
        this.createWho = createWho;
    }
}