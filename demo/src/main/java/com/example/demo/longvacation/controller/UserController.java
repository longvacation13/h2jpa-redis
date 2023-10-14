package com.example.demo.longvacation.controller;

import com.example.demo.longvacation.dto.Usr;
import com.example.demo.longvacation.service.UsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserController(UsrService usrService) {
        this.usrService = usrService;
    }

    private final UsrService usrService;


    @GetMapping("/common")
    public String commonTest() {
        return "Hello world!!!!!";
    }

    @GetMapping("/users")
    public List<Usr> getAllUsers() {
        return usrService.findAllUsers();
    }
}
