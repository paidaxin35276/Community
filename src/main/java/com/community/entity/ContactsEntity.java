package com.community.entity;

import java.util.Date;

public class ContactsEntity extends BaseEntity{
    private Integer id;

    private String contactname;

    private String mobile;

    private String position;

    private String createTime;

    private String editTime;

    private Integer isdelete;

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public ContactsEntity() {
    }

    public ContactsEntity(String contactname, String mobile, String position, String createTime, String editTime, Integer isdelete) {
        this.contactname = contactname;
        this.mobile = mobile;
        this.position = position;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    public ContactsEntity(Integer id, String contactname, String mobile, String position, String createTime, String editTime, Integer isdelete) {
        this.id = id;
        this.contactname = contactname;
        this.mobile = mobile;
        this.position = position;
        this.createTime = createTime;
        this.editTime = editTime;
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "ContactsEntity{" +
                "id=" + id +
                ", contactname='" + contactname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", position='" + position + '\'' +
                ", createTime='" + createTime + '\'' +
                ", editTime='" + editTime + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }
}