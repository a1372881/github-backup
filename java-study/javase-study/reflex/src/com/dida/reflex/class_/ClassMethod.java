package com.dida.reflex.class_;

import com.dida.reflex.whyuse.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 23216
 * @version 1.0
 * @description: class类的常用方法
 * @date 2022/1/28 9:35
 */
public class ClassMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //| static Class forName(String name) | 返回指定类名name的Class 对象
        //<?>表示不确定的java类型
        Class<?> cls = Class.forName("com.dida.reflex.whyuse.Cat");
        //| Object newInstance()              | 调用缺省构造函数，返回该Class对象的一个实例
        Object o = cls.newInstance();
        //| getName()                         | 返回该Class对象所代表的实体名称
        System.out.println(cls.getName());
        //| Class [] getInterfaces()          | 获取当前Class对象的接口
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> anInterface : interfaces) {

        }
        //| ClassLoader getClassLoader()      | 返回该类的类加载器
        ClassLoader classLoader = cls.getClassLoader();
        //| Class getSuperclass()             | 返回表示此class所表示的试题的超类的Class
        cls.getSuperclass();
        //| Constructor[] getConstructors()   | 返回包含某些Constructor对象的数组
        cls.getConstructors();
        //| Field[] getDeclaredFields()       | 返回Field对象的数组
        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field.getName());
        }
        //| Method getMethod                  | 返回一个Method对象，此对象的形参为paramType
        Method hi = cls.getMethod("hi");
        hi.invoke(o);
    }
}
