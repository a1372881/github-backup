package com.dida.filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    //chain : 链
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("test/html;charset=UTF-8");

        System.out.println("");
        filterChain.doFilter(servletRequest,servletResponse);//让请求继续执行，如果不写程序到这里就被拦截停止了

    }

    public void destroy() {
        System.out.println("销毁");

    }
}
