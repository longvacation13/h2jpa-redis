package com.example.demo.longvacation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("/common")
    public String commonTest() {
        return "Hello world!!!!!";
    }
}
