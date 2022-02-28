package com.dida.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 23216
 * @version 1.0
 * @description: 关于list接口的常用方法
 * @date 2022/1/15 9:24
 */
@SuppressWarnings({"all"})
public class ListMethod {
    public static void main(String[] args) {
        //List 集合里添加了一些根据索引来操作集合元素的方法
        List list = new ArrayList();
        //1）void add（int index，Object ele）：在index位置插入ele元素
        list.add("test");
        list.add(0,"test01");
        System.out.println(list);
        //2）boolean addAll（int index，Collection eles）：从index位置开始将eles中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("test04");
        list2.add("test");
        list2.add(0,"test02");
        list.addAll(list2);
        System.out.println(list);
        //3）Object get（int index）：获取指定index位置的元素
        System.out.println(list.get(0));
        //4）int indexOf（Object obj）：返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("test"));
        //5）int lastindexOf（Object obj）：返回obj在当前集合中末次出现的位置
        System.out.println(list.lastIndexOf("test"));
        //6）Object remove（int index）：移除指定index位置的元素，并返回此元素
        System.out.println(list.remove(3));
        //7）object set（int index，Object ele）：设置指定index位置的元素为ele，相当于是替换。
        System.out.println(list.set(1, "hhhhh"));
        //8）List subList（int fromlndex，int tolndex）：返回从fromlndex到tolndex位置的子集合
        System.out.println(list.subList(0, 3));
    }
}
