package com.dida.annotation;

import java.lang.annotation.ElementType;

/**
 * @ClassName Test04
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/14
 * @Version 1.0
 **/
public class Test04 {
    public static void main(String[] args) {
        Class C1 = Object.class;
        Class C2 = Comparable.class;
        Class C3 = String[].class;
        Class C4 = int[][].class;
        Class C5 = Override.class;
        Class C6 = ElementType.class;
        Class C7 = Integer.class;
        Class C8 = void.class;
        Class C9 = Class.class;

        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println(C4);
        System.out.println(C5);
        System.out.println(C6);
        System.out.println(C7);
        System.out.println(C8);
        System.out.println(C9);







    }
}
