package com.dida.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Test10
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/14
 * @Version 1.0
 **/
//分析性能
public class Test10 {

    //普通调用
    public static void test01(){
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通执行"+(endTime-startTime)+"ms");
    }

    //反射调用
public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    User user = new User();

    Class c1 = user.getClass();

    Method getName = c1.getDeclaredMethod("getName", null);


    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 100000000; i++) {
        getName.invoke(user,null);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("反射执行"+(endTime-startTime)+"ms");
}


    //反射调用 关闭检测

    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();

        Class c1 = user.getClass();

        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射执行"+(endTime-startTime)+"ms");
    }


    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        test01();
        test02();
        test03();
    }

}
