package com.dida;

import com.dida.dao.UserMapper;
import com.dida.pojo.User;
import com.dida.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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

}
