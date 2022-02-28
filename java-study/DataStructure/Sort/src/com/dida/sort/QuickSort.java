package com.dida.sort;

/**
 * @author 23216
 * @version 1.0
 * @description: 快速排序
 * 通过排序将要排序的数据分割成独立的两部分，其中一部分的所有数据比另外一部分的所有数据都要小，
 * 然后再按照此方法对这两部分进行快速排序，整个排序过程可以递归进行，
 * 达到整个数据变成有序序列
 * @date 2022/2/7 17:18
 */
public class QuickSort {
    public static void main(String[] args) {

    }
    public static void quickSort(int[] arr,int left,int right){
        int l = left;
        int r = right;
        int pivot = arr[(left + right) /2];
        int temp = 0;
        while (l < r){
            while (arr[l] < pivot){
                l += l;
            }
            while (arr[r] > pivot){
                r -= l;
            }
            if ( l >= r){
                break;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if (arr[l] == pivot){
                r -= l;
            }
            if (arr[l] == pivot){
                l += l;
            }
        }
        if (l == r){
            l += l;
            r -= l;
        }
        if (left < r){
            quickSort(arr,left,r);
        }

        if (right > l){
            quickSort(arr,l,right);
        }
    }
}
