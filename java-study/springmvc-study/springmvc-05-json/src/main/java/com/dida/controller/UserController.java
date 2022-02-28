package com.dida.controller;

import com.dida.pojo.User;
import com.dida.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * @ClassName UserController
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/28
 * @Version 1.0
 **/
@RestController
public class UserController {

    @RequestMapping (value = "/json1"/**,produces = "application/json;charset=utf-8"*/)
//    @ResponseBody
    public String json1() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        User user = new User("滴答", 2, "男");
        String s = objectMapper.writeValueAsString(user);
        return s;
    }

    //集合
    @RequestMapping("/json2")
    public String json2() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("滴答01", 4, "男");
        User user2 = new User("滴答02", 4, "男");
        User user3 = new User("滴答03", 4, "男");
        User user4 = new User("滴答04", 4, "男");

        users.add(user4);
        users.add(user3);
        users.add(user2);
        users.add(user1);

        String s = objectMapper.writeValueAsString(users);
        return s;
    }

    //时间
    @RequestMapping("/json3")
    public String json3() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Date date = new Date();
        String s = objectMapper.writeValueAsString(date);
        return s;
    }
    //时间
    @RequestMapping("/json4")
    public String json4() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        //不使用时间戳的方式
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义日期格式对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //指定日期格式
        objectMapper.setDateFormat(simpleDateFormat);

        Date date = new Date();
        String s = objectMapper.writeValueAsString(date);
        return s;
    }
    //使用工具类
    @RequestMapping("/json5")
    public String json5(){
        Date date = new Date();
        String json = JsonUtils.getJson(date);
        return json;
    }

}
