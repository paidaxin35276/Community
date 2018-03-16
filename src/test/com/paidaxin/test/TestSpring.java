package com.paidaxin.test;

import com.community.dao.MypaidaxinlEntityMapper;
import com.community.entity.MypaidaxinlEntity;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestSpring {
    @Test
    public void test(){
        String createTime = new Date()+"";
        System.out.println(createTime);
    }
}
