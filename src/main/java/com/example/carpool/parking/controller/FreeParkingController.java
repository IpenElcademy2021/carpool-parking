package com.example.carpool.parking.controller;


import com.example.carpool.parking.Service.FreeParkingService;
import com.example.carpool.parking.entities.FreeParking;
import com.example.carpool.parking.payloads.request.FreeParkingRequest;
import com.example.carpool.parking.payloads.response.MainResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/cppk")
public class FreeParkingController {

    @Autowired
    FreeParkingService freeParkingService;

    @GetMapping("/getAllFreeParking")
    public ResponseEntity<List<FreeParking>> getAllFreeParking () {
        List<FreeParking> freeParkings = freeParkingService.getAllFreeParking();
        return new ResponseEntity<>(freeParkings, HttpStatus.OK);
    }

    @PostMapping("/addFreeParking")
    public ResponseEntity<MainResponse> addFreeParking(@RequestBody FreeParkingRequest elcaMemberRequest) {
        MainResponse newfreeParking = freeParkingService.createFreeParking(elcaMemberRequest);
        return new ResponseEntity<>(newfreeParking, HttpStatus.CREATED);
    }
}
