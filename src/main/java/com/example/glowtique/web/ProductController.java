package com.example.glowtique.web;

import com.azure.core.annotation.Get;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/perfumes/")
public class ProductController {

    @GetMapping("/dior")
    public String dior() {
        return "dior";
    }

}
