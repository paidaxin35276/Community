package com.community.entity;

import lombok.Data;

@Data
public class Owner_event_Entity {//客户事件
    private Integer id;
    private Integer owner_id;
    private String event_content;
    private Integer type;
    private String create_time;
    private Integer create_who;
    private Integer isDelete;

    public Owner_event_Entity() {
    }

    public Owner_event_Entity(Integer owner_id, String event_content, Integer type, String create_time, Integer create_who, Integer isDelete) {
        this.owner_id = owner_id;
        this.event_content = event_content;
        this.type = type;
        this.create_time = create_time;
        this.create_who = create_who;
        this.isDelete = isDelete;
    }

    public Owner_event_Entity(Integer id, Integer owner_id, String event_content, Integer type, String create_time, Integer create_who, Integer isDelete) {
        this.id = id;
        this.owner_id = owner_id;
        this.event_content = event_content;
        this.type = type;
        this.create_time = create_time;
        this.create_who = create_who;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Owner_event_Entity{" +
                "id=" + id +
                ", owner_id=" + owner_id +
                ", event_content='" + event_content + '\'' +
                ", type=" + type +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", isDelete=" + isDelete +
                '}';
    }
}
