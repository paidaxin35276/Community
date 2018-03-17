package com.community.controller;

import com.community.dao.MypaidaxinlEntityMapper;
import com.community.entity.MypaidaxinlEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("paidaxin")
public class MypaidaxinController {

    @Autowired
    private MypaidaxinlEntityMapper mypaidaxinlEntityMapper;

    @RequestMapping("addPaidaxin")
    public String addPaidaxin(MypaidaxinlEntity mypaidaxinlEntity){
        System.out.println(mypaidaxinlEntity.getName());
        return "success";
    }
}
