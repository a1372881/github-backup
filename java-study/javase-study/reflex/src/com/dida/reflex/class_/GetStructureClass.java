package com.dida.reflex.class_;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 23216
 * @version 1.0
 * @description: 获取类的结构
 * @date 2022/1/28 9:53
 */
public class GetStructureClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.dida.reflex.whyuse.Cat");
//        1.getName：获取全类名
        System.out.println("全类名："+cls.getName());
//        2.getSimpleName：获取简单类名
        System.out.println("简单类名："+cls.getSimpleName());
//        3.getFields：获取所有public修饰的属性，包含本类以及父类的
        for (Field field : cls.getFields()) {
            System.out.println("公有属性："+field.getName());
        }
//        4.getDeclaredFields：获取本类中所有属性
        for (Field declaredField : cls.getDeclaredFields()) {
            System.out.println("全部属性："+declaredField.getName());
        }
//        5.getMethods：获取所有public修饰的方法，包含本类以及父类的
        for (Method method : cls.getMethods()) {
            System.out.println("公有方法："+method.getName());
        }
//        6.getDeclaredMethods：获取本类中所有方法
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println("全部方法："+method.getName());
        }
//        7.getConstructors：获取本类所有public修饰的构造器
        for (Constructor<?> constructor : cls.getConstructors()) {
            System.out.println("public构造器"+constructor.getName());
        }
//        8.getDeclaredConstructors：获取本类中所有构造器
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            System.out.println("全部构造器"+constructor.getName());
        }
//        9.getPackage：以Package形式返回包信息
        System.out.println(cls.getPackage().getName());
//        10.getSuperClass：以Class形式返回父类信息
        System.out.println(cls.getSuperclass().getName());
//        11.getlnterfaces：以Class]形式返回接口信息
        for (Class<?> anInterface : cls.getInterfaces()) {
            System.out.println(anInterface.getName());
        }
//        12.getAnnotations：以Annotation[]形式返回注解信息
        for (Annotation annotation : cls.getAnnotations()) {
            System.out.println(annotation.toString());
        }
    }
}
