package com.example.glowtique.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    public String getIndexPage() {
        return "index";
    }
}
