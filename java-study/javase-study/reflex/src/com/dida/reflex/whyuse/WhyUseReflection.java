package com.dida.reflex.whyuse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 23216
 * @version 1.0
 * @description: 对比反射和传统方法创建对象并调用
 * @date 2022/1/27 22:38
 */
public class WhyUseReflection {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //使用传统方法创建对象
        Cat cat = new Cat();
        cat.hi();
        System.out.println("===============");

        //使用反射
        //获取配置文件中的全路径
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/dida/reflex/whyuse/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("配置文件中的路径："+classfullpath);
        System.out.println("配置文件中的方法："+method);
        //加载类
        Class cls = Class.forName(classfullpath);
        //创建对象
        Object o = cls.newInstance();
        System.out.println("o的运行类型"+o.getClass());
        //获得方法对象
        Method method1 = cls.getMethod(method);
        method1.invoke(o);

        /**
         * 使用反射可以不用修改源代码来更改所执行的方法
         * 提升了程序的安全性
         */
    }
}
