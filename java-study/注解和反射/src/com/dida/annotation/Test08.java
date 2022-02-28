package com.dida.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName Test08
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/14
 * @Version 1.0
 **/
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.dida.annotation.User");


        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println(c1.getCanonicalName());


        Field[] fields = c1.getFields(); //只能找到public属性


        Field[] declaredFields = c1.getDeclaredFields();//找到全部的属性
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }


        Field name = c1.getDeclaredField("name");//获得指定属性的值
        System.out.println(name);

        System.out.println("=========================");

        //获得类的方法
        Method[] methods = c1.getMethods(); //获得本类及其父类的所有方法
        Method[] declaredMethods = c1.getDeclaredMethods();//获得本类的所有方法
        for (Method method : declaredMethods ) {
            System.out.println(method);
        }
        System.out.println("===========================");
        Method getName = c1.getMethod("getName", null);
        System.out.println(getName);



        System.out.println("===========================");

        Constructor[] declaredConstructors = c1.getDeclaredConstructors();//获得所有构造器
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor[] constructors = c1.getConstructors();//获得public构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

    }
}

