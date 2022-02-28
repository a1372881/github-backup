package com.dida.dao;

import com.dida.pojo.User;
import com.dida.utils.MybatisUtils;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public  void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

        @Test
        public  void getUserLike(){
            SqlSession sqlSession = MybatisUtils.getSqlSession();

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            List<User> userLike = userMapper.getUserLike("d");
            for (User user : userLike){
                System.out.println(user);
            }
            sqlSession.close();
        }


        @Test
    public void getUserID(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User id = mapper.getUserByID(1);
        System.out.println(id);
        sqlSession.close();
    }


    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User(2,"李四","123456"));

        //关闭事务 执行增删改业务必须写
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(2,"hh","2222"));

        //关闭事务 执行增删改业务必须写
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.delUserByID(1);

        //关闭事务 执行增删改业务必须写
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void addUserBymap(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("userid",3);
        map.put("username" , "dida");
        map.put("pwd","1234565");

        mapper.addUsermap(map);

        //关闭事务 执行增删改业务必须写
        sqlSession.commit();
        sqlSession.close();
    }



}
