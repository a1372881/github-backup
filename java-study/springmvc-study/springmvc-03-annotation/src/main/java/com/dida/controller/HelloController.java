package com.dida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/27
 * @Version 1.0
 **/
@Controller
@RequestMapping("/HelloController")
public class HelloController {

    @RequestMapping("/hello")
    public String   sayHello(Model model){
        model.addAttribute("msg","hello,springmvc");
        return "hello";
    }
}
