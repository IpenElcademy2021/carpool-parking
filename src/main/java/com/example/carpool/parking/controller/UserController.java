package com.example.carpool.parking.controller;

import com.example.carpool.parking.Service.UserService;
import com.example.carpool.parking.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cppk")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/login/{visa}/{password}")
    public ResponseEntity<User> loginVisaPassword (@PathVariable("visa") String visa, @PathVariable("password") String password) {
        User user = userService.loginVisaPassword(visa, password);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
