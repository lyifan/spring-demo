package com.deepnet.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(path = {"/", "", "/home"})
    public String sayHello() {
        return "Hello, AWS";
    }

    @GetMapping(path = {"/{who}", "{who}", "/home/{who}"})
    public String sayHelloTo(@PathVariable String who) {
        return "Hello, " + who;
    }


}