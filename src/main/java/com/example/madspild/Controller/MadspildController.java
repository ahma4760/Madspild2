package com.example.madspild.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MadspildController {
    @GetMapping("/")
    public String Madspild(){
        return "Madspild";
    }
}
