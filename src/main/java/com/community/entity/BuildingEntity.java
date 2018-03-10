package com.community.entity;

import java.util.Date;

public class BuildingEntity {
    private Integer id;

    private String buildingNo;

    private Integer type;

    private String createTime;

    private Integer createWho;

    private Integer isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "BuildingEntity{" +
                "id=" + id +
                ", buildingNo='" + buildingNo + '\'' +
                ", type=" + type +
                ", createTime='" + createTime + '\'' +
                ", createWho=" + createWho +
                ", isdelete=" + isdelete +
                '}';
    }

    public BuildingEntity() {
    }

    public BuildingEntity(String buildingNo, Integer type, String createTime, Integer createWho, Integer isdelete) {
        this.buildingNo = buildingNo;
        this.type = type;
        this.createTime = createTime;
        this.createWho = createWho;
        this.isdelete = isdelete;
    }

    public BuildingEntity(Integer id, String buildingNo, Integer type, String createTime, Integer createWho, Integer isdelete) {
        this.id = id;
        this.buildingNo = buildingNo;
        this.type = type;
        this.createTime = createTime;
        this.createWho = createWho;
        this.isdelete = isdelete;
    }
}