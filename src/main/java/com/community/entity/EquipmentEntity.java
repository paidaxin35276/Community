package com.community.entity;

import java.util.Date;

public class EquipmentEntity {
    private Integer id;

    private String name;

    private Integer startus;

    private Integer describe;

    private Date createTime;

    private Integer createWho;

    private Date editTime;

    private Integer editWho;

    private Integer isdelete;

    public EquipmentEntity(Integer id, String name, Integer startus, Integer describe, Date createTime, Integer createWho, Date editTime, Integer editWho, Integer isdelete) {
        this.id = id;
        this.name = name;
        this.startus = startus;
        this.describe = describe;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.isdelete = isdelete;
    }

    public EquipmentEntity() {
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

    public Integer getStartus() {
        return startus;
    }

    public void setStartus(Integer startus) {
        this.startus = startus;
    }

    public Integer getDescribe() {
        return describe;
    }

    public void setDescribe(Integer describe) {
        this.describe = describe;
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