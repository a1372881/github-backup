package com.dida.annotation;

/**
 * @ClassName Test06
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/14
 * @Version 1.0
 **/
public class Test06 {
    static {
        System.out.println("Main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        SON son = new SON();
//
//        Class<?> aClass = Class.forName("com.dida.annotation.SON");
//        System.out.println(aClass);

        //不会产生类的引用的方法
      //  System.out.println(SON.b);

        //指挥加载main类
      //  SON[] array = new SON[5];

        //常量在链接阶段已经存入常量池中
        System.out.println(SON.M);

    }
}

class Father{

    static int b = 2;

    static {
        System.out.println("父类被加载");
    }
}

class SON extends Father{

    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M =1;
}