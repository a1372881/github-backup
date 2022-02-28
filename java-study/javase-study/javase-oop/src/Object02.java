public class Object02 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.printf("年龄默认："+person.age+"名字默认："+person.name+"tu默认"+person.tu);
    }
}
class Person{
    Integer age;
    String name;
    Boolean tu;
}
