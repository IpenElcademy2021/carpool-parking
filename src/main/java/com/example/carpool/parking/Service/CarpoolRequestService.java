package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.entities.UserRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarpoolRequestService {

    List<UserRequest> getRequestByVisa(String visa);

    void updateRequest(UserRequest userRequest, Long id);

    List<UserRequest> getAll();


}
