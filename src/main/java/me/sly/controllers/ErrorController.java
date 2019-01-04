package me.sly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping(value = "/404")
    public String pageNotFound() {
        return "error/404";
    }

    @RequestMapping(value = "/403")
    public String forbidden() {
        return "error/403";
    }
}
