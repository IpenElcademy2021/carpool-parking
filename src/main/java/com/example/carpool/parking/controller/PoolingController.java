package com.example.carpool.parking.controller;

import com.example.carpool.parking.Service.PoolingProposeService;
import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.payloads.request.PoolingProposeRequest;
import com.example.carpool.parking.payloads.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/cppk")
public class PoolingController {

    @Autowired
    PoolingProposeService poolingProposeService;

    //@PostMapping("createPooling/{date},{region},{pickUpPoint},{pickUpTime},{departureTime},{seat}")
    /*public ResponseEntity<Pooling> insertPoolingProposeInformation(@PathVariable("date")Date date,
                                                                   @PathVariable("region") String region,
                                                                   @PathVariable("pickUpPoint") String pickUpPoint,
                                                                   @PathVariable("pickUpTime") String pickUpTime,
                                                                   @PathVariable("departureTime") String departureTime,
                                                                   @PathVariable("seat") int seat){
        Pooling pooling = poolingProposeService.insertPoolingProposeInformation(date,region,pickUpPoint,pickUpTime,departureTime,seat);
        return new ResponseEntity<>(pooling, HttpStatus.CREATED);*/

    @PostMapping("/createPooling")
    public ResponseEntity<UserResponse> createPooling(@RequestBody PoolingProposeRequest pooling){
        UserResponse newPooling = poolingProposeService.createPooling(pooling);
        return new ResponseEntity<>(newPooling,HttpStatus.CREATED);
    }
}
