package com.dida.sort;

import com.dida.test.Time;

import java.util.Arrays;
import java.util.List;
import java.util.Timer;

/**
 * @author 23216
 * @version 1.0
 * @description: 冒泡排序
 * @date 2022/2/6 19:59
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] list= {1,3,45,2,5,2,1};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));

        //进行用时测试
        Time time = new Time();
        String s = time.useTime();
        System.out.println(s);
        int[] ls = time.getList(100000);
        bubbleSort(ls);
        String s1 = time.useTime();
        System.out.println(s1);

    }

    /**
     * 冒泡排序方法
     * @param list 待排序的list
     *             内层for循环是为了得到j和j+1的元素
     *             外层for循环是为了推进j的位置
     */
    public static void bubbleSort(int[] list){
        //遍历list的元素次
        for (int i = 0; i < list.length -1; i++) {
            int item;
            //j取出list的元素
            for (int j = 0; j < list.length - 1 - i; j++) {
                //判断当前元素和下一个元素大小
                if (list[j] > list[j+1]){
                    //将j所在的索引和j+1互换
                    item = list[j];
                    list[j] = list[j+1];
                    list[j+1] = item;
                }
            }
        }

    }



}
