package com.community.entity;

import lombok.Data;

@Data
public class PermissionEntity {//权限
    private Integer id;//表id
    private String name;//权限说明
    private String function;//访问链接/功能
    private String create_time;//记录创建时间
    private Integer create_who;//创建人
    private String edit_time;//记录修改时间
    private Integer edit_who;//修改人
    private Integer isDelete;//是否已经删除（新增默认为0）

    @Override
    public String toString() {
        return "PermissionEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", function='" + function + '\'' +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", edit_time='" + edit_time + '\'' +
                ", edit_who=" + edit_who +
                ", isDelete=" + isDelete +
                '}';
    }

    public PermissionEntity() {
    }

    public PermissionEntity(String name, String function, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.name = name;
        this.function = function;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }

    public PermissionEntity(Integer id, String name, String function, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.id = id;
        this.name = name;
        this.function = function;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }
}
