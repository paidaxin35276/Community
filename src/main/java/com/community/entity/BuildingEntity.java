package com.community.entity;

import lombok.Data;

@Data
public class BuildingEntity {//房产
    private Integer id;//表id
    private String building_no;//房产编号
    private Integer type;//房产状态（使用、装修、出售、租赁）
    private String create_time;//创建时间
    private Integer create_who;//创建人
    private Integer isDelete;//是否已经删除（新增默认为0）

    public BuildingEntity() {
    }

    public BuildingEntity(String building_no, Integer type, String create_time, Integer create_who, Integer isDelete) {
        this.building_no = building_no;
        this.type = type;
        this.create_time = create_time;
        this.create_who = create_who;
        this.isDelete = isDelete;
    }

    public BuildingEntity(Integer id, String building_no, Integer type, String create_time, Integer create_who, Integer isDelete) {
        this.id = id;
        this.building_no = building_no;
        this.type = type;
        this.create_time = create_time;
        this.create_who = create_who;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "BuildingEntity{" +
                "id=" + id +
                ", building_no='" + building_no + '\'' +
                ", type=" + type +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", isDelete=" + isDelete +
                '}';
    }
}
