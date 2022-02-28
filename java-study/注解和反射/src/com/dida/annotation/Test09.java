package com.dida.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Test09
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/14
 * @Version 1.0
 **/
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("com.dida.annotation.User");

//        User o = (User) c1.newInstance();
//        System.out.println(o);
//
        //通过构造器创建对象
        //通过调用有参构造
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        Object dida = declaredConstructor.newInstance("dida", 1, 14);
        System.out.println(dida);

        //通过反射调用方法
        User user3 = (User) c1.newInstance();
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);

        //invoke:激活
        setName.invoke(user3,"lala");
        System.out.println(user3.getName());


        //通过反射操作属性
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");

        //关闭权限检测可以检测到privite属性
        name.setAccessible(true);
        name.set(user4,"lalalallallal");
        System.out.println(user4.getName());
    }
}
