package com.community.entity;

import lombok.Data;

@Data
public class Urgent_event_log_Entity {//紧急事件处理
    private Integer id;//表id
    private Integer event_id;//事件id
    private Integer assigner;//分配者
    private String assigner_time;//分配时间（创建时间）
    private Integer handler;//指派的处理者
    private String handle_time;//处理时间
    private String handle_contents;//处理内容
    private Integer status;//状态（2已指派、待处理；3已处理、待反馈；4已完成；5反馈未完成、重新指派）
    private Integer isDelete;//是否已经删除（新增默认为0）

    @Override
    public String toString() {
        return "Urgent_event_log_Entity{" +
                "id=" + id +
                ", event_id=" + event_id +
                ", assigner=" + assigner +
                ", assigner_time='" + assigner_time + '\'' +
                ", handler=" + handler +
                ", handle_time='" + handle_time + '\'' +
                ", handle_contents='" + handle_contents + '\'' +
                ", status=" + status +
                ", isDelete=" + isDelete +
                '}';
    }

    public Urgent_event_log_Entity() {
    }

    public Urgent_event_log_Entity(Integer event_id, Integer assigner, String assigner_time, Integer handler, String handle_time, String handle_contents, Integer status, Integer isDelete) {
        this.event_id = event_id;
        this.assigner = assigner;
        this.assigner_time = assigner_time;
        this.handler = handler;
        this.handle_time = handle_time;
        this.handle_contents = handle_contents;
        this.status = status;
        this.isDelete = isDelete;
    }

    public Urgent_event_log_Entity(Integer id, Integer event_id, Integer assigner, String assigner_time, Integer handler, String handle_time, String handle_contents, Integer status, Integer isDelete) {
        this.id = id;
        this.event_id = event_id;
        this.assigner = assigner;
        this.assigner_time = assigner_time;
        this.handler = handler;
        this.handle_time = handle_time;
        this.handle_contents = handle_contents;
        this.status = status;
        this.isDelete = isDelete;
    }
}
