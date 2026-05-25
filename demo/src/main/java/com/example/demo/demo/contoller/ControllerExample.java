package com.example.demo.demo.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerExample {

    @GetMapping("/welcome")
    public String welcomePage(Model model){
        // pass data to HTML page
        model.addAttribute("message","Welcome to Sprinb boot!");
        return "welcome";
    }
}
