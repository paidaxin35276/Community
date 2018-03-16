package com.community.entity;

import java.util.Date;

public class Engineer_orderEntity {
    private Integer id;

    private Integer form_id;

    private Integer equipment_id;

    private String order_content;

    private String deal_content;

    private String create_time;

    private Integer create_who;

    private String deal_time;

    private Integer deal_who;

    private Integer status;

    private Integer isdelete;

    public Engineer_orderEntity() {
    }

    public Engineer_orderEntity(Integer form_id, Integer equipment_id, String order_content, String deal_content, String create_time, Integer create_who, String deal_time, Integer deal_who, Integer status, Integer isdelete) {
        this.form_id = form_id;
        this.equipment_id = equipment_id;
        this.order_content = order_content;
        this.deal_content = deal_content;
        this.create_time = create_time;
        this.create_who = create_who;
        this.deal_time = deal_time;
        this.deal_who = deal_who;
        this.status = status;
        this.isdelete = isdelete;
    }

    public Engineer_orderEntity(Integer id, Integer form_id, Integer equipment_id, String order_content, String deal_content, String create_time, Integer create_who, String deal_time, Integer deal_who, Integer status, Integer isdelete) {
        this.id = id;
        this.form_id = form_id;
        this.equipment_id = equipment_id;
        this.order_content = order_content;
        this.deal_content = deal_content;
        this.create_time = create_time;
        this.create_who = create_who;
        this.deal_time = deal_time;
        this.deal_who = deal_who;
        this.status = status;
        this.isdelete = isdelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getForm_id() {
        return form_id;
    }

    public void setForm_id(Integer form_id) {
        this.form_id = form_id;
    }

    public Integer getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Integer equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getOrder_content() {
        return order_content;
    }

    public void setOrder_content(String order_content) {
        this.order_content = order_content;
    }

    public String getDeal_content() {
        return deal_content;
    }

    public void setDeal_content(String deal_content) {
        this.deal_content = deal_content;
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

    public String getDeal_time() {
        return deal_time;
    }

    public void setDeal_time(String deal_time) {
        this.deal_time = deal_time;
    }

    public Integer getDeal_who() {
        return deal_who;
    }

    public void setDeal_who(Integer deal_who) {
        this.deal_who = deal_who;
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

    @Override
    public String toString() {
        return "Engineer_orderEntity{" +
                "id=" + id +
                ", form_id=" + form_id +
                ", equipment_id=" + equipment_id +
                ", order_content='" + order_content + '\'' +
                ", deal_content='" + deal_content + '\'' +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", deal_time='" + deal_time + '\'' +
                ", deal_who=" + deal_who +
                ", status=" + status +
                ", isdelete=" + isdelete +
                '}';
    }
}