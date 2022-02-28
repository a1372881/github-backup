package com.dida.reflex.create;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 23216
 * @version 1.0
 * @description: 使用反射创建对象
 * @date 2022/1/28 10:27
 */
public class CreateObject {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1.使用public构造器创建
        Class<?> cls = Class.forName("com.dida.reflex.whyuse.Cat");
        Object o = cls.newInstance();

        //2.使用指定的构造器
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);//暴力破解
        declaredConstructor.newInstance("hi");


    }
}
