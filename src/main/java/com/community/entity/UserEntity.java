package com.community.entity;

import lombok.Data;

@Data
public class UserEntity {//用户
    private Integer id;//用户编号
    private String username;//用户名
    private String password;//密码
    private String nickname;//昵称
    private String mobile;//手机
    private String idcard;//身份证
    private String birthday;//生日
    private String address;//地址
    private Integer dept_id;//部门编号
    private Integer postion;//职位
    private Integer status;//用户状态（1:启用；2:禁用）
    private String create_time;//记录创建时间
    private Integer create_who;//创建人
    private String edit_time;//记录修改时间
    private Integer edit_who;//修改人
    private Integer isDemission;//是否已经离职（新增默认为0）
    private Integer isDelete;//是否已经删除（新增默认为0）


    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", idcard='" + idcard + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", dept_id=" + dept_id +
                ", postion=" + postion +
                ", status=" + status +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", edit_time='" + edit_time + '\'' +
                ", edit_who=" + edit_who +
                ", isDemission=" + isDemission +
                ", isDelete=" + isDelete +
                '}';
    }

    public UserEntity() {
    }

    public UserEntity(String username, String password, String nickname, String mobile, String idcard, String birthday, String address, Integer dept_id, Integer postion, Integer status, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDemission, Integer isDelete) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.mobile = mobile;
        this.idcard = idcard;
        this.birthday = birthday;
        this.address = address;
        this.dept_id = dept_id;
        this.postion = postion;
        this.status = status;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDemission = isDemission;
        this.isDelete = isDelete;
    }

    public UserEntity(Integer id, String username, String password, String nickname, String mobile, String idcard, String birthday, String address, Integer dept_id, Integer postion, Integer status, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isDemission, Integer isDelete) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.mobile = mobile;
        this.idcard = idcard;
        this.birthday = birthday;
        this.address = address;
        this.dept_id = dept_id;
        this.postion = postion;
        this.status = status;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isDemission = isDemission;
        this.isDelete = isDelete;
    }
}
