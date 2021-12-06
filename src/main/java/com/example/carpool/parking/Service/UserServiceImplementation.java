package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.FreeParking;
import com.example.carpool.parking.entities.User;
import com.example.carpool.parking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User loginVisaPassword(String visa, String password) {
        return userRepository.findByVisaAndPassword(visa, password)

                .orElseThrow(() -> new IllegalMonitorStateException());

    }

    @Override
    public List<User> getAllUsers() {
            return userRepository.findAll();
    }

    @Override
    public List<User> searchByVisa(String visa) {
        return userRepository.findByVisa(visa);
    }

    @Override
    public List<User> searchBycarOwners(CarOwners carOwners) {
        return userRepository.findByCarOwners(carOwners);
    }
}
