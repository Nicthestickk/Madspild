package com.madspild.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MadspildController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/recipes")
    public String recipes() {
        return "recipes";
    }

    @GetMapping("/facts")
    public String facts() {
        return "facts";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

}
