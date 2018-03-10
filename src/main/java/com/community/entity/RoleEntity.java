package com.community.entity;

import java.util.Date;

public class RoleEntity {
    private Integer id;

    private String roleName;

    private String createTime;

    private Integer createWho;

    private String editTime;

    private Integer editWho;

    private Integer isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public RoleEntity() {
    }

    public RoleEntity(String roleName, String createTime, Integer createWho, String editTime, Integer editWho, Integer isdelete) {
        this.roleName = roleName;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.isdelete = isdelete;
    }

    public RoleEntity(Integer id, String roleName, String createTime, Integer createWho, String editTime, Integer editWho, Integer isdelete) {
        this.id = id;
        this.roleName = roleName;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createWho=" + createWho +
                ", editTime='" + editTime + '\'' +
                ", editWho=" + editWho +
                ", isdelete=" + isdelete +
                '}';
    }
}