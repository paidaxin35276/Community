package com.community.entity;

import java.util.Date;

public class EquipmentEntity extends BaseEntity{
    private Integer id;

    private String ename;

    private Integer startus;

    private String edescribe;

    private String create_time;

    private Integer create_who;

    private String edit_time;

    private Integer edit_who;

    private Integer isdelete;

    public EquipmentEntity() {
    }

    public EquipmentEntity(String ename, Integer startus, String edescribe, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isdelete) {
        this.ename = ename;
        this.startus = startus;
        this.edescribe = edescribe;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isdelete = isdelete;
    }

    public EquipmentEntity(Integer id, String ename, Integer startus, String edescribe, String create_time, Integer create_who, String edit_time, Integer edit_who, Integer isdelete) {
        this.id = id;
        this.ename = ename;
        this.startus = startus;
        this.edescribe = edescribe;
        this.create_time = create_time;
        this.create_who = create_who;
        this.edit_time = edit_time;
        this.edit_who = edit_who;
        this.isdelete = isdelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getStartus() {
        return startus;
    }

    public void setStartus(Integer startus) {
        this.startus = startus;
    }

    public String getEdescribe() {
        return edescribe;
    }

    public void setEdescribe(String edescribe) {
        this.edescribe = edescribe;
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

    public String getEdit_time() {
        return edit_time;
    }

    public void setEdit_time(String edit_time) {
        this.edit_time = edit_time;
    }

    public Integer getEdit_who() {
        return edit_who;
    }

    public void setEdit_who(Integer edit_who) {
        this.edit_who = edit_who;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "EquipmentEntity{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", startus=" + startus +
                ", edescribe='" + edescribe + '\'' +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", edit_time='" + edit_time + '\'' +
                ", edit_who=" + edit_who +
                ", isdelete=" + isdelete +
                '}';
    }
}