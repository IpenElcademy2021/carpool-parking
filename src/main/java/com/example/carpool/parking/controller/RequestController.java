package com.example.carpool.parking.controller;

import com.example.carpool.parking.Service.PoolingProposeService;
import com.example.carpool.parking.Service.RequestService;
import com.example.carpool.parking.entities.Request;
import com.example.carpool.parking.entities.User;
import com.example.carpool.parking.payloads.request.FreeParkingRequest;
import com.example.carpool.parking.payloads.request.RequestRequest;
import com.example.carpool.parking.payloads.response.MainResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@RestController
@RequestMapping(value = "/cppk")
public class RequestController {

    @Autowired
    RequestService requestService;

    @GetMapping("/searchRequestByDriverVisa/{driverVisa}")
    public ResponseEntity<List<Request>> searchByDriverVisa (@PathVariable("driverVisa") String driverVisa) {
        List<Request> requests = requestService.searchByDriverVisa(driverVisa);
        return new ResponseEntity<>(requests, HttpStatus.OK);
    }


    @GetMapping("/searchRequestByDriverVisaAndStatus/{driverVisa}/{status}")
    public ResponseEntity<List<Request>> searchByDriverVisaAndStatus (@PathVariable("driverVisa") String driverVisa, @PathVariable("status") String status) {
        List<Request> requests = requestService.searchByDriverVisaAndStatus(driverVisa, status);
        return new ResponseEntity<>(requests, HttpStatus.OK);
    }

        @GetMapping("/searchRequestByUser/{user}")
    public ResponseEntity<List<Request>> searchByVisa (@PathVariable("user") User user) {
        List<Request> requests = requestService.searchByUser(user);
        return new ResponseEntity<>(requests, HttpStatus.OK);
    }

    @GetMapping("/getAllParkingRequest")
    public ResponseEntity<List<Request>> getAllParkingRequest () {
        List<Request> requests = requestService.getAllParkingRequest();
        return new ResponseEntity<>(requests, HttpStatus.OK);
    }

    @PostMapping("/addARequest")
    public ResponseEntity<MainResponse> createParkingRequest(@RequestBody RequestRequest requestRequest) {
        MainResponse newRequest = requestService.createParkingRequest(requestRequest);
        return new ResponseEntity<>(newRequest, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public Optional<Request> updateRequestStatus(@PathVariable Integer id, @RequestBody RequestRequest requestRequest) {
        return requestService.updateRequestStatus(id, requestRequest);

    }

    @DeleteMapping("/deleteParkingRequest/{requestId}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("requestId") Integer requestId) {
        requestService.deleteEmployee(requestId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
