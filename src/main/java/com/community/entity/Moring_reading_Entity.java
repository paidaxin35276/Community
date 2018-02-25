package com.community.entity;

import lombok.Data;

@Data
public class Moring_reading_Entity {//晨读
    private Integer id;//表id
    private Integer user_id;//用户id
    private String reading_time;//晨报时间
    private String reading_content;//晨报内容
    private String create_time;//创建时间
    private String edit_time;//编辑时间
    private Integer isDelete;//是否已经删除（新增默认为0）

    public Moring_reading_Entity() {
    }

    public Moring_reading_Entity(Integer user_id, String reading_time, String reading_content, String create_time, String edit_time, Integer isDelete) {
        this.user_id = user_id;
        this.reading_time = reading_time;
        this.reading_content = reading_content;
        this.create_time = create_time;
        this.edit_time = edit_time;
        this.isDelete = isDelete;
    }

    public Moring_reading_Entity(Integer id, Integer user_id, String reading_time, String reading_content, String create_time, String edit_time, Integer isDelete) {
        this.id = id;
        this.user_id = user_id;
        this.reading_time = reading_time;
        this.reading_content = reading_content;
        this.create_time = create_time;
        this.edit_time = edit_time;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Moring_reading_Entity{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", reading_time='" + reading_time + '\'' +
                ", reading_content='" + reading_content + '\'' +
                ", create_time='" + create_time + '\'' +
                ", edit_time='" + edit_time + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
