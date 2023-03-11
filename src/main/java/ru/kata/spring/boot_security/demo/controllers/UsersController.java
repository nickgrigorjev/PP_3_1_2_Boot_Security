package ru.kata.spring.boot_security.demo.controllers;

import ru.kata.spring.boot_security.demo.services.UserService;
import ru.kata.spring.boot_security.demo.services.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;


@Controller
@RequestMapping("/user")
public class UsersController {

    private final UserService userService;

    public UsersController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUserPage(Principal principal, Model model) {
        String user = (principal.getName());
        model.addAttribute("user", user);
        return "user";
    }

}
