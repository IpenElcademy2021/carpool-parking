package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.UserRequest;
import com.example.carpool.parking.repository.PoolRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PoolingRequestImplementation implements PoolRequestService{

    @Autowired
    PoolRequestRepository poolRequestRepository;

    @Override
    public List<UserRequest> getRequestByVisa(String visa) {
        return poolRequestRepository.findUserRequestByVisa(visa);
    }
}
