package com.community.entity;

public class DepatmentEntity {
    private Integer id;

    private String depatmentName;

    public DepatmentEntity(Integer id, String depatmentName) {
        this.id = id;
        this.depatmentName = depatmentName;
    }

    public DepatmentEntity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepatmentName() {
        return depatmentName;
    }

    public void setDepatmentName(String depatmentName) {
        this.depatmentName = depatmentName;
    }
}