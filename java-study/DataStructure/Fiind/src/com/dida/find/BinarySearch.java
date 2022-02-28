package com.dida.find;

import java.util.ArrayList;

/**
 * @author 23216
 * @version 1.0
 * @description: 二分查找算法
 * @date 2022/2/16 14:42
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 5, 5, 5, 5, 6, 7, 8, 9, 10, 44};
        System.out.println(doubleFind2(arr, 0, arr.length - 1, 5));


    }

    /**
     * 普通的二分查找法
     *
     * @param arr     待查找的数组，已经排序好的
     * @param left    数组的左边
     * @param right   数组的右边
     * @param findVal 要查找的数
     * @return 查找的或者未查找到的数
     */
    public static int doubleFind(int[] arr, int left, int right, int findVal) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) {
            return doubleFind(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return doubleFind(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }


    public static ArrayList doubleFind2(int[] arr, int left, int right, int findVal) {
        ArrayList<Integer> val = new ArrayList<>();

        if (left > right) {
            val.add(-1);
            return val;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) {
            return doubleFind2(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return doubleFind2(arr, left, mid - 1, findVal);
        } else {
            int temp = mid -1;
            while (temp >= 0 && arr[temp] == findVal) {
                val.add(temp);
                temp -= 1;
            }
            val.add(mid);

            temp = mid+1;
            while (temp <= arr.length - 1 && arr[temp] == findVal) {
                val.add(temp);
                temp += 1;
            }
            return val;


//            for (int i = 1; i < arr.length - 1 - mid; i++) {
//                if (arr[mid + i] == findVal) {
//                    val.add(mid + i);
//                } else if (arr[mid -1] == findVal) {
//                    val.add(mid - (-1));
//                }
//            }
//                return val;
            }
        }
    }
