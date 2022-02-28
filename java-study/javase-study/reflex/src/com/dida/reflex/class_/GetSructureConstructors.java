package com.dida.reflex.class_;

import java.lang.reflect.Constructor;

import static java.lang.Class.forName;

/**
 * @author 23216
 * @version 1.0
 * @description: 获取构造器的结构
 * @date 2022/1/28 10:25
 */
public class GetSructureConstructors {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = forName("com.dida.reflex.whyuse.Cat");
        for (Constructor<?> declaredConstructor : cls.getDeclaredConstructors()) {
            System.out.println(declaredConstructor.getName());
            for (Class<?> parameterType : declaredConstructor.getParameterTypes()) {
                System.out.println(parameterType);
            }
        }
    }
}
