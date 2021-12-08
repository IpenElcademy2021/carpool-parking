package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.entities.UserRequest;
import com.example.carpool.parking.payloads.request.PoolingProposeRequest;
import com.example.carpool.parking.payloads.request.PoolingUserRequest;
import com.example.carpool.parking.payloads.response.PoolingProproseResponse;
import com.example.carpool.parking.payloads.response.UserResponse;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface PoolingProposeService {

    PoolingProproseResponse createPooling(PoolingProposeRequest poolingProposeRequest);

    List<Pooling> getAllPooling();

    List<UserRequest> getUserRequestByVisa(String visa);

    PoolingProproseResponse createUserRequest(PoolingUserRequest poolingUserRequest);

    void updateSeat(Pooling pooling, Long id);
}
