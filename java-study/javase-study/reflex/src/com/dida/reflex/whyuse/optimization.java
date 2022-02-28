package com.dida.reflex.whyuse;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 23216
 * @version 1.0
 * @description: 对于反射执行时间长的代码实现
 * @date 2022/1/27 22:57
 */
public class optimization {

    //传统方法调用
    @Test
    public void old(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            cat.test();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法 耗时=" + (end - start));
    }

    //反射调用
    @Test
    public void reflex() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        long start = System.currentTimeMillis();
        Class cls = Class.forName("com.dida.reflex.whyuse.Cat");
        Object o = cls.newInstance();
        Method test = cls.getMethod("test");
        for (int i = 0; i < 10000000; i++) {
            test.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("普通反射 耗时=" + (end - start));
    }

    //优化反射调用
    @Test
    public void news() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        long start = System.currentTimeMillis();
        Class cls = Class.forName("com.dida.reflex.whyuse.Cat");
        Object o = cls.newInstance();
        Method test = cls.getMethod("test");
        test.setAccessible(true);//取消访问检查
        for (int i = 0; i < 10000000; i++) {
            test.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("取消访问检查 耗时=" + (end - start));
    }
}
