package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.Request;
import com.example.carpool.parking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {

    List<Request> searchByDriverVisa(String driverVisa);
    List<Request> searchByUser(User user);
    List<Request> searchByDriverVisaAndStatus(String driverVisa, String status);
}
