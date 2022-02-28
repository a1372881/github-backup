package com.dida.dao;

import com.dida.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {

    //查询所有用户
    List<User> getUserList();

    //查询指定用户
    User getUserByID(@Param("id") int id);

    //增加用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int delUserByID(int id);




}
