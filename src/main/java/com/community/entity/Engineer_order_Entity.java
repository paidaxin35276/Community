package com.community.entity;

import lombok.Data;

@Data
public class Engineer_order_Entity {
    private Integer id;//工单编号
    private Integer from_id;//原始工单编号
    private Integer equipment_id;//设备编号
    private String order_content;//工单内容
    private String Deal_content;//处理内容
    private String create_time;//创建时间
    private Integer create_who;//创建人
    private String deal_time;//处理时间
    private Integer deal_who;//处理人
    private Integer Status;//状态（1创建2已指派；3已处理4已完成；）
    private Integer isDelete;//是否已经删除（defoult 0）

    public Engineer_order_Entity() {
    }

    public Engineer_order_Entity(Integer from_id, Integer equipment_id, String order_content, String deal_content, String create_time, Integer create_who, String deal_time, Integer deal_who, Integer status, Integer isDelete) {
        this.from_id = from_id;
        this.equipment_id = equipment_id;
        this.order_content = order_content;
        Deal_content = deal_content;
        this.create_time = create_time;
        this.create_who = create_who;
        this.deal_time = deal_time;
        this.deal_who = deal_who;
        Status = status;
        this.isDelete = isDelete;
    }

    public Engineer_order_Entity(Integer id, Integer from_id, Integer equipment_id, String order_content, String deal_content, String create_time, Integer create_who, String deal_time, Integer deal_who, Integer status, Integer isDelete) {
        this.id = id;
        this.from_id = from_id;
        this.equipment_id = equipment_id;
        this.order_content = order_content;
        Deal_content = deal_content;
        this.create_time = create_time;
        this.create_who = create_who;
        this.deal_time = deal_time;
        this.deal_who = deal_who;
        Status = status;
        this.isDelete = isDelete;

    }

    @Override
    public String toString() {
        return "Engineer_order_Entity{" +
                "id=" + id +
                ", from_id=" + from_id +
                ", equipment_id=" + equipment_id +
                ", order_content='" + order_content + '\'' +
                ", Deal_content='" + Deal_content + '\'' +
                ", create_time='" + create_time + '\'' +
                ", create_who=" + create_who +
                ", deal_time='" + deal_time + '\'' +
                ", deal_who=" + deal_who +
                ", Status=" + Status +
                ", isDelete=" + isDelete +
                '}';
    }
}
