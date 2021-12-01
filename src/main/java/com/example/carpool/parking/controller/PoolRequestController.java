package com.example.carpool.parking.controller;

import com.example.carpool.parking.Service.PoolRequestService;
import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.entities.User;
import com.example.carpool.parking.entities.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/prc")
public class PoolRequestController {

    @Autowired
    private PoolRequestService poolRequestService;

    @GetMapping("/getRequestByVisa/{visa}")
    public ResponseEntity<List<UserRequest>> getRequestByVisa (@PathVariable("visa") String visa)
    {
        List<UserRequest> userRequests = poolRequestService.getRequestByVisa(visa);
        return  new ResponseEntity<>(userRequests,HttpStatus.OK);
    }
}


