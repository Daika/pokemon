package com.restcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestContoller {

	

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", "Pokemon");
        return "home";
    }
}
