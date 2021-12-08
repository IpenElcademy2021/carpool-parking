package com.example.carpool.parking.controller;

import com.example.carpool.parking.Service.PoolingProposeService;
import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.entities.UserRequest;
import com.example.carpool.parking.payloads.request.PoolingProposeRequest;
import com.example.carpool.parking.payloads.request.PoolingUserRequest;
import com.example.carpool.parking.payloads.response.PoolingProproseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Transactional
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

    @PostMapping("/createUserRequest")
    public ResponseEntity<PoolingProproseResponse> createUserRequest(@RequestBody PoolingUserRequest poolingUserRequest){
        PoolingProproseResponse poolingProproseResponse = poolingProposeService.createUserRequest(poolingUserRequest);
        return new ResponseEntity<>(poolingProproseResponse,HttpStatus.CREATED);
    }

    @GetMapping("/getAllProposePooling")
    public ResponseEntity<List<Pooling>> getAllPooling() {
        List<Pooling> poolings = poolingProposeService.getAllPooling();
        return new ResponseEntity<>(poolings, HttpStatus.OK);
    }

    @GetMapping("/getUserRequestByVisa/{visa}")
    public ResponseEntity<List<UserRequest>> getUserRequestByVisa (@PathVariable("visa") String visa)
    {
        List<UserRequest> userRequests = poolingProposeService.getUserRequestByVisa(visa);
        return  new ResponseEntity<>(userRequests,HttpStatus.OK);
    }

    @PutMapping("/updateSeat/{id}")
    public void updateSeat(@RequestBody Pooling pooling, @PathVariable Long id)
    {
        poolingProposeService.updateSeat(pooling, id);
    }
}
