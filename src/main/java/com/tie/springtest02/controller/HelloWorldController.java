package com.tie.springtest02.controller;

import com.tie.springtest02.model.NeoProperties;
import com.tie.springtest02.model.People;
import com.tie.springtest02.scheduler.SchedulerTask;
import com.tie.springtest02.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    NeoProperties properties;

    @Resource
    PeopleService peopleService;

    @RequestMapping("/hello")
    public String index() {
        People people = new People();
        people.setName("老张");
        people.setAge(33);
        peopleService.save(people);
        return "";
    }

    @RequestMapping("/queryByName")
    public String query1(String name,int age) {
        List<People> zhangsan = peopleService.selectByName(name,age);
        return zhangsan.toString();
    }
}
