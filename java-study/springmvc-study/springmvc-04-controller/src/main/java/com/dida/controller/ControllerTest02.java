package com.dida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ControllerTest02
 * @Description 使用注解实现controller
 * @Author lxl 以便后人阅读我的代码
 * @Date 2021/10/27
 * @Version 1.0
 **/
@Controller
@RequestMapping("/test02")
public class ControllerTest02 {

    @RequestMapping("/t2")
    public String controllerTest02(Model model){
        model.addAttribute("msg","controllerTest02");
        return "hello";
    }
}
