package com.dida.sort;

/**
 * @author 23216
 * @version 1.0
 * @description: 希尔排序
 * @date 2022/2/7 16:53
 * 希尔排序是将待排序的数组元素 按下标的一定增量分组 ，
 * 分成多个子序列，然后对各个子序列进行直接插入排序算法排序；
 * 然后依次缩减增量再进行排序，直到增量为1时，进行最后一次直接插入排序，
 * 排序结束。
 */
public class ShellSort {
    public static void main(String[] args) {

    }

    /**
     * 使用交换法完成的希尔排序
     * @param arr 待排序的数组
     */
    public static void shellSort(int[] arr){
        int temp = 0;
        int count = 0;
        for (int gap = arr.length/2; gap > 0; gap /=2) {
            //遍历各组中所有的元素，步长gap
            for (int i = gap; i < arr.length; i++) {
                //如果当前元素大于加上步长后那个元素，说明交换
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]){
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }

    /**
     * 使用移位法
     * @param arr 待排序的数组
     */
    public static void shellSort2(int[] arr){
        for (int gap = arr.length/2; gap > 0; gap /=2) {
            for (int  i = 0; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]){
                    while (j - gap >= 0 && temp < arr[j - gap]){
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }
}
