package com.community.entity;

import java.util.Date;

public class Owner_eventEntity extends BaseEntity{
    private Integer id;

    private Integer owner_id;

    private String event_content;

    private Integer type;

    private String create_time;

    private Integer create_who;

    private Integer isDelete;

    public Owner_eventEntity(Integer id, Integer owner_id, String event_content, Integer type, String create_time, Integer create_who, Integer isDelete) {
        this.id = id;
        this.owner_id = owner_id;
        this.event_content = event_content;
        this.type = type;
        this.create_time = create_time;
        this.create_who = create_who;
        this.isDelete = isDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public String getEvent_content() {
        return event_content;
    }

    public void setEvent_content(String event_content) {
        this.event_content = event_content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Integer getCreate_who() {
        return create_who;
    }

    public void setCreate_who(Integer create_who) {
        this.create_who = create_who;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Owner_eventEntity() {
    }

    @Override
    public String toString() {
        return "Owner_eventEntity{" +
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