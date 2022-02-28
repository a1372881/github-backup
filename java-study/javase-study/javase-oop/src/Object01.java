import java.util.List;

public class Object01 {
    public static void main(String[] args) {

//        张老太养了两只猫猫：一只名字叫小白，今年3岁，白色。
//        还有一只叫小花，今年100岁，花色。
//        请编写一个程序，当用户输入小猫的名字时，就显示该猫的名字，年龄，颜色。
//        如果用户输入的小猫名错误，则显示张老太没有这只猫猫。

        //使用旧方法
        //并不利于数据的管理与访问
        //========1.使用变量方式===========
        String cat1Name = "小白";
        Integer cat1Age = 3;
        String cat1Coler = "白色";

        String cat2Name = "小花";
        Integer cat2Age = 100;
        String cat2Coler = "花色";

        //不利于数据的访问以及数据类型无法体现出来
        //========2.使用数组方式===========
        String[] cat1 = {"小白","3","白色"};
        String[] cat2 = {"小花","100","花色"};


        //========使用类和对象=============
        cat cat001 = new cat();
        cat001.name = "小白";
        cat001.age = 3;
        cat001.coler = "白色";

        cat cat002 = new cat();
        cat002.name = "小花";
        cat002.age = 100;
        cat002.coler = "花色";

        System.out.println("第一只猫名字是："+cat001.name+"" +
                "  "+"第二只猫名字是:"+cat002.name);
    }
}
class cat{
    String name;
    Integer age;
    String coler;
}

