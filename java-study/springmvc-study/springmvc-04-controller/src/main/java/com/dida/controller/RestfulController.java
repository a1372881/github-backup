package com.dida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName RestfulController
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/27
 * @Version 1.0
 **/
@Controller
public class RestfulController {
    @RequestMapping(value = "/add/{a1}/{a2}",method = RequestMethod.POST)
    public String Test01(@PathVariable int a1, @PathVariable int a2, Model model){

        int result = a1+a2;

        model.addAttribute("msg","a1+a2="+result);

        return "hello";
    }
}
