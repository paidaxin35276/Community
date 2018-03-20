package com.community.entity;

import java.util.List;

public class MeunEntity extends BaseEntity{
    private Integer id;
    private String name;
    private Integer pid;
    private Integer lv;
    private List<MeunEntity> list;
    private String html_url;

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

    public List<MeunEntity> getList() {
        return list;
    }

    public void setList(List<MeunEntity> list) {
        this.list = list;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public MeunEntity() {
    }

    public MeunEntity(String name, Integer pid, Integer lv, List<MeunEntity> list, String html_url) {
        this.name = name;
        this.pid = pid;
        this.lv = lv;
        this.list = list;
        this.html_url = html_url;
    }

    public MeunEntity(Integer id, String name, Integer pid, Integer lv, List<MeunEntity> list, String html_url) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.lv = lv;
        this.list = list;
        this.html_url = html_url;
    }

    @Override
    public String toString() {
        return "MeunEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", lv=" + lv +
                ", list=" + list +
                ", html_url='" + html_url + '\'' +
                '}';
    }
}
