package com.community.entity;

import java.util.Date;

public class DeptmentEntity extends BaseEntity{
    private Integer id;

    private String name;

    private Integer parentId;

    private String deptNo;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
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

    public DeptmentEntity() {
    }

    public DeptmentEntity(String name, Integer parentId, String deptNo, String createTime, Integer createWho, String editTime, Integer editWho, Integer isdelete) {
        this.name = name;
        this.parentId = parentId;
        this.deptNo = deptNo;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.isdelete = isdelete;
    }

    public DeptmentEntity(Integer id, String name, Integer parentId, String deptNo, String createTime, Integer createWho, String editTime, Integer editWho, Integer isdelete) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.deptNo = deptNo;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "DeptmentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", deptNo='" + deptNo + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createWho=" + createWho +
                ", editTime='" + editTime + '\'' +
                ", editWho=" + editWho +
                ", isdelete=" + isdelete +
                '}';
    }
}