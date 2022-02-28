package com.dida.dao;

import com.dida.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


public interface UserMapper {

    //查询所有用户
    @Select("select * from mybatis;")
    List<User> getUserList();

    //增加用户
    @Insert("insert into mybatis.mybatis (id,name,pwd) values (#{id},#{name},#{pwd});")
    int addUser(User user);

    //修改用户
    @Update("update mybatis.mybatis set name = #{name},pwd = #{pwd} where id = #{id};")
    int updateUser(User user);

    //删除用户
    @Delete("delete from mybatis where id = #{id};")
    int delUser(@Param("id")int id);


}
