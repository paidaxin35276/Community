package com.community.entity;

import lombok.Data;

@Data
public class OwnerEntity {//客户业主
   private Integer id;//业主编号
   private String username;//业主名
   private String password;//密码
   private String nickname;//昵称
   private String mobile;//手机
   private String iDcard;//身份证
   private String birthday;//生日
   private String address;//地址
   private Integer type;//用户类别（1业主；2住户；3租户；）
   private Integer status;//用户状态（1:启用；2:禁用）
   private String create_time;//记录创建时间
   private Integer create_who;//创建人
   private String edit_time;//记录修改时间
   private Integer edit_who;//修改人
   private Integer isDelete;//是否已经删除（0）

    public OwnerEntity() {
    }

    public OwnerEntity(String username, String password, String nickname, String mobile, String iDcard, String birthday, String address, Integer type, Integer status, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.mobile = mobile;
        this.iDcard = iDcard;
        this.birthday = birthday;
        this.address = address;
        this.type = type;
        this.status = status;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }

    public OwnerEntity(Integer id, String username, String password, String nickname, String mobile, String iDcard, String birthday, String address, Integer type, Integer status, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDelete) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.mobile = mobile;
        this.iDcard = iDcard;
        this.birthday = birthday;
        this.address = address;
        this.type = type;
        this.status = status;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "OwnerEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", iDcard='" + iDcard + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", edit_time='" + edit_time + '\'' +
                ", edit_who=" + edit_who +
                ", isDelete=" + isDelete +
                '}';
    }
}
