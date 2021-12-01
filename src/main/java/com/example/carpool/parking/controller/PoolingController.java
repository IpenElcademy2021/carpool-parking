package com.example.carpool.parking.controller;

import com.example.carpool.parking.Service.PoolingProposeService;
import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.payloads.request.PoolingProposeRequest;
import com.example.carpool.parking.payloads.response.PoolingProproseResponse;
import com.example.carpool.parking.payloads.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/cppk")
public class PoolingController {

    @Autowired
    PoolingProposeService poolingProposeService;


    @PostMapping("/createPooling")
    public ResponseEntity<PoolingProproseResponse> createPooling(@RequestBody PoolingProposeRequest pooling){
        PoolingProproseResponse newPooling = poolingProposeService.createPooling(pooling);
        return new ResponseEntity<>(newPooling,HttpStatus.CREATED);
    }


    @GetMapping("/getAllProposePooling")
    public ResponseEntity<List<Pooling>> getAllPooling() {
        List<Pooling> poolings = poolingProposeService.getAllPooling();
        return new ResponseEntity<>(poolings, HttpStatus.OK);
    }
}
