package com.dida.homeWork;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 23216
 * @version 1.0
 * @description: 按要求完成下列任务
 * 1）使用HashMap类实例化一个Map类型的对象m，键（String）和值（int）分别用于存储员工的姓名和工资，存入数据如下：jack-650元；tom-1200元；smith——2900元；
 * 2）将jack的工资更改为2600元
 * 3）为所有员工工资加薪100元；
 * 4）遍历集合中所有的员工
 * 5) 遍历集合中所有的工资
 * @date 2022/1/25 15:42
 */
public class HomeWork03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);


        hashMap.put("jack",2600);


        Set set = hashMap.keySet();
        for (Object o : set) {
            Integer o1 = (Integer) hashMap.get(o);
            hashMap.put(o,o1+100);
            Integer o2 = (Integer) hashMap.get(o);
            System.out.println(o + "=" + o2);
        }

    }
}
