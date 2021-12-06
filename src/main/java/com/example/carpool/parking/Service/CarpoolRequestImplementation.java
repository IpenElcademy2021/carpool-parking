package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.UserRequest;
import com.example.carpool.parking.repository.CarpoolRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarpoolRequestImplementation implements CarpoolRequestService {

    @Autowired
    CarpoolRequestRepository carpoolRequestRepository;

    @Override
    public List<UserRequest> getRequestByVisa(String visa) {
        return carpoolRequestRepository.findUserRequestByVisa(visa);
    }
}
