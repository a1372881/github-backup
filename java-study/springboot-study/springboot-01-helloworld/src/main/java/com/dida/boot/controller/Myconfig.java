package com.dida.boot.controller;

import com.dida.boot.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(Car.class)
public class Myconfig {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }


}
