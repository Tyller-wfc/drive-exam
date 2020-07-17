package cn.wfc.driveexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/toLogin")
    public String login() {
        return "login";
    }

    @RequestMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }
}
