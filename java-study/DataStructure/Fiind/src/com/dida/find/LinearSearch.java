package com.dida.find;

/**
 * @author 23216
 * @version 1.0
 * @description: 线性查找算法
 * 循环遍历数列，判断数列中是否有查找的值
 * @date 2022/2/16 14:32
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] ls = {1,2,4,56,4,2,5};
        int isfind = 0;
        int wantfind = 2;
        for (int i = 0; i < ls.length; i++) {
            int find = ls[i];
            if (find == wantfind){
                isfind =1;
                System.out.println("查找的值的下标为："+i);
            }
        }
        if (isfind == 0){
            System.out.println("没有找到值");
        }

    }
}
