package com.example.glowtique.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/home")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/perfumes")
    public String getPerfumesPage() {
        return "perfumes";
    }

    @GetMapping("/login")
    public String getProfilePage() {
        return "login";
    }

    @GetMapping("/dior")
    public String getDiorPage() {
        return "dior";
    }

    @GetMapping("/location")
    public String getLocationPage() {
        return "location";
    }

    @GetMapping("/register")
    public String getRegisterPage() {
        return "register";
    }


}
