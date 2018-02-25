package com.community.entity;

import lombok.Data;

@Data
public class ContactsEntity {//联系人
    private Integer id;//表id
    private String contactname;//联系人姓名
    private String mobile;//联系人手机
    private String position;//职位
    private String create_time;//创建时间
    private String edit_time;//编辑时间
    private Integer isDelete;//是否已经删除（新增默认为0）


    public ContactsEntity() {
    }

    public ContactsEntity(String contactname, String mobile, String position, String create_time, String edit_time, Integer isDelete) {
        this.contactname = contactname;
        this.mobile = mobile;
        this.position = position;
        this.create_time = create_time;
        this.edit_time = edit_time;
        this.isDelete = isDelete;
    }

    public ContactsEntity(Integer id, String contactname, String mobile, String position, String create_time, String edit_time, Integer isDelete) {
        this.id = id;
        this.contactname = contactname;
        this.mobile = mobile;
        this.position = position;
        this.create_time = create_time;
        this.edit_time = edit_time;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "ContactsEntity{" +
                "id=" + id +
                ", contactname='" + contactname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", position='" + position + '\'' +
                ", create_time='" + create_time + '\'' +
                ", edit_time='" + edit_time + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
