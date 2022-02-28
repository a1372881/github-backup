package com.dida.springboot02yaml.controller;

import com.dida.springboot02yaml.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    Person person;

    @RequestMapping("/Person")
    public Person person(){
        return person;
    }
}
