package com.dida.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 23216
 * @version 1.0
 * @description: 迭代器遍历
 * @date 2022/1/14 20:57
 */

public class CollectionIterator {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Animal("小兔子",10));
        list.add(new Animal("小老虎",9));
        list.add(new Animal("长颈鹿",6));
        list.add(new Animal("小乌龟",19));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("取出的对象为："+next.toString());
        }
    }
}

class Animal {
    private String name;
    private Integer age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
