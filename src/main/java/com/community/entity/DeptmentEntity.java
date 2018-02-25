package com.community.entity;

import lombok.Data;

@Data
public class DeptmentEntity {//组织机构entity
    private Integer id;//组织机构id
    private String name;//机构名称
    private Integer parent_id;//上级部门id
    private String dept_no;//部门编码（自定义格式）
    private String create_time;//记录创建时间
    private Integer create_who;//创建人
    private String edit_time;//记录修改时间
    private Integer edit_who;//修改人
    private Integer isDelete;//是否已经删除（新增默认为0）

    @Override
    public String toString() {
        return "DeptmentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent_id=" + parent_id +
                ", dept_no='" + dept_no + '\'' +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", edit_time='" + edit_time + '\'' +
                ", edit_who=" + edit_who +
                ", isDelete=" + isDelete +
                '}';
    }

    public DeptmentEntity(String name, Integer parent_id, String dept_no, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.name = name;
        this.parent_id = parent_id;
        this.dept_no = dept_no;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }

    public DeptmentEntity(Integer id, String name, Integer parent_id, String dept_no, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
        this.dept_no = dept_no;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }

    public DeptmentEntity() {
    }

}
