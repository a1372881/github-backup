package com.dida.reflex.whyuse;

import javafx.scene.chart.CategoryAxis;

import java.security.PublicKey;

/**
 * @author 23216
 * @version 1.0
 * @description: cat类用来对比传统和反射两种方法
 * @date 2022/1/27 22:40
 */
public class Cat {

    public String hi;
    private String hello;


    public void hi(){
        System.out.println("hi");
    }
    public void hello(){
        System.out.println("hello");
    }

    public void hhh(String jjo){
        System.out.println("jjo");
    }
    public Integer test(){
        int i = 1;
        int o = 9;
        return i + o;
    }

    public Cat(){

    }

    private Cat(String hi){
        this.hi=hi;
    }
}
