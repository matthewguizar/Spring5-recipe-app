package com.springframework.spring5recipeapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
//        model.addAttribute("index", )
        System.out.println("Matthew was here");
        return "index";
    }
}
