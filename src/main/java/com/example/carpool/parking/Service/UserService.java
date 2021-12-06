package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.FreeParking;
import com.example.carpool.parking.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    User loginVisaPassword(String visa, String password);
    List<User> getAllUsers();
    List<User> searchByVisa(String visa);
    List<User> searchBycarOwners(CarOwners carOwners);


}
