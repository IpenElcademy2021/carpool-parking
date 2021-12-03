package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.FreeParking;
import com.example.carpool.parking.payloads.request.FreeParkingRequest;
import com.example.carpool.parking.payloads.response.MainResponse;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface FreeParkingService {

    List<FreeParking> getAllFreeParking();
    MainResponse createFreeParking(FreeParkingRequest freeParkingRequest);

}
