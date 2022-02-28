package com.dida.annotation;

/**
 * @ClassName Test03
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/14
 * @Version 1.0
 **/
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Student student = new Student();
        System.out.println("这个人是"+student.name);

        //通过对象
        Class aClass = student.getClass();
        System.out.println(aClass.hashCode());

        //通过forname
        Class aClass1 = Class.forName("com.dida.annotation.Student");
        System.out.println(aClass1.hashCode());

        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.hashCode());


        Class<Integer> type = Integer.TYPE;
        System.out.println(type);

        Class superclass = aClass.getSuperclass();
        System.out.println(superclass);

    }
}

class Person{
    public String name;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}
class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}
