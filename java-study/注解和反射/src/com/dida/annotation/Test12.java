package com.dida.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @ClassName Test12
 * @Description 反射操作注解
 * @Author lxl
 * @Date 2021/10/14
 * @Version 1.0
 **/
public class Test12 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class aClass = Class.forName("com.dida.annotation.Test12$Student2");

        Annotation[] declaredAnnotations = aClass.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);
        }

        //获得注解value值
        Tabledida annotation = (Tabledida) aClass.getAnnotation(Tabledida.class);
        String value = annotation.value();
        System.out.println(value );

        //获得指定类注解
        Field names = aClass.getDeclaredField("id");
        Fielddida annotation1 = names.getAnnotation(Fielddida.class);
        System.out.println(annotation1.columnName());
        System.out.println(annotation1.length());
        System.out.println(annotation1.type());
    }

    @Tabledida("db_student")
    class Student2{

        @Fielddida(columnName = "db_id",type = "int",length = 10)
        private int id;
        @Fielddida(columnName = "db_age",type = "int",length = 10)
        private int age;
        @Fielddida(columnName = "db_name",type = "int",length = 3)
        private String name;

        public Student2(){}

        public Student2(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student2{" +
                    "id=" + id +
                    ", age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Tabledida{
        String value();
    }

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Fielddida{
        String columnName();
        String type();
        int length();
    }



}
