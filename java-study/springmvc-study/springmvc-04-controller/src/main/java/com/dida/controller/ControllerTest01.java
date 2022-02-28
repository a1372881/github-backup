package com.dida.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName Controller
 * @Description 使用普通方法(实现接口)创建controller
 * @Author lxl
 * @Date 2021/10/27
 * @Version 1.0
 **/
public class ControllerTest01 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","TestController01");
        mv.setViewName("hello");
        return mv;
    }
}
