package com.community.entity;

import java.util.Date;

public class Engineer_orderEntity {
    private Integer id;

    private Integer formId;

    private Integer equipmentId;

    private String orderContent;

    private String dealContent;

    private String createTime;

    private Integer createWho;

    private String dealTime;

    private Integer dealWho;

    private Integer status;

    private Integer isdelete;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    public void setDealContent(String dealContent) {
        this.dealContent = dealContent;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setCreateWho(Integer createWho) {
        this.createWho = createWho;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    public void setDealWho(Integer dealWho) {
        this.dealWho = dealWho;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Engineer_orderEntity() {
    }

    public Engineer_orderEntity(Integer id, Integer formId, Integer equipmentId, String orderContent, String dealContent, String createTime, Integer createWho, String dealTime, Integer dealWho, Integer status, Integer isdelete) {
        this.id = id;
        this.formId = formId;
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

    @Override
    public String toString() {
        return "Engineer_orderEntity{" +
                "id=" + id +
                ", formId=" + formId +
                ", equipmentId=" + equipmentId +
                ", orderContent='" + orderContent + '\'' +
                ", dealContent='" + dealContent + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createWho=" + createWho +
                ", dealTime='" + dealTime + '\'' +
                ", dealWho=" + dealWho +
                ", status=" + status +
                ", isdelete=" + isdelete +
                '}';
    }
}