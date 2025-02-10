package com.example.glowtique.web;

import com.azure.core.annotation.Get;
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

    @GetMapping("/profile")
    public String getProfilePage() {
        return "profile";
    }

    @GetMapping("/dior")
    public String getDiorPage() {
        return "dior";
    }




}
