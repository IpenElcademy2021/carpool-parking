package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.Request;
import com.example.carpool.parking.entities.User;
import com.example.carpool.parking.repository.CarOwnersRepository;
import com.example.carpool.parking.repository.FreeParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarOwnersServiceImplementation implements CarOwnersService {

    @Autowired
    CarOwnersRepository carOwnersRepository;

    @Override
    public List<CarOwners> getAllCarOwners() {
        return carOwnersRepository.findAll();

    }

    @Override
    public List<CarOwners> searchByUser(User user) {
        return carOwnersRepository.searchByUser(user);
    }


}
