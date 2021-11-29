package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    User loginVisaPassword(String visa, String password);

}
