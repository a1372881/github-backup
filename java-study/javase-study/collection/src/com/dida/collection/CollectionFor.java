package com.dida.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 23216
 * @version 1.0
 * @description: 使用增强for循环取出集合的值
 * @date 2022/1/14 21:13
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Animal("小兔子",10));
        list.add(new Animal("小老虎",9));
        list.add(new Animal("长颈鹿",6));
        list.add(new Animal("小乌龟",19));

        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}
