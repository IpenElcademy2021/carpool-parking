package com.example.carpool.parking.controller;

import com.example.carpool.parking.Service.CarpoolRequestService;
import com.example.carpool.parking.entities.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RestController
@RequestMapping(value = "/prc")
public class CarpoolRequestController {

    @Autowired
    private CarpoolRequestService carpoolRequestService;

    @GetMapping("/getRequestByVisa/{visa}")
    public ResponseEntity<List<UserRequest>> getRequestByVisa (@PathVariable("visa") String visa)
    {
        List<UserRequest> userRequests = carpoolRequestService.getRequestByVisa(visa);
        return  new ResponseEntity<>(userRequests,HttpStatus.OK);
    }

    @PutMapping("/updateRequest/{id}")
    public void updateRequest(@RequestBody UserRequest userRequest, @PathVariable Long id)
    {
        carpoolRequestService.updateRequest(userRequest, id);
    }

    @GetMapping("/getAll")
    public List<UserRequest> getAll(){
        return carpoolRequestService.getAll();
    }
}


