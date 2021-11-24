package com.example.carpool.parking.controller;

import com.example.carpool.parking.entities.user;
import com.example.carpool.parking.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "loginController")
public class loginController {

    @Autowired
    userRepository userRepository;

    @GetMapping("/getUsers")
    List<user> getStudents(){
        return userRepository.findAll();
    }

}
