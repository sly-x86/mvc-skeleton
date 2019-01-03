package me.sly.controllers;

import me.sly.services.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    User user;

    @RequestMapping(value = "/")
    public String welcome(ModelMap model) {
        model.addAttribute("login", user.login);
        return "home";
    }
}
