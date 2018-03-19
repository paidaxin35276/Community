package com.community.util;

public class UserBuilUtil {
    public String Login(String username,String password){
        return "select * from user where username="+username+" AND password="+password;
    }
}
