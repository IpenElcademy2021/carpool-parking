package com.example.carpool.parking.Service;

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

//        return new ELCAMemberResponse("New ELCAMember added successfully!");
    }

    @Override
    public List<User> getAllUsers() {
            return userRepository.findAll();
    }
}
