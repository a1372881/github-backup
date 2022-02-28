package com.dida.reflex.access;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 23216
 * @version 1.0
 * @description: 访问方法
 * @date 2022/1/28 10:37
 */
public class AccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.dida.reflex.whyuse.Cat");
        Object o = aClass.newInstance();
        //调用publi的hhh方法
        Method hhh = aClass.getMethod("hhh", String.class);
        //得到方法对象
        // Method hhh1 = aClass.getDeclaredMethod("hhh", String.class);
        //执行
        hhh.invoke(o,"54555");

    }
}
