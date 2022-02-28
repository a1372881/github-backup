package com.dida.find;

import java.util.Arrays;

/**
 * @author 23216
 * @version 1.0
 * @description: 斐波那契查找算法
 * @date 2022/2/19 15:42
 */
public class FibonacciSearch {

    /**
     * 定义常量maxsize为20
     */
    public static int maxSize = 20;

    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,8};
        System.out.println(fibSearch(arr, 8));
    }

    /**
     * 生成一个斐波那契数列
     * @return 返回一个斐波那契数列
     */
    public static int[] fib(){
        int[] f = new  int[maxSize];
        /*
          斐波那契数列的前两位为1
         */
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < maxSize; i++) {
            f[i] = f[i -1]+f[i-2];
        }
        return f;
    }

    /**
     * 使用非递归的方式编写算法
     * @param a 待查找的数组
     * @param key 需要查找的值
     * @return 下标
     */
    public static int fibSearch(int [] a,int key){
        int low = 0;
        int high = a.length-1;
//        表示斐波那契分割数值的下标
        int k = 0;
//        存放mid值
        int mid = 0;
//获取到斐波那契数列
        int[] fib = fib();
        //获取到斐波那契数列的下标
        while (high > fib[k]-1){
            k++;
        }
        /*
          Arrays的copyOf()方法传回的数组是新的数组对象
          改变传回数组中的元素值，不会影响原来的数组。

          copyOf()的第二个自变量指定要建立的新数组长度
          如果新数组的长度超过原数组的长度，则保留数组默认值，
         */
        int[] temp = Arrays.copyOf(a, fib[k]);
        /*
        把temp中为0的填充替换为最后一位的数值
         */
        for (int i = high+1; i < temp.length; i++) {
            temp[i] = a[high];
        }
        //使用while来找到我们能的数key
        while (low <= high){

            mid = low + fib[k-1]-1;
            //向数组的前面查找
            if (key < temp[mid]){
                high = mid-1;
                k--;
            }
            //向数组的后边查找
            else if (key > temp[mid]){
                low = mid +1;
                k-=2;
            }
            //已经找到数了
            else {
                //需要确定返回的是哪个下标
                if (mid <= high){
                    return mid;
                }else {
                    return high;
                }
            }
        }
        return -1;
    }

}
