package com.learn.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InitCtrl {


    @GetMapping(value = "/hello")
    public String init() {
        //List list = studentResitory.findAll();
        //return list;
        return "hello";
    }

}
