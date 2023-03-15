package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @GetMapping("/logout")
    public String login(HttpServletRequest request) throws ServletException {
        request.logout();
        return "redirect:/login";
    }
}
