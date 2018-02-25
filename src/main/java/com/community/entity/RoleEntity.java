package com.community.entity;

import lombok.Data;

@Data
public class RoleEntity {//角色表
    private Integer id;//表id
    private String role_name;//角色名称
    private String create_time;//记录创建时间
    private Integer create_who;//创建人
    private String edit_time;//记录修改时间
    private Integer edit_who;//修改人
    private Integer isDelete;//是否已经删除（新增默认为0）

    public RoleEntity() {
    }

    public RoleEntity(Integer id, String role_name, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.id = id;
        this.role_name = role_name;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }

    public RoleEntity(String role_name, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.role_name = role_name;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "id=" + id +
                ", role_name='" + role_name + '\'' +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", edit_time='" + edit_time + '\'' +
                ", edit_who=" + edit_who +
                ", isDelete=" + isDelete +
                '}';
    }
}
