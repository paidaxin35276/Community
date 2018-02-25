package com.community.entity;

import lombok.Data;

@Data
public class EquipmentEntity {//设备表
    private Integer id;//设备编号
    private String name;//设备名称
    private Integer startus;//设备状态（使用、闲置、损坏、维修）
    private Integer describe;//设备描述
    private String create_time;//记录创建时间
    private Integer create_who;//创建人
    private String edit_time;//记录修改时间
    private Integer edit_who;//修改人
    private Integer isDelete;//是否已经删除（0）

    public EquipmentEntity() {
    }

    public EquipmentEntity(String name, Integer startus, Integer describe, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.name = name;
        this.startus = startus;
        this.describe = describe;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }

    public EquipmentEntity(Integer id, String name, Integer startus, Integer describe, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.id = id;
        this.name = name;
        this.startus = startus;
        this.describe = describe;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "EquipmentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startus=" + startus +
                ", describe=" + describe +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", edit_time='" + edit_time + '\'' +
                ", edit_who=" + edit_who +
                ", isDelete=" + isDelete +
                '}';
    }
}
