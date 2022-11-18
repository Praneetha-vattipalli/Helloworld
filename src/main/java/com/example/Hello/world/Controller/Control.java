package com.example.Hello.world.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
    @GetMapping("/")
    public String getHello(){
        return "hello";
    }
    @GetMapping("/hello")
    public String getHelloworld(){
        return "hello";
    }
    @GetMapping("/hello1")
    public String getHelloworld1(){
        return "hello";
    }

}
