package com.example.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(@RequestParam(value = "name") Optional<String> name){
        return " Welcome to Spring boot world.".concat(name.orElse(" World")).concat("!");
    }
}
