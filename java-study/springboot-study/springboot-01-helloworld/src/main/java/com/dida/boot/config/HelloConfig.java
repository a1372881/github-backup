package com.dida.boot.config;

import com.dida.boot.pojo.Pet;
import com.dida.boot.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 1.配置类里面使用@Bean注解标注在方法上给容器注册组件
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods：代理bean的方法
 *      Full(proxyBeanMethods = true) 保证每个@Bean方法被调用多少次返回的组件都是单实例的
 *      Lite(proxyBeanMethods = false)每个@Bean方法被调用多少次返回的组件都是新创建的
 */
@Import({User.class})
@Configuration(proxyBeanMethods = true)
public class HelloConfig {
    
    @Bean
    public User user01(){
        User zhangsan = new User("zhangsan", 17);
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }

    @Bean("tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
