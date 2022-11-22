package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public Boolean hello(@RequestParam("name") String name, @RequestParam("password") String password) {
        return testService.login(name, password);
    }
}
