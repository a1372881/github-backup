package com.dida.pojo;

/**
 * @ClassName User
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/28
 * @Version 1.0
 **/
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
