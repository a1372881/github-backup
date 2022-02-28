package com.dida.controller;

import com.dida.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName UserController
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/27
 * @Version 1.0
 **/
@Controller
public class UserController {
    @RequestMapping("/hi")
    public String hi(@RequestParam("hello")String hi){
        System.out.println(hi);
        return "hello";
    }
    @RequestMapping("/add")
    public String add(User user){
        System.out.println(user.getName());
        return "hello";
    }
    @RequestMapping("/hhh")
    public String hello(@RequestParam("username") String name, ModelMap model){
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        model.addAttribute("msg",name);
        System.out.println(name);
        return "hello";
    }
    @RequestMapping("/model")
    public String modeltest(@RequestParam("username") String name, Model model){
        model.addAttribute("msg",name);
        System.out.println(name);
        return "hello";
    }
}
