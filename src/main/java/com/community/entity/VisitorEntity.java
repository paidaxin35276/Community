package com.community.entity;

import lombok.Data;

@Data
public class VisitorEntity {//访客
    private Integer id;//访客编号
    private String visitorname;//访客名称
    private String nickname;//昵称
    private String mobile;//手机
    private String image;//访问者图片路径
    private Integer visit_object;//访问对象
    private String reason;//事由
    private String visit_time_start;//访问时间开始
    private String visit_time_end;//访问时间结束
    private Integer type;//访客类别（1拜访业主、2搬家、3物业维修检查、0游客）
    private String create_time;//记录创建时间
    private Integer create_who;//创建人
    private Integer isDelete;//是否已经删除（新增默认为0）

    public VisitorEntity() {
    }

    public VisitorEntity(String visitorname, String nickname, String mobile, String image, Integer visit_object, String reason, String visit_time_start, String visit_time_end, Integer type, String create_time, Integer create_who, Integer isDelete) {
        this.visitorname = visitorname;
        this.nickname = nickname;
        this.mobile = mobile;
        this.image = image;
        this.visit_object = visit_object;
        this.reason = reason;
        this.visit_time_start = visit_time_start;
        this.visit_time_end = visit_time_end;
        this.type = type;
        this.create_time = create_time;
        this.create_who = create_who;
        this.isDelete = isDelete;
    }

    public VisitorEntity(Integer id, String visitorname, String nickname, String mobile, String image, Integer visit_object, String reason, String visit_time_start, String visit_time_end, Integer type, String create_time, Integer create_who, Integer isDelete) {
        this.id = id;
        this.visitorname = visitorname;
        this.nickname = nickname;
        this.mobile = mobile;
        this.image = image;
        this.visit_object = visit_object;
        this.reason = reason;
        this.visit_time_start = visit_time_start;
        this.visit_time_end = visit_time_end;
        this.type = type;
        this.create_time = create_time;
        this.create_who = create_who;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "VisitorEntity{" +
                "id=" + id +
                ", visitorname='" + visitorname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", image='" + image + '\'' +
                ", visit_object=" + visit_object +
                ", reason='" + reason + '\'' +
                ", visit_time_start='" + visit_time_start + '\'' +
                ", visit_time_end='" + visit_time_end + '\'' +
                ", type=" + type +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", isDelete=" + isDelete +
                '}';
    }
}
