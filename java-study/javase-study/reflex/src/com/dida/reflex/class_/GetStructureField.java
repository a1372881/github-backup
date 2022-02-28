package com.dida.reflex.class_;

import java.lang.reflect.Field;

import static java.lang.Class.forName;

/**
 * @author 23216
 * @version 1.0
 * @description: 获取属性的结构信息
 * @date 2022/1/28 10:14
 */
public class GetStructureField {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = forName("com.dida.reflex.whyuse.Cat");
        //1.getModifiers：以int形式返回修饰符
        System.out.println(cls.getModifiers());

        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field.getType());
            System.out.println(field.getName());
        }
        //[说明：默认修饰符是0，public是1，private是2，protected是4，static是8，final是16]，public（1）+static（8）=9
        // 2.getType：以Class形式返回类型
        //3.getName：返回属性名
    }
}
