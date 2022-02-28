package com.dida.reflex.homework;

import java.lang.reflect.Field;

/**
 * @author 23216
 * @version 1.0
 * @description: 修改私有成员变量
 * @date 2022/1/28 10:58
 */
public class HomeWork01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.dida.reflex.homework.PrivateTest");
        PrivateTest o = (PrivateTest) aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"hhh");
        System.out.println(o.getName());
    }
}
