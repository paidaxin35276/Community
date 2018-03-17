package com.community.util;

import com.community.entity.ComplainEntity;

public class ComplainBuilUtil {

    public String queryComplain(){
        return "select * from complain";
    }

    public String addComplained(ComplainEntity complainEntity){
        int user_id = 1;
        if (null==complainEntity.getUser_id()){

        }else{
            user_id = complainEntity.getUser_id();
        }
        return "insert into complain(user_id, content, create_time, startus,) values ("+user_id+",'"+complainEntity.getContent()+"','"+complainEntity.getCreate_time()+"','"+complainEntity.getStatus()+"')";
    }

    public String updateComplained(ComplainEntity complainEntity){
        return "update complain set content='"+complainEntity.getContent()+"',user_feedback='"+complainEntity.getUser_feedback()+"',user_score='"+complainEntity.getUser_score()+"',startus='"+complainEntity.getStatus()+"' where id='"+complainEntity.getId()+"'";
    }

    //删除数据
    public  String delForComplain(Integer id){
        return "delete from complain where id="+id;
    }

}
