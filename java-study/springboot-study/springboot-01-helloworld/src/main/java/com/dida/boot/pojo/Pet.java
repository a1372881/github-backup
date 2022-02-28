package com.dida.boot.pojo;

/**
 * @ClassName Pet
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/11/1
 * @Version 1.0
 **/
public class Pet {
    private String name;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
