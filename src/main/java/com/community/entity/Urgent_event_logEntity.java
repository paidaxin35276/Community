package com.community.entity;

import java.util.Date;

public class Urgent_event_logEntity {
    private Integer id;

    private Integer eventId;

    private Integer assigner;

    private String assignerTime;

    private Integer handler;

    private String handleTime;

    private String handleContents;

    private Integer status;

    private Integer isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getAssigner() {
        return assigner;
    }

    public void setAssigner(Integer assigner) {
        this.assigner = assigner;
    }

    public String getAssignerTime() {
        return assignerTime;
    }

    public void setAssignerTime(String assignerTime) {
        this.assignerTime = assignerTime;
    }

    public Integer getHandler() {
        return handler;
    }

    public void setHandler(Integer handler) {
        this.handler = handler;
    }

    public String getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(String handleTime) {
        this.handleTime = handleTime;
    }

    public String getHandleContents() {
        return handleContents;
    }

    public void setHandleContents(String handleContents) {
        this.handleContents = handleContents;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Urgent_event_logEntity() {
    }

    public Urgent_event_logEntity(Integer eventId, Integer assigner, String assignerTime, Integer handler, String handleTime, String handleContents, Integer status, Integer isdelete) {
        this.eventId = eventId;
        this.assigner = assigner;
        this.assignerTime = assignerTime;
        this.handler = handler;
        this.handleTime = handleTime;
        this.handleContents = handleContents;
        this.status = status;
        this.isdelete = isdelete;
    }

    public Urgent_event_logEntity(Integer id, Integer eventId, Integer assigner, String assignerTime, Integer handler, String handleTime, String handleContents, Integer status, Integer isdelete) {
        this.id = id;
        this.eventId = eventId;
        this.assigner = assigner;
        this.assignerTime = assignerTime;
        this.handler = handler;
        this.handleTime = handleTime;
        this.handleContents = handleContents;
        this.status = status;
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "Urgent_event_logEntity{" +
                "id=" + id +
                ", eventId=" + eventId +
                ", assigner=" + assigner +
                ", assignerTime='" + assignerTime + '\'' +
                ", handler=" + handler +
                ", handleTime='" + handleTime + '\'' +
                ", handleContents='" + handleContents + '\'' +
                ", status=" + status +
                ", isdelete=" + isdelete +
                '}';
    }
}