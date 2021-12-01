package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.UserRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PoolRequestService {

    List<UserRequest> getRequestByVisa(String visa);
}
