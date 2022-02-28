package com.dida.dao;

import com.dida.dao.Student.StudentMapper;
import com.dida.pojo.Student;
import com.dida.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class StudentTestt {

    @Test
    public void StudentMapper(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student students : student) {
            Logger.getLogger(StudentTestt.class).info(students);
        }
        sqlSession.close();
    }


    @Test
    public void StudentMapper2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student2 = mapper.getStudent2();
        for (Student students : student2) {
            Logger.getLogger(StudentTestt.class).info(students);
        }
        sqlSession.close();
    }

}
