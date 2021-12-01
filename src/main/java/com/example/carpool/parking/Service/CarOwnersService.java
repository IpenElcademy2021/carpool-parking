package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.FreeParking;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarOwnersService {
    List<CarOwners> getAllCarOwners();

}
