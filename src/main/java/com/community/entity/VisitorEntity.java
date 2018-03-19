package com.community.entity;

import java.util.Date;

public class VisitorEntity extends BaseEntity{
    private Integer id;

    private String visitorname;

    private String nickname;

    private String mobile;

    private String image;

    private Integer visit_object;

    private String reason;

    private String visit_time_start;

    private String visit_time_end;

    private Integer type;

    private String create_time;

    private Integer create_who;

    public VisitorEntity(Integer id, String visitorname, String nickname, String mobile, String image, Integer visit_object, String reason, String visit_time_start, String visit_time_end, Integer type, String create_time, Integer create_who) {
        this.id = id;
        this.visitorname = visitorname;
        this.nickname = nickname;
        this.mobile = mobile;
        this.image = image;
        this.visit_object = visit_object;
        this.reason = reason;
        this.visit_time_start = visit_time_start;
        this.visit_time_end = visit_time_end;
        this.type = type;
        this.create_time = create_time;
        this.create_who = create_who;
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

    public Integer getVisit_object() {
        return visit_object;
    }

    public void setVisit_object(Integer visit_object) {
        this.visit_object = visit_object;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getVisit_time_start() {
        return visit_time_start;
    }

    public void setVisit_time_start(String visit_time_start) {
        this.visit_time_start = visit_time_start;
    }

    public String getVisit_time_end() {
        return visit_time_end;
    }

    public void setVisit_time_end(String visit_time_end) {
        this.visit_time_end = visit_time_end;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Integer getCreate_who() {
        return create_who;
    }

    public void setCreate_who(Integer create_who) {
        this.create_who = create_who;
    }

    public VisitorEntity() {

    }

    @Override
    public String toString() {
        return "VisitorEntity{" +
                "id=" + id +
                ", visitorname='" + visitorname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", image='" + image + '\'' +
                ", visit_object=" + visit_object +
                ", reason='" + reason + '\'' +
                ", visit_time_start='" + visit_time_start + '\'' +
                ", visit_time_end='" + visit_time_end + '\'' +
                ", type=" + type +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                '}';
    }
}