package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.FreeParking;
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
}
