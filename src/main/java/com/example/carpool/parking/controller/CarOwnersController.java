package com.example.carpool.parking.controller;

import com.example.carpool.parking.Service.CarOwnersService;
import com.example.carpool.parking.Service.FreeParkingService;
import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.FreeParking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cppk")
public class CarOwnersController {
    @Autowired
    CarOwnersService carOwnersService;

    @GetMapping("/getAllCarOwners")
    public ResponseEntity<List<CarOwners>> getAllCarOwners () {
        List<CarOwners> carOwners = carOwnersService.getAllCarOwners();
        return new ResponseEntity<>(carOwners, HttpStatus.OK);
    }
}
