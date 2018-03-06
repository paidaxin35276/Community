package com.community.entity;

import java.util.Date;

public class Parking_spaceEntity {
    private Integer id;

    private Integer licensePlate;

    private String image;

    private Date createTime;

    private Integer createWho;

    private Date editTime;

    private Integer editWho;

    private Integer status;

    public Parking_spaceEntity(Integer id, Integer licensePlate, String image, Date createTime, Integer createWho, Date editTime, Integer editWho, Integer status) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.image = image;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.status = status;
    }

    public Parking_spaceEntity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(Integer licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}