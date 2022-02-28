package com.dida.reflex.access;

import java.lang.reflect.Field;

/**
 * @author 23216
 * @version 1.0
 * @description: 访问属性
 * @date 2022/1/28 10:37
 */
public class AccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.dida.reflex.whyuse.Cat");
        Object o = aClass.newInstance();
        System.out.println(o.getClass());
        //使用反射操作公有属性
        Field hi = aClass.getField("hi");
        hi.set(o,"你好");
        //使用反射操作私有属性
        Field hello = aClass.getField("hello");
        hello.setAccessible(true); //暴力破解
        hello.set(o,"哈哈哈哈");
    }
}
