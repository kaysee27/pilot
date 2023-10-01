package com.pilot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @GetMapping("/")
    public String defaultPage() {
        return "index";
    }

    @GetMapping("/home")
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("homepage");
        modelAndView.addObject("name", "Krishna");
        return modelAndView;
    }

}
