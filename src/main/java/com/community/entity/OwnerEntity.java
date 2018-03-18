package com.community.entity;

import java.util.Date;

public class OwnerEntity extends BaseEntity{
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String mobile;

    private String iDcard;

    private String birthday;

    private String address;

    private Integer type;

    private Integer status;

    private String create_time;

    private Integer create_who;

    private String edit_time;

    private Integer edit_who;

    private Integer isDelete;

    public OwnerEntity() {
    }

    public OwnerEntity(Integer id, String username, String password, String nickname, String mobile, String iDcard, String birthday, String address, Integer type, Integer status, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.mobile = mobile;
        this.iDcard = iDcard;
        this.birthday = birthday;
        this.address = address;
        this.type = type;
        this.status = status;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getiDcard() {
        return iDcard;
    }

    public void setiDcard(String iDcard) {
        this.iDcard = iDcard;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getEdit_time() {
        return edit_time;
    }

    public void setEdit_time(String edit_time) {
        this.edit_time = edit_time;
    }

    public Integer getEdit_who() {
        return edit_who;
    }

    public void setEdit_who(Integer edit_who) {
        this.edit_who = edit_who;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "OwnerEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", iDcard='" + iDcard + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", edit_time='" + edit_time + '\'' +
                ", edit_who=" + edit_who +
                ", isDelete=" + isDelete +
                '}';
    }
}