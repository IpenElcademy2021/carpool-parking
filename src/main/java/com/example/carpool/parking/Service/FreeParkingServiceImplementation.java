package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.FreeParking;
import com.example.carpool.parking.payloads.request.FreeParkingRequest;
import com.example.carpool.parking.payloads.response.MainResponse;
import com.example.carpool.parking.repository.FreeParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FreeParkingServiceImplementation implements FreeParkingService {

    @Autowired
    FreeParkingRepository freeParkingRepository;

    @Override
    public List<FreeParking> getAllFreeParking() {
        return freeParkingRepository.findAll();
    }

    @Override
    public MainResponse createFreeParking(FreeParkingRequest freeParkingRequest) {
        FreeParking newfreeParking = new FreeParking();
        newfreeParking.setDate(freeParkingRequest.getDate());
        newfreeParking.setUser(freeParkingRequest.getUser());

        freeParkingRepository.save(newfreeParking);
        return new MainResponse("FreeParking Slot proposed successfully!");
    }
}
