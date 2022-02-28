package com.dida.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 23216
 * @version 1.0
 * @description: 课堂练习
 * @date 2022/1/14 21:44
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Collection dog = new ArrayList();
        dog.add(new Dog("ybb",5));
        dog.add(new Dog("大yb",6));

        Iterator iterator = dog.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.toString());
        }

        for (Object o : dog) {
            System.out.println(o.toString());
        }
    }


}
class Dog{
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
