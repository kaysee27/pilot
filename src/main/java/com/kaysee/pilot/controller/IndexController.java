package com.kaysee.pilot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public String homePage(ModelMap model) {
        String name = "Kaysee";
        model.put("name", name);
        return "index";
    }

}
