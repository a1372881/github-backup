package com.dida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ResultSpringMVC
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/27
 * @Version 1.0
 **/
@Controller
@RequestMapping("/rsm")
public class ResultSpringMVC {
    @RequestMapping("t1")
    public String test1(){
        //转发
        return "/index.jsp";
    }

    @RequestMapping("t2")
    public String test2(){
        //转发
        return "forward:/index.jsp";
    }
    @RequestMapping("t3")
    public String test3(){
        //重定向
        return "redirect:/index.jsp";
    }
}
