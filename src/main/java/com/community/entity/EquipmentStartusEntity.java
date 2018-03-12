package com.community.entity;

public class EquipmentStartusEntity {

    private Integer id;
    private String startus;

    public EquipmentStartusEntity() {
    }

    public EquipmentStartusEntity(String startus) {
        this.startus = startus;
    }

    public EquipmentStartusEntity(Integer id, String startus) {
        this.id = id;
        this.startus = startus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartus() {
        return startus;
    }

    public void setStartus(String startus) {
        this.startus = startus;
    }

    @Override
    public String toString() {
        return "EquipmentStartusEntity{" +
                "id=" + id +
                ", startus='" + startus + '\'' +
                '}';
    }
}
