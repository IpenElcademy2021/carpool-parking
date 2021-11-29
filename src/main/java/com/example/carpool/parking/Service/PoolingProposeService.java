package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.payloads.request.PoolingProposeRequest;
import com.example.carpool.parking.payloads.response.UserResponse;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public interface PoolingProposeService {

    //Pooling insertPoolingProposeInformation(Date date,String region,String pickUpPoint,String pickUpTime,String departureTime,int seat);

    UserResponse createPooling(PoolingProposeRequest poolingProposeRequest);
}
