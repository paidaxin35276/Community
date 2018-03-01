package com.community.entity;

import java.util.Date;

public class UserEntiy {
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String mobile;

    private String idcard;



    private String birthday;

    private String address;

    private Integer deptId;

    private Integer postion;

    private Integer status;

    private Date createTime;

    private Integer createWho;

    private Date editTime;

    private Integer editWho;

    private Integer isdemission;

    private Integer isdelete;

    public UserEntiy(Integer id, String username, String password, String nickname, String mobile, String idcard, String birthday, String address, Integer deptId, Integer postion, Integer status, Date createTime, Integer createWho, Date editTime, Integer editWho, Integer isdemission, Integer isdelete) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.mobile = mobile;
        this.idcard = idcard;
        this.birthday = birthday;
        this.address = address;
        this.deptId = deptId;
        this.postion = postion;
        this.status = status;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.isdemission = isdemission;
        this.isdelete = isdelete;
    }

    public UserEntiy() {
        super();
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

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
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

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getPostion() {
        return postion;
    }

    public void setPostion(Integer postion) {
        this.postion = postion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getEditWho() {
        return editWho;
    }

    public void setEditWho(Integer editWho) {
        this.editWho = editWho;
    }

    public Integer getIsdemission() {
        return isdemission;
    }

    public void setIsdemission(Integer isdemission) {
        this.isdemission = isdemission;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}