package com.dida.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取要下载的文件路径
        //String realPath = this.getServletContext().getRealPath("/1.jpg");
        String realPath = "E:\\java-study\\javaweb-02-servlet\\response\\src\\main\\resources";
        //获取文件名
        System.out.println(realPath);
        String filename = realPath.substring(realPath.lastIndexOf("\\") + 1);
        //设置浏览器支持下载
        resp.setHeader("Content-disposition","attachment;filename="+filename);
        //获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
        //创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        //获取Outputstream对象
        ServletOutputStream out = resp.getOutputStream();
        //将FileOutputstream流写入到buffer缓冲区，使用Outputstream将缓冲区输出到客户端
        while ((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }
        in.close();
        out.close();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
