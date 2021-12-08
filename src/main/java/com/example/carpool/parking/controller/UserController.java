package com.example.carpool.parking.controller;

import com.example.carpool.parking.Service.UserService;
import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.FreeParking;
import com.example.carpool.parking.entities.Request;
import com.example.carpool.parking.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
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


    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>> getAllFreeParking () {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/findbyvisa/{visa}")
    public ResponseEntity<List<User>> searchByVisa (@PathVariable("visa") String visa) {
        List<User> auser = userService.searchByVisa(visa);
        return new ResponseEntity<>(auser, HttpStatus.OK);
    }

    @GetMapping("/searchUserByCarOwners/{carOwners}")
    public ResponseEntity<List<User>> searchByDriverVisa (@PathVariable("carOwners") CarOwners carOwners) {
        List<User> auser = userService.searchBycarOwners(carOwners);
        return new ResponseEntity<>(auser, HttpStatus.OK);
    }
}
