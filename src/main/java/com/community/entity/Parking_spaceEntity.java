package com.community.entity;

import java.util.Date;

public class Parking_spaceEntity {
    private Integer id;

    private Integer licensePlate;

    private String image;

    private String createTime;

    private Integer createWho;

    private String editTime;

    private Integer editWho;

    private Integer status;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Parking_spaceEntity() {
    }

    public Parking_spaceEntity(Integer licensePlate, String image, String createTime, Integer createWho, String editTime, Integer editWho, Integer status) {
        this.licensePlate = licensePlate;
        this.image = image;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.status = status;
    }

    public Parking_spaceEntity(Integer id, Integer licensePlate, String image, String createTime, Integer createWho, String editTime, Integer editWho, Integer status) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.image = image;
        this.createTime = createTime;
        this.createWho = createWho;
        this.editTime = editTime;
        this.editWho = editWho;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Parking_spaceEntity{" +
                "id=" + id +
                ", licensePlate=" + licensePlate +
                ", image='" + image + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createWho=" + createWho +
                ", editTime='" + editTime + '\'' +
                ", editWho=" + editWho +
                ", status=" + status +
                '}';
    }
}