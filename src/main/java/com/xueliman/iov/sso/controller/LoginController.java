package com.xueliman.iov.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/login")
public class LoginController {

    @PostMapping("/login")
    public String login(){
        System.out.println("开始登录");
        return "redirect:main.html";
    }

    @PostMapping("/toMain")
    public String main(){
        System.out.println("进入main");
        return "redirect:main.html";
    }
}
