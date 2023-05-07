package com.stick.registraduria.controller;

import com.stick.registraduria.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void registerUser() {
        userService.registerUser();
    }

    @PostMapping("/auth")
    public void getToken() {
        userService.getToken();
    }

    @GetMapping()
    public String getDocuments() {
        return "Get Documents";
    }

    @GetMapping("/documents")
    public void downloadCopyRegister() {
        userService.getDocuments();
    }
}
