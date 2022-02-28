package com.dida.list;

import java.util.Vector;

/**
 * @author 23216
 * @version 1.0
 * @description: 用于学习Vecotr类
 * @date 2022/1/15 20:43
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add("test"+i);
        }
        System.out.println(vector);
    }
}
