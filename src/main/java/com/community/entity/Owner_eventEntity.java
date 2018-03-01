package com.community.entity;

import java.util.Date;

public class Owner_eventEntity {
    private Integer id;

    private Integer ownerId;

    private String eventContent;

    private Integer type;

    private Date createTime;

    private Integer createWho;

    private Integer isdelete;

    public Owner_eventEntity(Integer id, Integer ownerId, String eventContent, Integer type, Date createTime, Integer createWho, Integer isdelete) {
        this.id = id;
        this.ownerId = ownerId;
        this.eventContent = eventContent;
        this.type = type;
        this.createTime = createTime;
        this.createWho = createWho;
        this.isdelete = isdelete;
    }

    public Owner_eventEntity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateWho() {
        return createWho;
    }

    public void setCreateWho(Integer createWho) {
        this.createWho = createWho;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}