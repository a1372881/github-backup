package com.dida;

import com.dida.dao.UserMapper;
import com.dida.pojo.User;
import com.dida.utils.MybatisUtils;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
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
    public void log4j(){
        Logger logger = Logger.getLogger(UserMapperTest.class);
        logger.info("进入log测试方法");
        logger.error("error");
        logger.debug("debug");
    }

    @Test
    public void limit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Integer> map = new HashMap<>();
        map.put("start",0);
        map.put("page",1);

        List<User> users = mapper.uselimit(map);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void Rowbounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        RowBounds rowBounds = new RowBounds(0, 1);
        List<User> list = sqlSession.selectList("com.dida.dao.UserMapper.Rowbounds",null,rowBounds);

        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }

}
