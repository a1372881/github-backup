package com.dida.sort;

import java.util.Arrays;

/**
 * @author 23216
 * @version 1.0
 * @description: 选择排序
 * @date 2022/2/6 22:27
 * 从想要排序的数据中，按指定的规则选出某一元素，
 * 再依规定交换位置达到排序的目的
 */
public class ChooseSort {
    public static void main(String[] args) {

        int[] list = {12,4,23,1,4,5,6,4};
        chooseSort(list);
        System.out.println(Arrays.toString(list));
    }

    /**
     *
     * @param list 待排序的数组
     */
    public static void chooseSort(int[] list){
        for (int i = 0; i < list.length -1 ; i++) {
            //最小值索引
            int minIndex = 0;
            //最小值
            int min = list[i];
            for (int j = i + 1; j < list.length; j++) {
                //说明比给定的最小值更小
                if (min > list[j]){
                    //将最小值索引和最小值替换为j
                    min = list[j];
                    minIndex = j;
                }
            }
            //交换
            if (minIndex != i){
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

}
