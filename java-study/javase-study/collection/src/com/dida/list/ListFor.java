package com.dida.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 23216
 * @version 1.0
 * @description: 如何遍历list
 * @date 2022/1/15 9:32
 */
public class ListFor {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("test01");
        list.add("test02");
        System.out.println("====使用迭代器====");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("====使用增强for====");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("====使用循环for====");
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
    }
}
