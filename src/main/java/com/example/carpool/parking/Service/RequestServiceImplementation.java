package com.example.carpool.parking.Service;

import com.example.carpool.parking.entities.FreeParking;
import com.example.carpool.parking.entities.Request;
import com.example.carpool.parking.entities.User;
import com.example.carpool.parking.payloads.request.RequestRequest;
import com.example.carpool.parking.payloads.response.MainResponse;
import com.example.carpool.parking.repository.FreeParkingRepository;
import com.example.carpool.parking.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RequestServiceImplementation implements RequestService{

    @Autowired
    RequestRepository requestRepository;

    @Override
    public List<Request> getAllParkingRequest() {
            return requestRepository.findAll();
    }

    @Override
    public MainResponse createParkingRequest(RequestRequest requestRequest) {
        Request newRequest = new Request();
        newRequest.setDate(requestRequest.getDate());
        newRequest.setStatus(requestRequest.getStatus());
        newRequest.setDriverVisa(requestRequest.getDriverVisa());
        newRequest.setUser(requestRequest.getUser());

        requestRepository.save(newRequest);
        return new MainResponse("Requested successfully!, status:Applied");
    }

    @Override
    public List<Request> searchByDriverVisa(String driverVisa) {
        return requestRepository.searchByDriverVisa(driverVisa);
    }

    @Override
    public List<Request> searchByDriverVisaAndStatus(String driverVisa, String status) {
        return requestRepository.searchByDriverVisaAndStatus(driverVisa, status);
    }


    @Override
    public List<Request> searchByUser(User user) {
        return requestRepository.searchByUser(user);
    }




    @Override
    public Optional<Request> updateRequestStatus(Integer requestId, RequestRequest requestRequest) {
        Optional<Request> request = requestRepository.findById(requestId);
        if (request.isEmpty()) {
            //throw new ResourceNotFoundException("Employee", "id", employeeId);
        }
        else
        {
            request.get().setStatus(requestRequest.getStatus());
        }
        requestRepository.save(request.get());
        return request;
    }

    @Override
    public void deleteEmployee(Integer requestId) {
        if (requestRepository.getById(requestId).getRequestId().equals(requestId)){
            requestRepository.deleteById(requestId);
        }
    }


}
