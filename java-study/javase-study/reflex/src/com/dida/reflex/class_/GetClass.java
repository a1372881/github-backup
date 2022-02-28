package com.dida.reflex.class_;

import com.dida.reflex.whyuse.Cat;

/**
 * @author 23216
 * @version 1.0
 * @description: 不同方法获得class类对象
 * @date 2022/1/28 9:44
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.通过静态方法获取，已知全类名使用forname()获取
        Class<?>  cls1 = Class.forName("com.dida.reflex.whyuse.Cat");
        //2.通过类的class获取
        Class<Cat> cls2 = Cat.class;
        //3.调用实例的getclass方法获取
        Cat cat = new Cat();
        Class<? extends Cat> cls3 = cat.getClass();
        //4.类加载器
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class<?> cls4 = classLoader.loadClass("com.dida.reflex.whyuse.Cat");
        //5.基本数据类型
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        //6.基本数据类型的包装类
        Class<Integer> integerClass1 = Integer.class;
        Class<Character> characterClass1 = Character.class;



    }
}
