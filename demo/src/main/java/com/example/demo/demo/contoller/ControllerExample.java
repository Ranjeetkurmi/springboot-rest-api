package com.example.demo.demo.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerExample {

    @GetMapping("/welcome")
    public String welcomePage(@RequestParam String name){
        System.out.println(name);
        return "Rahul";

    }
}
