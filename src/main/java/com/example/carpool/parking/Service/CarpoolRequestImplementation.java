package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.Pooling;
import com.example.carpool.parking.entities.UserRequest;
import com.example.carpool.parking.repository.CarpoolRequestRepository;
import com.example.carpool.parking.repository.PoolingRepository;
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

    @Override
    public void updateRequest(UserRequest userRequest, Long id) {
        carpoolRequestRepository.findById(id)
        .map(userRequest1 -> {
            userRequest1.setReservationStatus(userRequest.getReservationStatus());
            userRequest1.setComment(userRequest.getComment());
            carpoolRequestRepository.save(userRequest1);
            return null;

        })
                .orElse(null);
    }


    @Override
    public List<UserRequest> getAll() {
        return carpoolRequestRepository.findAll();
    }
}
