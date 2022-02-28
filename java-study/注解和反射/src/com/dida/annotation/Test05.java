package com.dida.annotation;

/**
 * @ClassName Test05
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/14
 * @Version 1.0
 **/
public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }

}
class A{
    static {
        System.out.println("A静态代码块初始化");
        m = 300;
    }
    static int m = 100;
    public A(){
        System.out.println("A类的无参构造初始化");
    }
}