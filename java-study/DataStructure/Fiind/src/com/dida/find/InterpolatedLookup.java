package com.dida.find;

/**
 * @author 23216
 * @version 1.0
 * @description: 插值查找算法
 *
 * @date 2022/2/19 15:31
 */
public class InterpolatedLookup {

    public static void main(String[] args) {


        int[] arr = {1,2,5,7,9,12,456,788};
        int i = insertValueSearch(arr, 0, arr.length - 1, 9);
        System.out.println("index"+i);
    }


    public static int insertValueSearch(int[] arr, int left, int right, int findVal) {
        if (left > right || findVal < arr[0] || findVal > arr[arr.length - 1]) {
            return -1;
        }
        int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);
        int midVal = arr[mid];

        if (findVal > midVal) {
            return insertValueSearch(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return insertValueSearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }

    }
}

