package com.community.entity;

import java.util.Date;

public class DeptmentEntity {
    private Integer id;

    private String name;

    private Integer parentId;

    private String deptNo;

    private Date createTime;

    private Integer createWho;

    private Date editTime;

    private Integer editWho;

    private Integer isdelete;

    public DeptmentEntity(Integer id, String name, Integer parentId, String deptNo, Date createTime, Integer createWho, Date editTime, Integer editWho, Integer isdelete) {
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

    public DeptmentEntity() {
        super();
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

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}