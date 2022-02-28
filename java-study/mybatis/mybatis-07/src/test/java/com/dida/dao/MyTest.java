package com.dida.dao;

import com.dida.dao.Student.StudentMapper;
import com.dida.dao.Teacher.TeacherMapper;
import com.dida.pojo.Teacher;
import com.dida.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher();
        System.out.println(teacher);


        sqlSession.close();

    }


    @Test
    public void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);


        sqlSession.close();

    }
}
