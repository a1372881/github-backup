package com.dida.dao;

import com.dida.pojo.User;

import java.util.List;
import java.util.Map;


public interface UserMapper {

    //查询所有用户
    List<User> getUserList();

    //分页操作
    List<User> uselimit(Map<String, Integer> map);

    //分页操作2
    List<User> Rowbounds();



}
