package com.example.carpool.parking.controller;

import com.example.carpool.parking.entities.User;
import com.example.carpool.parking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "loginController")
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getUsers")
    List<User> getStudents(){
        return userRepository.findAll();
    }

}
