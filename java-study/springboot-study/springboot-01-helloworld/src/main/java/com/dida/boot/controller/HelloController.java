package com.dida.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/11/1
 * @Version 1.0
 **/
@Controller
public class HelloController {

    @ResponseBody //返回的是json字符串，不返回页面所以使用reponsebody注解
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello,Spring Boot 2!";
    }
}
