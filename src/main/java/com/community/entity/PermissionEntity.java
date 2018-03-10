package com.community.entity;

import java.util.Date;

public class PermissionEntity {
    private Integer id;

    private String name;

    private String function;

    private String createTime;

    private Integer createWho;

    private String editTime;

    private Integer editWho;

    private Integer isdelete;

    public PermissionEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
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

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public Integer getEditWho() {
        return editWho;
    }

    public void setEditWho(Integer editWho) {
        this.editWho = editWho;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public PermissionEntity(String name, String function, String createTime, Integer createWho, String editTime, Integer editWho, Integer isdelete) {
        this.name = name;
        this.function = function;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.isdelete = isdelete;
    }

    public PermissionEntity(Integer id, String name, String function, String createTime, Integer createWho, String editTime, Integer editWho, Integer isdelete) {
        this.id = id;
        this.name = name;
        this.function = function;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "PermissionEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", function='" + function + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createWho=" + createWho +
                ", editTime='" + editTime + '\'' +
                ", editWho=" + editWho +
                ", isdelete=" + isdelete +
                '}';
    }
}