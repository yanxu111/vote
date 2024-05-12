package com.example.vote.controller.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
@Controller
public class StartController {


    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }



    @GetMapping("/leftNavigationMenu")
    public String leftNavigationMenu(HttpServletRequest request, Model model) {
        String menuUrl = request.getParameter("navUrl");

        if (!"".equals(menuUrl)) {
            return menuUrl;
        } else {
            return "#";
        }
        //return "admin/table_bootstrap.html";
    }
}
