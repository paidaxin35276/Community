package com.community.entity;

import java.util.Date;

public class Engineer_orderEntity {
    private Integer id;

    private Integer fromId;

    private Integer equipmentId;

    private String orderContent;

    private String dealContent;

    private Date createTime;

    private Integer createWho;

    private Date dealTime;

    private Integer dealWho;

    private Integer status;

    private Integer isdelete;

    public Engineer_orderEntity(Integer id, Integer fromId, Integer equipmentId, String orderContent, String dealContent, Date createTime, Integer createWho, Date dealTime, Integer dealWho, Integer status, Integer isdelete) {
        this.id = id;
        this.fromId = fromId;
        this.equipmentId = equipmentId;
        this.orderContent = orderContent;
        this.dealContent = dealContent;
        this.createTime = createTime;
        this.createWho = createWho;
        this.dealTime = dealTime;
        this.dealWho = dealWho;
        this.status = status;
        this.isdelete = isdelete;
    }

    public Engineer_orderEntity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    public String getDealContent() {
        return dealContent;
    }

    public void setDealContent(String dealContent) {
        this.dealContent = dealContent;
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

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public Integer getDealWho() {
        return dealWho;
    }

    public void setDealWho(Integer dealWho) {
        this.dealWho = dealWho;
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
}