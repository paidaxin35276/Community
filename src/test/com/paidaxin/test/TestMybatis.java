package com.paidaxin.test;

import com.community.dao.MypaidaxinlEntityMapper;
import com.community.entity.MypaidaxinlEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class TestMybatis {
    private SqlSession sqlSession;

    private MypaidaxinlEntityMapper mypaidaxinlEntityMapper;

    //执行@Test方法时 在@Test方法执行前执行
    @Before
    public void testBefore() {
        try {
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            sqlSession = sqlSessionFactory.openSession();
            mypaidaxinlEntityMapper = sqlSession.getMapper(MypaidaxinlEntityMapper.class);
        }catch (IOException e){
            e.printStackTrace();;
        }
    }
//Integer id, String username, String password, String nickname, String mobile, String idcard, String birthday, String address, Integer deptId, Integer postion, Integer status, Date createTime, Integer createWho, Date editTime, Integer editWho, Integer isdemission, Integer isdelete
    @Test
    public void test(){
        mypaidaxinlEntityMapper.insert(new MypaidaxinlEntity(1,"派大星","男"));
    }
    //执行@Test方法时 在@Test方法执行后执行
    @After
    public void testAfter(){
        sqlSession.commit();
        sqlSession.close();
    }
}
