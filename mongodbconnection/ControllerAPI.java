package com.example.mongodbconnection;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ControllerAPI {
    @GetMapping("/welcome")

    public String viewAnyBody(){
        return "Welcome to the security class of Spring Month 2";
    }

    @GetMapping("/user/view")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String welcomeUser(){
        return "Hi user you have loggined successfully";
    }

    @GetMapping("/admin/view")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String welcomeAdmin(){
        return "Hi Admin welcome to the page";
    }
}
