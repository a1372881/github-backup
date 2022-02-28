package com.dida.listener;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//统计网站在线人数：统计session
public class OnlineCoutlistener implements HttpSessionListener {

    //创建session监听
    //session创建就会触发这个方法
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext ctx = httpSessionEvent.getSession().getServletContext();
        Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");
        System.out.println(httpSessionEvent.getSession().getId());

        if (onlineCount == null){
            onlineCount = new Integer(1);
        }else {
            int count = onlineCount.intValue();

            onlineCount = new Integer(count+1);
        }
        ctx.setAttribute("OnlineCount",onlineCount);
    }



    //销毁session监听
    //session被销毁会触发这个方法
    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext ctx = httpSessionEvent.getSession().getServletContext();
        Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");

        if (onlineCount == null){
            onlineCount = new Integer(1);
        }else {
            int count = onlineCount.intValue();

            onlineCount = new Integer(count-1);
        }
        ctx.setAttribute("OnlineCount",onlineCount);
    }

}

