package com.dida.reflex.homework;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;

/**
 * @author 23216
 * @version 1.0
 * @description:
 * 得到file类的class对象
 * 打印所有构造器
 * 创建对象创建文件
 * @date 2022/1/28 11:21
 */
public class HomeWork02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        Class<?> cls = Class.forName("com.dida.reflex.homework.PrivateTest");
        for (Constructor<?> declaredConstructor : cls.getDeclaredConstructors()) {
            System.out.println(declaredConstructor.getName());
        }

        Object o = cls.newInstance();
        File file = new File("d:\\aa.txt");
        file.createNewFile();


    }

}
