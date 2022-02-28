package com.dida.reflex.class_;

import sun.security.krb5.internal.PAData;

import java.lang.reflect.Method;

import static java.lang.Class.forName;

/**
 * @author 23216
 * @version 1.0
 * @description: 获取方法结构
 * @date 2022/1/28 10:20
 */
public class GetStructureMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = forName("com.dida.reflex.whyuse.Cat");
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method.getName());
            System.out.println(method.getModifiers());
            System.out.println(method.getReturnType());
            for (Class<?> parameterType : method.getParameterTypes()) {
                System.out.println(parameterType);

            }
        }

    }
}
