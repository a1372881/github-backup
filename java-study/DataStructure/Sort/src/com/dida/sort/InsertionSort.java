package com.dida.sort;

import java.util.Arrays;

/**
 * @author 23216
 * @version 1.0
 * @description: 插入排序
 * @date 2022/2/6 22:53
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {12,4,23,1,4,5,6,4};
        insertSort(list);
        System.out.println(Arrays.toString(list));


    }

    /**
     *
     * @param list 待排序的list
     */
    public static void insertSort(int[] list){
        //插入的值
        int insertVal = 0;
        //插入的值的索引
        int insertIndex = 0;
        for (int i = 0; i < list.length; i++) {
            //待插入的数
            insertVal = list[i];
            insertIndex = i -1;
            /*
              1. insertIndex >= 0 保证数组下标不越界
              2. insertVal < list[insertIndex] 待插入的数，还没有找到插入位置，需要将list[insertIdex]后移
             */
            while (insertIndex >= 0 && insertVal < list[insertIndex]){
                list[insertIndex +1] = list[insertIndex];
                insertIndex --;
            }
            //退出了while循环，说明找到了插入的位置，判断是否需要赋值
            if (insertIndex + 1 != i){
                list[insertIndex + 1] = insertVal;
            }
        }
    }
}
