package com.community.entity;

import java.util.Date;

public class ContactsEntity {
    private Integer id;

    private String contactname;

    private String mobile;

    private String position;

    private Date createTime;

    private Date editTime;

    private Integer isdelete;

    public ContactsEntity(Integer id, String contactname, String mobile, String position, Date createTime, Date editTime, Integer isdelete) {
        this.id = id;
        this.contactname = contactname;
        this.mobile = mobile;
        this.position = position;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    public ContactsEntity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}