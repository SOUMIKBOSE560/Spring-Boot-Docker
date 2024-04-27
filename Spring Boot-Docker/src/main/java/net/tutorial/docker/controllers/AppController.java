package net.tutorial.docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/home")
    public String welcome(){
        return "WELCOME TO DOCKER";
    }
}
