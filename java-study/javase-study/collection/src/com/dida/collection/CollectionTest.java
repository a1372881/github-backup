package com.dida.collection;

import java.sql.ClientInfoStatus;
import java.util.*;

/**
 * @author 23216
 * @version 1.0
 * @description: 单列集合和双列集合
 * @date 2022/1/13 22:30
 */
public class CollectionTest {
    public static void main(String[] args) {
//        Collection;
//        1）add：添加单个元素
            List list = new ArrayList();
            list.add("1");
//        2）remove：删除指定元素
            list.remove("1");
//        3）contains：查找元素是否存在
            list.contains("1");
//        4）size：获取元素个数
            list.size();
//        5）isEmpty：判断是否为空
            list.isEmpty();
//        6）clear：清空
            list.clear();
//        7）addAll：添加多个元素
        List list2 = new ArrayList();
        list2.add("1");
            list.addAll(list2);
//        8）containsAll：查找多个元素是否都存在
        list.containsAll(list2);
//        9）removeAll：删除多个元素
        list.removeAll(list2);
//        10）说明：以ArrayList实现类来演示。
        List list3 = new ArrayList<>();
        list.add("只存入一个对象");
//        Map
        HashMap hashMap = new HashMap();
        hashMap.put("存入键值对","001");
    }
}
