package com.community.entity;

public class MeunEntity {
    private Integer id;
    private String name;
    private Integer pid;
    private Integer lv;

    @Override
    public String toString() {
        return "MeunEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", lv=" + lv +
                '}';
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public MeunEntity() {
    }

    public MeunEntity(Integer id, String name, Integer pid, Integer lv) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.lv = lv;
    }
}
