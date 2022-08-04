package com.example.demo.Controller;

import com.example.demo.enity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class hello {
    @Autowired
    com.example.demo.Service.testMapperIservice testMapperIservice;
    @GetMapping("/zhong")
    public List<String> s(){
        List<String> tt = testMapperIservice.findAll();
        return tt;
    }
    @GetMapping("/zhong2")
    public List<User> sff(){
        return   testMapperIservice.findAll2();
    }
}
