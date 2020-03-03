package com.ae.twovariables;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class homeController {
    public String homePage(Model model) {
        model.addAttribute("firstVar", "This is the first variable for exercise 1.02");
        model.addAttribute("secondVar", "This is the second variable for exercise 1.02");
        return "homePage";
    }
}
