package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.entities.UserRequest;
import com.example.carpool.parking.payloads.request.PoolingProposeRequest;
import com.example.carpool.parking.payloads.response.PoolingProproseResponse;
import com.example.carpool.parking.payloads.response.UserResponse;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface PoolingProposeService {

    //Pooling insertPoolingProposeInformation(Date date,String region,String pickUpPoint,String pickUpTime,String departureTime,int seat);

    PoolingProproseResponse createPooling(PoolingProposeRequest poolingProposeRequest);
    List<Pooling> getAllPooling();

    List<UserRequest> getUserRequestByVisa(String visa);



}
