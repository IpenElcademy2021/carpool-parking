package com.example.carpool.parking.repository;

import com.example.carpool.parking.entities.CarOwners;
import com.example.carpool.parking.entities.Request;
import com.example.carpool.parking.entities.User;
import com.example.carpool.parking.entities.UserRequest;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByVisaAndPassword(String visa, String password);
    List<User> findByVisa(String visa);
    List<User> findByCarOwners(CarOwners carOwners);



}
