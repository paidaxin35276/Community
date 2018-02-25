package com.community.entity;

import lombok.Data;

@Data
public class NoticeEntity {//通知通告
    private Integer id;//表id
    private String notice;//通知内容
    private Integer rnotice_object;//通知对象类型
    private Integer status;//紧急级别
    private String create_time;//创建时间
    private Integer create_who;//创建人
    private Integer isDelete;//是否已经删除（新增默认为0）

    public NoticeEntity() {
    }

    public NoticeEntity(String notice, Integer rnotice_object, Integer status, String create_time, Integer create_who, Integer isDelete) {
        this.notice = notice;
        this.rnotice_object = rnotice_object;
        this.status = status;
        this.create_time = create_time;
        this.create_who = create_who;
        this.isDelete = isDelete;
    }

    public NoticeEntity(Integer id, String notice, Integer rnotice_object, Integer status, String create_time, Integer create_who, Integer isDelete) {
        this.id = id;
        this.notice = notice;
        this.rnotice_object = rnotice_object;
        this.status = status;
        this.create_time = create_time;
        this.create_who = create_who;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "NoticeEntity{" +
                "id=" + id +
                ", notice='" + notice + '\'' +
                ", rnotice_object=" + rnotice_object +
                ", status=" + status +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", isDelete=" + isDelete +
                '}';
    }
}
