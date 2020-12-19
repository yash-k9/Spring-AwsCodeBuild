package com.github.projects.SpringAWSCICD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SpringController {
    @GetMapping("hello")
    public String hello(){
        return "Hello Github!!";
    }
}
