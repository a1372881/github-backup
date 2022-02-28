package com.dida.homeWork;

import java.util.ArrayList;

/**
 * @author 23216
 * @version 1.0
 * @description: 使用ArrayList 完成对 对象 Car {name, price} 的各种操作
 * 1.add:添加单个元素
 * 2.remove:删除指定元素
 * Car car = new Car("宝马", 400000);
 * Car car2 = new Car("宾利", 5000000);
 * 3.contains:查找元素是否存在
 * 4.size:获取元素个数
 * 5.isEmpty:判断是否为空
 * 6.clear:清空
 * 7.addAll:添加多个元素
 * 8.containsAll:查找多个元素是否者
 * 9.removeAll：删除多个元素
 * 使用增强for和 迭代器来遍历所有Car的toString
 * @date 2022/1/25 14:35
 */
public class HomeWork02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Car car = new Car("宝马", 400000);
        list.add(car);
        list.add(new Car("宾利", 5000000));
        list.add(new Car("法拉利", 500000000));
        list.remove(2);
        list.contains(car);
        list.size();
        list.isEmpty();
       // list.clear();
        ArrayList list1 = new ArrayList();
        list1.add("test");
        list.addAll(list1);
        list.containsAll(list1);
        list.removeAll(list1);

        for (Object o : list) {
            System.out.println(o.toString());
        }

    }
   static class Car{
     private String name;
     private Integer price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }

        public Car(String name, Integer price) {
            this.name = name;
            this.price = price;
        }
    }
}


