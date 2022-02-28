package com.dida.reflex.class_;

import com.dida.reflex.whyuse.Cat;

/**
 * @author 23216
 * @version 1.0
 * @description: Class类的
 * @date 2022/1/28 9:30
 */
public class LeanClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //传统创建对象
      //  Cat cat = new Cat();
        //反射创建对象
        Class cls = Class.forName("com.dida.reflex.whyuse.Cat");
        Object o = cls.newInstance();
        System.out.println(cls.hashCode());
        Class cls2 = Class.forName("com.dida.reflex.whyuse.Cat");
        System.out.println(cls2.hashCode());
        //得到结论，对于某个类的Class类对象在内存中只能有一份
    }
}
