package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ryan on 2018/12/6
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("say")
    public String sayHello() {


        return  "aaaaaaaaaaabbbbbbbbbbbbbbbb";
    }
}
