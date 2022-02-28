package com.dida.annotation;

/**
 * @ClassName Test02
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/14
 * @Version 1.0
 **/
public class Test02 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class aClass = Class.forName("com.dida.annotation.User");

        System.out.println(aClass.getName());


        System.out.println(aClass);
    }
}

class User{
    private String name;
    private int id;
    private int age;


    public User(){}

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
