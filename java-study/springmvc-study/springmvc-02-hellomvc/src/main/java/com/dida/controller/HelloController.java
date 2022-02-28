package com.dida.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName HelloController
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/25
 * @Version 1.0
 **/
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","HelloMVC");

        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
