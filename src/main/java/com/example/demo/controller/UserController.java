package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

    @GetMapping("/welcome")
    public String display(@RequestParam String number) {
        User user = new User();
        user.setNumber(number);
        
        String userNumber = user.getNumber();


        if (userNumber != null && userNumber.length() == 10 ) {
            return "Valid number";
        } else {
            return "Invalid number";
        }
    }
}
