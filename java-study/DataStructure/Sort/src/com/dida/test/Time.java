package com.dida.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 23216
 * @version 1.0
 * @description: 用于测试排序的时间
 * @date 2022/2/6 21:03
 */
public class Time {
    public String useTime(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        return simpleDateFormat.format(date);
    }
    public int[] getList(int num){
        int[] ls = new int[num];
        for (int i = 0; i < ls.length; i++) {
            ls[i] = (int) (Math.random() * 10000);
        }
        return ls;
    }

}
