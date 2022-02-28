package com.dida.dao;

import com.dida.pojo.User;

import java.util.List;
import java.util.Map;


public interface UserMapper {

    //查询所有用户
    List<User> getUserList();


    List<User> getUserLike(String value);


    //查询指定用户
    User getUserByID(int id);

    //map查询
    int addUsermap(Map <String, Object> map);

    //增加用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int delUserByID(int id);



}
