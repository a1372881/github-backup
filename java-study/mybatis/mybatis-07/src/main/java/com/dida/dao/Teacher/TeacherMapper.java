package com.dida.dao.Teacher;


import com.dida.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {


    Teacher getTeacher();

    Teacher getTeacher2(@Param("id") int id);


}
