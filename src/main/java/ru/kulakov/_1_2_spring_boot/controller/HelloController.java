package ru.kulakov._1_2_spring_boot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Привет!");
        messages.add("Я spring 2.3.1 приложение");
        model.addAttribute("messages", messages);
        return "index";
    }

}