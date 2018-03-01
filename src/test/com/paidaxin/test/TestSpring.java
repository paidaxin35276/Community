package com.paidaxin.test;

import com.community.dao.MypaidaxinlEntityMapper;
import com.community.entity.MypaidaxinlEntity;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MypaidaxinlEntityMapper mypaidaxinlEntityMapper = (MypaidaxinlEntityMapper) applicationContext.getBean("mypaidaxinlEntityMapper");
        mypaidaxinlEntityMapper.insert(new MypaidaxinlEntity(2,"派大星","男"));
    }
}
