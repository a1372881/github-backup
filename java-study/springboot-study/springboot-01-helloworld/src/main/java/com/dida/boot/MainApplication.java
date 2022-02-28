package com.dida.boot;

import com.dida.boot.config.HelloConfig;
import com.dida.boot.pojo.Pet;
import com.dida.boot.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName MainApplication
 * @Description @SpringBootApplication:告诉springboot这是主程序
 * @Author lxl
 * @Date 2021/11/1
 * @Version 1.0
 **/
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //从容器中获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("组件"+(tom01 == tom02));

        //com.dida.boot.config.HelloConfig$$EnhancerBySpringCGLIB$$9994cf6e@3c818ac4
        HelloConfig bean = run.getBean(HelloConfig.class);
        System.out.println(bean);

//如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
        //保持组件单实例
        User user01 = bean.user01();
        User user02 = bean.user01();
        System.out.println(user01 == user02);

        User user = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);

        System.out.println("用户的宠物："+(user.getPet() == tom));

        System.out.println("=================");
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
