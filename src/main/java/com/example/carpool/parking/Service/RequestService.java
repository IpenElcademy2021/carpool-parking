package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.entities.Request;
import com.example.carpool.parking.entities.User;
import com.example.carpool.parking.payloads.request.FreeParkingRequest;
import com.example.carpool.parking.payloads.request.RequestRequest;
import com.example.carpool.parking.payloads.response.MainResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface RequestService {

    List<Request> getAllParkingRequest();
    MainResponse createParkingRequest(RequestRequest requestRequest);
    List<Request> searchByDriverVisa(String driverVisa);
    List<Request> searchByDriverVisaAndStatus(String driverVisa, String status);
    List<Request> searchByUser(User user);
    Optional<Request> updateRequestStatus(Integer requestId, RequestRequest requestRequest);
    void deleteEmployee(Integer requestId);


}
