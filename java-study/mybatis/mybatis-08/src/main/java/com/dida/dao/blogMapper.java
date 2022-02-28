package com.dida.dao;

import com.dida.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface blogMapper {

    int addblog(Blog blog);

    List<Blog> findByanything(Map map);

    List<Blog> findByanything2(Map map);

    List<Blog> useByforeach(Map map);
}
