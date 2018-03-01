package com.community.entity;

import com.community.dao.MypaidaxinlEntityMapper;
import org.apache.ibatis.session.SqlSessionFactory;

public class MypaidaxinlEntity {

    private MypaidaxinlEntityMapper mypaidaxinlEntityMapper;
    private SqlSessionFactory sqlSessionFactory;

    private Integer id;

    private String name;

    private String sex;

    public MypaidaxinlEntity(Integer id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public MypaidaxinlEntity() {
        super();
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}