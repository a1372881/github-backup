package com.dida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName ResultGo
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/27
 * @Version 1.0
 **/
@Controller
@RequestMapping("/result")
public class ResultGo {

    //通过HttpServletResponse进行输出
    @RequestMapping("/t1")
    public void test1(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("hello,springby servlrt API");
    }

    //通过HttpServletResponse实现重定向
    @RequestMapping("/t2")
    public void test2(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/index.jsp");
    }

    //通过HttpServletResponse实现转发
    @RequestMapping("/t3")
    public void test3(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setAttribute("msg","/result/t3");
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);
    }
}
