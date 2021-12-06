package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.FreeParking;
import com.example.carpool.parking.entities.Request;
import com.example.carpool.parking.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarOwnersService {
    List<CarOwners> getAllCarOwners();
    List<CarOwners> searchByUser(User user);

}
