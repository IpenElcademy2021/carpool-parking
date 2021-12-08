package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.entities.UserRequest;
import com.example.carpool.parking.payloads.request.PoolingProposeRequest;
import com.example.carpool.parking.payloads.request.PoolingUserRequest;
import com.example.carpool.parking.payloads.response.PoolingProproseResponse;
import com.example.carpool.parking.payloads.response.UserResponse;
import com.example.carpool.parking.repository.CarOwnersRepository;
import com.example.carpool.parking.repository.PoolingRepository;
import com.example.carpool.parking.repository.PoolingUserRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class PoolingProposeServiceImplementation implements PoolingProposeService{

    @Autowired
    PoolingRepository poolingRepository;

    @Autowired
    PoolingUserRequestRepository poolingUserRequestRepository;

    @Autowired
    CarOwnersRepository carOwnersRepository;

    @Override
    public PoolingProproseResponse createPooling(PoolingProposeRequest poolingProposeRequest) {
        Pooling newPooling = new Pooling();
        newPooling.setDate(poolingProposeRequest.getDate());
        newPooling.setRegion(poolingProposeRequest.getRegion());
        newPooling.setPickUpPoint(poolingProposeRequest.getPickUpPoint());
        newPooling.setPickUpTime(poolingProposeRequest.getPickUpTime());
        newPooling.setDepartureTime(poolingProposeRequest.getDepartureTime());
        newPooling.setSeat(poolingProposeRequest.getSeat());
        newPooling.setUser(poolingProposeRequest.getUser());

        poolingRepository.save(newPooling);

        return new PoolingProproseResponse("New Pooling added!");
    }

    @Override
    public List<Pooling> getAllPooling() {

            return poolingRepository.findAll();

    }

    @Override
    public List<UserRequest> getUserRequestByVisa(String visa) {
        return poolingRepository.findUserRequestByVisa(visa);
    }

    @Override
    public PoolingProproseResponse createUserRequest(PoolingUserRequest poolingUserRequest) {
        UserRequest newUserRequest = new UserRequest();
        newUserRequest.setReservationStatus(poolingUserRequest.getReservationStatus());
        newUserRequest.setComment(poolingUserRequest.getComment());
        newUserRequest.setUser(poolingUserRequest.getUser());
        newUserRequest.setPooling(poolingUserRequest.getPooling());

        poolingUserRequestRepository.save(newUserRequest);

        return new PoolingProproseResponse("New Request Added");

    }


    @Override
    public void updateSeat(Pooling pooling, Long id) {
            poolingRepository.findById(id)
                    .map(pooling1 -> {
                        pooling1.setSeat(pooling.getSeat());
                        poolingRepository.save(pooling1);
                        return null;
                    })

                    .orElse(null);
        }
    }


