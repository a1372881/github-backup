package com.dida.homeWork;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 23216
 * @version 1.0
 * @description: TODO
 * @date 2022/1/25 16:07
 */
public class HomeWork6 {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 = new Person("1001", "AA");
        Person p2 = new Person("1002", "BB");
        hashSet.add(p1);
        hashSet.add(p2);
        p1.name = "CC";
        hashSet.remove(p1);
        System.out.println(hashSet);
//        hashSet.add(new Person("1001","CC"));
//        System.out.println(hashSet);
//        hashSet.add(new Person("1001","AA"));
//        System.out.println(hashSet);


    }

    static class Person{
        private String name;
        private String code;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public Person(String name, String code) {
            this.name = name;
            this.code = code;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", code='" + code + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(code, person.code);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, code);
        }
    }
}
