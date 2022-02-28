package com.dida.list;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 23216
 * @version 1.0
 * @description: list的练习题
 * @date 2022/1/15 9:36
 */
public class ListExercise {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book("西游记",3,"吴承恩"));
        list.add(new Book("水浒传",6,"吴承恩"));
        list.add(new Book("啦啦啦",4,"吴承恩"));


        for (Object o : list) {
            System.out.println(o);
        }

        sort(list);
        System.out.println("排序之后");
        for (Object o : list) {
            System.out.println(o);
        }
    }
    public static void  sort(List list){
        int size = list.size();
        for (int i = 0; i < size-1;i++){
            for (int j = 0 ; j < size-1-i;j++){
                Book o = (Book) list.get(j);
                Book o2 = (Book) list.get(j+1);
                if (o.getPrice() > o2.getPrice()){
                    list.set(j,o2);
                    list.set(j+1,o);
                }
            }
        }
    }
}

class Book{
    private String name;
    private Integer price;
    private String writename;

    public Book(String name, Integer price, String writename) {
        this.name = name;
        this.price = price;
        this.writename = writename;
    }

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

    public String getWritename() {
        return writename;
    }

    public void setWritename(String writename) {
        this.writename = writename;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", writename='" + writename + '\'' +
                '}';
    }
}
