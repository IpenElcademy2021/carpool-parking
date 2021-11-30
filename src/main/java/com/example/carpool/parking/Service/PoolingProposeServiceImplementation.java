package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.payloads.request.PoolingProposeRequest;
import com.example.carpool.parking.payloads.response.PoolingProproseResponse;
import com.example.carpool.parking.payloads.response.UserResponse;
import com.example.carpool.parking.repository.PoolingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class PoolingProposeServiceImplementation implements PoolingProposeService{

    @Autowired
    PoolingRepository poolingRepository;

    @Override
    public PoolingProproseResponse createPooling(PoolingProposeRequest poolingProposeRequest) {
        Pooling newPooling = new Pooling();
        newPooling.setDate(poolingProposeRequest.getDate());
        newPooling.setRegion(poolingProposeRequest.getRegion());
        newPooling.setPickUpPoint(poolingProposeRequest.getPickUpPoint());
        newPooling.setPickUpTime(poolingProposeRequest.getPickUpTime());
        newPooling.setDepartureTime(poolingProposeRequest.getDepartureTime());
        newPooling.setSeat(poolingProposeRequest.getSeat());

        poolingRepository.save(newPooling);

        return new PoolingProproseResponse("New Pooling added!");
    }

    @Override
    public List<Pooling> getAllPooling() {

            return poolingRepository.findAll();

    }
}
