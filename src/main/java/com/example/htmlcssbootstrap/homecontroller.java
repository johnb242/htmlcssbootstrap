package com.example.htmlcssbootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homecontroller {
    @RequestMapping("/")
    public String index() {
        return "bootcamp";


    }

    @RequestMapping("/html")
    public String html() {
        return "html";
    }

    @RequestMapping("/css")
    public String css() {
        return "css";

    }

    @RequestMapping("/bootstrap")
    public String bootstrap() {
        return "bootstrap";
    }
}